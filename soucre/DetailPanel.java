package soucre;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DetailPanel extends JPanel {

    private ArrayList<Pathway> paths;
    private Pathway selected;

    DetailPanel(ArrayList<Pathway> paths, ScrollPane scrollPane) {
        this.paths = paths;

        // Set up the panel
        this.setPreferredSize(new Dimension(200,100));
        this.setBackground(Color.BLUE);

        scrollPane.getTable().getSelectionModel().addListSelectionListener(e -> {

            revalidate();
            repaint();
            if (!e.getValueIsAdjusting()) {
                int row = scrollPane.getTable().getSelectedRow();
                if (row != -1) {
                    selected = paths.get(row);
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
