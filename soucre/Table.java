package soucre;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Table extends JTable  {

    private ArrayList<Pathway> paths;
    private DefaultTableModel model;

    public Table(ArrayList<Pathway> paths) {


        this.paths = paths;

        // Create the unfiltered column names
        String[] columnNames = {"Index", "Pathway", "Notes", "Total_number_papers", "AD-specific_paper_count", "Pathway_score", "AD-pathway_score", "AD_word_score", "Literature_rank", "AD-specific_paper_rank", "%_papers_AD", "%_dementia", "%_related_dementia", "%_unrelated_dementia", "%_papers_using_full_pathway_name"};


        // Create a default model(so i could add rows)
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        this.model = model;

        // Create all of the rows
        for (Pathway p : paths) {
            String[] row = p.getAttributes();
            model.addRow(row);
        }

        // Create the table
        this.setModel(model);
        this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);// Tried this so the data can be more visible
        this.setGridColor(Color.black);
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setRowSelectionAllowed(true);


    }

    public DefaultTableModel getModel() {
        return model;
    }


}
