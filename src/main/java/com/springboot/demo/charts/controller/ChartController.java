package com.springboot.demo.charts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * User: gardiary
 * Date: 12/11/17, 21:31
 */
@Controller
public class ChartController {

    @RequestMapping("/charts")
    public String charts(Map<String, Object> model) {
        return "charts";
    }

}
