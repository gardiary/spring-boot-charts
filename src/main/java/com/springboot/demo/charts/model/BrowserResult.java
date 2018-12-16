package com.springboot.demo.charts.model;

/**
 * User: gardiary
 * Date: 13/11/17, 15:26
 */
public class BrowserResult {
    private String name;
    private Double y;
    private boolean sliced;
    private boolean selected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public boolean isSliced() {
        return sliced;
    }

    public void setSliced(boolean sliced) {
        this.sliced = sliced;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
