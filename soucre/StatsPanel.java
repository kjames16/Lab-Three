package soucre;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StatsPanel extends JPanel {

    private ArrayList<Pathway> paths;

    StatsPanel(ArrayList<Pathway> paths) {
        this.paths = paths;

        // Set up the panel
        this.setPreferredSize(new Dimension(200,100));
        this.setBackground(Color.BLUE);

    }
}
