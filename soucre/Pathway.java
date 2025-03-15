package soucre;

public class Pathway {


    // All of the attributes to one object
    // pc == %
    private String index;
    private String path;
    private String notes;
    private String total_number_papers;
    private String ad_specifc_paper_count;
    private String pathway_score;
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
        this.pathway_score = Pathway_score;
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


    // Method to put all of the attributes into one array
    public String[] getAttributes() {
        String[] attributes = { index, path, notes, total_number_papers, ad_specifc_paper_count, pathway_score, ad_pathway_score, ad_word_score, literature_rank, ad_specific_paper_rank, pc_papers_ad, pc_dementia, pc_related_dementia, pc_unrelated_dementia, pc_papers_using_full_pathway_name};
        return attributes;
    }
}
