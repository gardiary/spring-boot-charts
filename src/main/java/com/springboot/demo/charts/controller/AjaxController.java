package com.springboot.demo.charts.controller;

import com.springboot.demo.charts.model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: gardiary
 * Date: 12/11/17, 21:31
 */
@RestController
public class AjaxController {

    @RequestMapping("/ajax/worldwide_sales_result")
    public WorldwideSalesResult worldwideSalesResult() {
        List<String> saleYears = new ArrayList<String>();
        saleYears.add("Year 2015");
        saleYears.add("Year 2010");
        saleYears.add("Year 2005");
        saleYears.add("Year 2000");

        List<SalesResult> salesResults = new ArrayList<SalesResult>();

        for(String saleYear : saleYears) {
            SalesResult salesResult = new SalesResult();
            salesResult.setName(saleYear);
            salesResult.setData(buildSalesData());

            salesResults.add(salesResult);
        }



        WorldwideSalesResult result = new WorldwideSalesResult();
        result.setTitle("Worldwide Sales Year 2000 - 2015");
        result.setCategories(buildSalesCategories());
        result.setSeries(salesResults);

        return result;
    }

    @RequestMapping("/ajax/browser_market_result")
    public BrowserMarketResult browserMarketResult() {
        List<String> saleYears = new ArrayList<String>();
        saleYears.add("Year 2015");
        saleYears.add("Year 2010");
        saleYears.add("Year 2005");
        saleYears.add("Year 2000");

        List<SalesResult> salesResults = new ArrayList<SalesResult>();

        for(String saleYear : saleYears) {
            SalesResult salesResult = new SalesResult();
            salesResult.setName(saleYear);
            salesResult.setData(buildSalesData());

            salesResults.add(salesResult);
        }

        BrowserMarketResult result = new BrowserMarketResult();
        result.setTitle("Browser Market Shares January, 2017 to October, 2017");
        result.setSeries(buildBrowserMarketData());

        return result;
    }

    private List<String> buildSalesCategories() {
        List<String> categories = new ArrayList<String>();

        categories.add("Africa");
        categories.add("America");
        categories.add("Asia");
        categories.add("Europe");
        categories.add("Oceania");

        return categories;
    }

    private List<Integer> buildSalesData() {
        Random rnd = new Random();

        List<Integer> salesData = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            salesData.add(rnd.nextInt(5000) + 1);
        }

        return salesData;
    }

    private List<BrowserResultSeries> buildBrowserMarketData() {
        List<BrowserResultSeries> results = new ArrayList<BrowserResultSeries>();

        BrowserResultSeries result = new BrowserResultSeries();
        result.setName("Brands");


        List<BrowserResult> browserResults = new ArrayList<BrowserResult>();

        BrowserResult browserResult = new BrowserResult();
        browserResult.setName("Chrome");
        browserResult.setY(40.5);
        browserResults.add(browserResult);

        browserResult = new BrowserResult();
        browserResult.setName("Internet Explorer");
        browserResult.setY(19.25);
        browserResults.add(browserResult);

        browserResult = new BrowserResult();
        browserResult.setName("Safari");
        browserResult.setY(20.15);
        browserResults.add(browserResult);

        browserResult = new BrowserResult();
        browserResult.setName("Opera");
        browserResult.setY(8.55);
        browserResult.setSliced(true);
        browserResult.setSelected(true);
        browserResults.add(browserResult);

        browserResult = new BrowserResult();
        browserResult.setName("Chrome");
        browserResult.setY(11.55);
        browserResults.add(browserResult);

        result.setData(browserResults);

        results.add(result);

        return results;
    }

}
