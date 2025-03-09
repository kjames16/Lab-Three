package soucre;

public class Pathway {


    // All of the attributes to one object
    // pc == %
    private String index;
    private String path;
    private String notes;
    private String total_number_papers;
    private String ad_specifc_paper_count;
    private String Pathway_score;
    private String ad_pathway_score;
    private String ad_word_score;
    private String literature_rank;
    private String ad_specific_paper_rank;
    private String pc_papers_ad;
    private String pc_dementia;
    private String pc_related_dementia;
    private String pc_unrelated_dementia;
    private String pc_papers_using_full_pathway_name;

    // Constructor

    public Pathway(String index, String path, String notes, String total_number_papers, String ad_specifc_paper_count, String Pathway_score, String ad_pathway_score,
    String ad_word_score, String literature_rank, String ad_specific_paper_rank, String pc_papers_ad, String pc_dementia, String pc_related_dementia, String pc_unrelated_dementia, String pc_papers_using_full_pathway_name) {

        this.index = index;
        this.path = path;
        this.notes = notes;
        this.total_number_papers = total_number_papers;
        this.ad_specifc_paper_count = ad_specifc_paper_count;
        this.Pathway_score = Pathway_score;
        this.ad_pathway_score = ad_pathway_score;
        this.ad_word_score = ad_word_score;
        this.literature_rank = literature_rank;
        this.ad_specific_paper_rank = ad_specific_paper_rank;
        this.pc_papers_ad = pc_papers_ad;
        this.pc_dementia = pc_dementia;
        this.pc_related_dementia = pc_related_dementia;
        this.pc_unrelated_dementia = pc_unrelated_dementia;
        this.pc_papers_using_full_pathway_name = pc_papers_using_full_pathway_name;
    }

    // Getters

    public String getIndex() {
        return index;
    }

    public String getPath() {
        return path;
    }

    public String getNotes() {
        return notes;
    }

    public String getTotal_number_papers() {
        return total_number_papers;
    }

    public String getAd_specifc_paper_count() {
        return ad_specifc_paper_count;
    }

    public String getPathway_score() {
        return Pathway_score;
    }

    public String getAd_pathway_score() {
        return ad_pathway_score;
    }

    public String getAd_word_score() {
        return ad_word_score;
    }

    public String getLiterature_rank() {
        return literature_rank;
    }

    public String getAd_specific_paper_rank() {
        return ad_specific_paper_rank;
    }

    public String getPc_papers_ad() {
        return pc_papers_ad;
    }

    public String getPc_dementia() {
        return pc_dementia;
    }

    public String getPc_related_dementia() {
        return pc_related_dementia;
    }

    public String getPc_unrelated_dementia() {
        return pc_unrelated_dementia;
    }

    public String getPc_papers_using_full_pathway_name() {
        return pc_papers_using_full_pathway_name;
    }
}
