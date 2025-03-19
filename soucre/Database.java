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


        //Make the Table
        Table table = new Table(pathways);

        // Create a scrollPane so all of the data can be viewed
        ScrollPane scrollPane = new ScrollPane(pathways);

        frame.add(scrollPane, BorderLayout.WEST);


        // Add the filter panel
        FilterPanel filterPanel = new FilterPanel(pathways,scrollPane);
        frame.add(filterPanel, BorderLayout.NORTH);

        // Add the detail panel
        DetailPanel detailPanel = new DetailPanel(filterPanel.getNewPathwayList(),scrollPane,filterPanel);
        frame.add(detailPanel, BorderLayout.EAST);

        StatsPanel statPanel = new StatsPanel(filterPanel.getNewPathwayList(),filterPanel);
        frame.add(statPanel, BorderLayout.CENTER);


        frame.setVisible(true);


    }



}
