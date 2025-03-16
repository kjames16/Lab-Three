package soucre;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ScrollPane extends JScrollPane {
    private Table table;
    private ArrayList<Pathway> pathways;

    public ScrollPane(ArrayList<Pathway> pathways) {
        super(new Table(pathways));
        this.pathways = pathways;



        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(500, 500));

    }
}
