package soucre;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.util.List;


public class StatsPanel extends JPanel {

    private List<Pathway> paths;

    StatsPanel(List<Pathway> pathways, FilterPanel filterPanel) {
        this.paths = pathways;
        //Create the panel
        this.setPreferredSize(new Dimension(200,200));
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        // Allow the panel to update after the filter is changed
        // It has to be clicked twice for it to work and I do not know why
        filterPanel.getFilterBox().addActionListener(e -> {
            update(filterPanel.getNewPathwayList());
        });


    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("---- Stats ----", 20, 20);
        //First Stat
        double avgTotalPapers;
        double sumTotalPapers = 0;
        //Second stat
        double avgPathwayScore;
        double sumPathwayScore = 0;
        //Third stat
        int maxTotalPapers = 0;
        for (Pathway p : paths) {
            //Sum up the total number of papers
            sumTotalPapers += p.getTotalNumberPapers();
            // Sum up all of the pathway scores
            //sumPathwayScore += p.getAdPathwayScore();

            // Find the biggest number for total number of papers
            if(p.getTotalNumberPapers() > maxTotalPapers) {
                maxTotalPapers = p.getTotalNumberPapers();
            }

        }
        avgTotalPapers = sumTotalPapers/paths.size();
        avgPathwayScore = sumPathwayScore/paths.size();

        //Round the two values
        BigDecimal roundedTotalPapers = new BigDecimal(avgTotalPapers).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal roundedPathwayScore = new BigDecimal(avgPathwayScore).setScale(2, BigDecimal.ROUND_HALF_UP);

        g.drawString("Average Total Papers: " + roundedTotalPapers, 20, 40);
        g.drawString("Average Pathway Score: " + roundedPathwayScore, 20, 60);
        g.drawString("Max Total Papers: " + maxTotalPapers, 20, 80);
        g.drawString("Click the Filter twice for stats to appear. (I can't figure out how to fix this)", 20, 120);
    }

    public void update(List<Pathway> paths) {
        this.paths = paths;
        revalidate();
        repaint();
    }
}
