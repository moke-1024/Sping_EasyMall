package com.easymall.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("first...controller...");
        ModelAndView mav = new ModelAndView();
        mav.addObject("k1","v1");
        mav.addObject("k2","v2");
        mav.addObject("k3","v3");
        mav.setViewName("first");
        return mav;
    }
}
