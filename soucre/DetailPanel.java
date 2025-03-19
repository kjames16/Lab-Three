package soucre;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DetailPanel extends JPanel {

    private List<Pathway> paths;
    private Pathway selected;

    DetailPanel(List<Pathway> paths, ScrollPane scrollPane, FilterPanel filterPanel) {
        this.paths = paths;


        // Set up the panel
        this.setPreferredSize(new Dimension(200,100));
        this.setBorder(BorderFactory.createLineBorder(Color.black));


        scrollPane.getTable().getSelectionModel().addListSelectionListener(e -> {

            this.paths = filterPanel.getNewPathwayList();
            revalidate();
            repaint();
            if (!e.getValueIsAdjusting()) {
                int row = scrollPane.getTable().getSelectedRow();
                if (row != -1) {
                    selected = this.paths.get(row);
                }
            }
        });

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(".  ---- Details ----",10,10);
        int y = 30;
        if (selected != null) {
            for (String attribute : selected.getAttributes()) {
                g.drawString(attribute,10,y);
                y += 20;
            }

        }
    }
}
