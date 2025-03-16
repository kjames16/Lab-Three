package soucre;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;


public class FilterPanel extends JPanel {
    // Create the drop boxes
    String[] filter = {"All","High", "Good", "Ok"};
    String[] sort = {"Pathway_Score", "Index", "Total_number_papers"};
    private JComboBox filterBox = new JComboBox(filter);
    private JComboBox sortBox = new JComboBox(sort);
    private ArrayList<Pathway> newPathwayList;

    public FilterPanel(ArrayList<Pathway> paths, ScrollPane scrollPane) {

        this.setPreferredSize(new Dimension(200,100));
        this.setBackground(Color.RED);


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

                newPathwayList = paths.stream()
                        .filter(Pathway -> Pathway.getPathwayScore() == "high")
                        .collect(Collectors.toCollection(ArrayList::new));


                update(scrollPane);

            }
            if (filterBox.getSelectedIndex() == 2) {

                newPathwayList = paths.stream()
                        .filter(Pathway -> Pathway.getPathwayScore() == "Ggood")
                        .collect(Collectors.toCollection(ArrayList::new));
                update(scrollPane);
            }
            if (filterBox.getSelectedIndex() == 3) {

                newPathwayList = paths.stream()
                        .filter(Pathway -> Pathway.getPathwayScore() == "ok")
                        .collect(Collectors.toCollection(ArrayList::new));
                update(scrollPane);
            }
        });

        // Add action listener for sort
        sortBox.addActionListener(e ->{
            if (sortBox.getSelectedIndex() == 0) {
                // Custom order for scores
               Map<String, Integer> scoreOrder = Map.of(
                       "high", 1,
                       "good", 2,
                       "ok", 3
               );
                // Compare based off of the scoreOrder
                newPathwayList.stream()
                        .sorted(Comparator.comparing(Pathway -> scoreOrder.get(Pathway.getPathwayScore())))
                        .toList();
                update(scrollPane);

            };
            if (sortBox.getSelectedIndex() == 1) {
                newPathwayList.stream()
                        .sorted(Comparator.comparing(Pathway::getIndex))
                        .toList();
                update(scrollPane);
            }
            if (sortBox.getSelectedIndex() == 2) {
                newPathwayList.stream()
                        .sorted(Comparator.comparing(Pathway::getTotalNumberPapers))
                        .toList();
                update(scrollPane);
            }
        });
    }

    public ArrayList<Pathway> getNewPathwayList() {
        return newPathwayList;
    }

    // update the scroll panes
    public void update(ScrollPane scrollPane) {

        scrollPane.removeAll();
        scrollPane.revalidate();
        scrollPane.repaint();

        //scrollPane.setViewportView(new Table(newPathwayList));
        scrollPane = new ScrollPane(newPathwayList);

        scrollPane.revalidate();
        scrollPane.repaint();






    }

}
