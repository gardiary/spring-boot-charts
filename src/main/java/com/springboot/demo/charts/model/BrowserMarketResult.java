package com.springboot.demo.charts.model;

import java.util.List;

/**
 * User: gardiary
 * Date: 13/11/17, 15:25
 */
public class BrowserMarketResult {
    private String title;
    private List<BrowserResultSeries> series;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<BrowserResultSeries> getSeries() {
        return series;
    }

    public void setSeries(List<BrowserResultSeries> series) {
        this.series = series;
    }
}
