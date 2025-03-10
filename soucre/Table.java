package soucre;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Table extends JTable {

    private ArrayList<Pathway> paths;

    public Table(ArrayList<Pathway> paths) {

        this.paths = paths;

        // Set the columnNames
        String[] columnNames = {"Index", "Pathway", "Notes", "Total_number_papers", "AD_specific_paper_count", "Pathway_score", "AD_pathway_score", "AD_word_score", "Literature_rank", "AD_specific_paper_rank", "%_papers_AD", "%_dementia", "%_related_dementia", "%_unrelated_dementia", "%_papers_using_full_pathway_name"};

        // Create a default model(so i could add rows)
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Create all of the rows
        for (Pathway p : paths) {
            String[] row = {p.getIndex(), p.getPath(), p.getNotes(), p.getTotal_number_papers(), p.getAd_specifc_paper_count(), p.getPathway_score(),
                    p.getAd_pathway_score(), p.getAd_word_score(), p.getLiterature_rank(), p.getAd_specific_paper_rank(), p.getPc_papers_ad(), p.getPc_dementia(),
                    p.getPc_related_dementia(), p.getPc_unrelated_dementia(), p.getPc_papers_using_full_pathway_name()};
            model.addRow(row);
        }

        this.setModel(model);

    }
}
