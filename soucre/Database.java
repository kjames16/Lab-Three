package soucre;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Database {

    public static void main(String[] args) throws IOException {

        //Create the JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SupTable4");
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Create an Array of pathways from the file
        ArrayList<Pathway> pathways = FileReader.readFile();

        // Create the table
        Table table = new Table(pathways);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);// Tried this so the data can be more visible
        table.setGridColor(Color.black);


        // Create a scrollPane so all of the data can be viewed
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBackground(Color.RED);
        scrollPane.setPreferredSize(new Dimension(500, 500));
        frame.add(scrollPane, BorderLayout.WEST);


        // Add the filter panel
        FilterPanel filterPanel = new FilterPanel();
        frame.add(filterPanel, BorderLayout.NORTH);

        // Add the stat panel
        StatsPanel statsPanel = new StatsPanel(pathways);
        frame.add(statsPanel, BorderLayout.EAST);

        // Add the chart panel
        ChartPanel chartPanel = new ChartPanel(pathways);
        frame.add(chartPanel, BorderLayout.CENTER);

        frame.setVisible(true);


    }
}
