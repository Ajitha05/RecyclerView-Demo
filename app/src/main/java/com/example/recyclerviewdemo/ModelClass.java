package com.example.recyclerviewdemo;

public class ModelClass {
    private int imageview1;
    private String textView1;
    private String textview2;
    private String textView3;
    private String divider;

    ModelClass(int imageview1, String TextView1, String TextView2,String TextView3,String divider){
        this.imageview1=imageview1;
        this.textView1 = TextView1;
        this.textview2=textview2;
        this.textView3 = TextView3;
        this.divider = divider;


    }

    public int getImageview1(){
        return imageview1;
    }


    public String getTextview1() {
        return textView1;
    }

    public String getDivider()
    {
        return divider;
    }


    public String getTextview2() {
        return textview2;
    }

    public String getTextview3() {
        return textView3;
    }

}

