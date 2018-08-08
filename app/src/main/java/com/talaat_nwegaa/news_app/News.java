package com.talaat_nwegaa.news_app;

public class News {

    private String nTitle ;
    private String nSection;
    private String nDate;
    private String nUrl;
    private String nFields;


    public News(String title,String section,String date,String url,String fields){
        nTitle=title;
        nSection=section;
        nDate=date;
        nUrl=url;
        nFields=fields;
    }
    public String getTitlt(){return nTitle;}
    public String getSection(){return nSection;}
    public String getDate(){return nDate;}
    public String getUrl(){return nUrl;}
    public String getFields(){return nFields;}


}
