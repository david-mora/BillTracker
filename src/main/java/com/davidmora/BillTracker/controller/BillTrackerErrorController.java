package com.davidmora.BillTracker.controller;

import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BillTrackerErrorController implements ErrorController {

    private ErrorAttributes errorAttributes;
    private final static String ERROR_PATH = "/error";

    public BillTrackerErrorController(ErrorAttributes errorAttributes){
        this.errorAttributes = errorAttributes;
    }

    @GetMapping(ERROR_PATH)
    public String error(){
        return "error.html";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
