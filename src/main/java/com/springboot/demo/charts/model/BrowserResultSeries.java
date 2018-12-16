package com.springboot.demo.charts.model;

import java.util.List;

/**
 * User: gardiary
 * Date: 13/11/17, 15:31
 */
public class BrowserResultSeries {
    private String name;
    private List<BrowserResult> data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BrowserResult> getData() {
        return data;
    }

    public void setData(List<BrowserResult> data) {
        this.data = data;
    }

}
