package soucre;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Table extends JTable  {

    private ArrayList<Pathway> paths;

    public Table(ArrayList<Pathway> paths) {


        this.paths = paths;

        // Set the columnNames
        String[] columnNames = {"Index", "Pathway", "Notes", "Total_number_papers", "AD_specific_paper_count", "Pathway_score", "AD_pathway_score", "AD_word_score", "Literature_rank", "AD_specific_paper_rank", "%_papers_AD", "%_dementia", "%_related_dementia", "%_unrelated_dementia", "%_papers_using_full_pathway_name"};

        // Create a default model(so i could add rows)
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Create all of the rows
        for (Pathway p : paths) {
            String[] row = p.getAttributes();
            model.addRow(row);
        }

        this.setModel(model);

    }
}
