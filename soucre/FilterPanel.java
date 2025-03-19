package soucre;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class FilterPanel extends JPanel {
    // Create the drop boxes
    String[] filter = {"All","High", "Good", "Ok"};
    String[] sort = {"Alphabetical", "Index", "Total_number_papers"};
    private JComboBox filterBox = new JComboBox(filter);
    private JComboBox sortBox = new JComboBox(sort);
    private List<Pathway> newPathwayList;
    private StatsPanel statsPanel;

    public FilterPanel(ArrayList<Pathway> paths, ScrollPane scrollPane) {

        this.setPreferredSize(new Dimension(200,100));
        this.setBackground(Color.RED);
        this.statsPanel = statsPanel;
        newPathwayList = paths;

        // Add Dropboxes
        this.add(filterBox);
        this.add(sortBox);

        // Add action listener for filter
        filterBox.setSelectedIndex(0);
        filterBox.addActionListener(e ->{
            if (filterBox.getSelectedIndex() == 0) {
                newPathwayList = paths;
                update(scrollPane);
            }
            if (filterBox.getSelectedIndex() == 1) {
                        // Alter the list using streams
                        newPathwayList = paths.stream()
                        .filter(Pathway -> Pathway.getPathwayScore().equals("high"))
                        .toList();
                // Update the scrollPane
                update(scrollPane);

            }
            if (filterBox.getSelectedIndex() == 2) {
                // Alter the list using streams
                newPathwayList = paths.stream()
                        .filter(Pathway -> Pathway.getPathwayScore().equals("good"))
                        .toList();
                // Update the scrollPane
                update(scrollPane);
            }
            if (filterBox.getSelectedIndex() == 3) {
                // Alter the list using streams
                newPathwayList = paths.stream()
                        .filter(Pathway -> Pathway.getPathwayScore().equals("ok"))
                        .toList();
                // Update the scrollPane
                update(scrollPane);
            }


        });

        // Add action listener for sort
        sortBox.addActionListener(e ->{
            if (sortBox.getSelectedIndex() == 0) {

                // Compare based off of the alphabetical order
                newPathwayList = newPathwayList.stream()
                        .sorted(Comparator.comparing(Pathway::getPath))
                        .toList();
                update(scrollPane);

            };
            if (sortBox.getSelectedIndex() == 1) {
                // Compare based off of the index order
                newPathwayList = newPathwayList.stream()
                        .sorted(Comparator.comparing(Pathway::getIndex))
                        .toList();
                update(scrollPane);
            }
            if (sortBox.getSelectedIndex() == 2) {
                //Compare base off of the number of total papers
                newPathwayList = newPathwayList.stream()
                        .sorted(Comparator.comparing(Pathway::getTotalNumberPapers).reversed())
                        .toList();
                update(scrollPane);
            }
        });
    }

    // Getter for the new list
    public List<Pathway> getNewPathwayList() {
        return newPathwayList;
    }

    // Getter for the filterbox
    public JComboBox getFilterBox() {
        return filterBox;
    }

    // update the scroll panes
    public void update(ScrollPane scrollPane) {

       scrollPane.getTable().getModel().setRowCount(0);
        scrollPane.revalidate();
        scrollPane.repaint();

        for(Pathway pathway : newPathwayList) {
            String[] row = pathway.getAttributes();
            scrollPane.getTable().getModel().addRow(row);
        }

        scrollPane.getTable().setModel(scrollPane.getTable().getModel());
        scrollPane.setViewportView(scrollPane.getTable());

        scrollPane.revalidate();
        scrollPane.repaint();






    }




}
