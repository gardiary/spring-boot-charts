package com.springboot.demo.charts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by gardiary on 22/01/19.
 */
@Controller
public class HomeController {

  @RequestMapping("/")
  public String home() {
    return "home";
  }

}
