package soucre;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChartPanel extends JPanel {

    private ArrayList<Pathway> paths;

    ChartPanel(ArrayList<Pathway> paths) {
        this.paths = paths;

        this.setPreferredSize(new Dimension(200,200));
        this.setBackground(Color.BLACK);
    }
}
