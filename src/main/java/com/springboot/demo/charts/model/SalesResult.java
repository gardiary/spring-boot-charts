package com.springboot.demo.charts.model;

import java.util.List;

/**
 * User: gardiary
 * Date: 13/11/17, 14:56
 */
public class SalesResult {
    private String name;
    private List<Integer> data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
