package com.example.thinh.lession16;

/**
 * Created by Thinh on 6/2/2017.
 */

public class Item {
    private int imit;
    private String text;

    public Item() {
    }

    public Item(int imit, String text) {
        this.imit = imit;
        this.text = text;
    }

    public int getImit() {
        return imit;
    }

    public String getText() {
        return text;
    }

    public void setImit(int imit) {
        this.imit = imit;
    }

    public void setText(String text) {
        this.text = text;
    }
}
