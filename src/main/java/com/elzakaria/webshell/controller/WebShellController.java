package com.elzakaria.webshell.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Main controller
 */
@Controller
@RequestMapping("/")
public class WebShellController {

    @GetMapping("shell")
    public ModelAndView goToShellPage(final ModelAndView modelAndView) {
        modelAndView.setViewName("shell");
        return modelAndView;
    }
}
