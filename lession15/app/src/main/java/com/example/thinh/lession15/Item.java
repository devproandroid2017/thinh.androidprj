package com.example.thinh.lession15;

/**
 * Created by Thinh on 5/26/2017.
 */

public class Item {
    private int imit;
    private String name;
    private int percent;
    private String type;
    private Boolean check;

    public Item() {
    }

    public Item(int imit, String name, int percent, String type, Boolean check) {
        this.imit = imit;
        this.name = name;
        this.percent = percent;
        this.type = type;
        this.check = check;
    }

    public int getImit() {
        return imit;
    }

    public String getName() {
        return name;
    }

    public int getPercent() {
        return percent;
    }

    public String getType() {
        return type;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setImit(int imit) {
        this.imit = imit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}
