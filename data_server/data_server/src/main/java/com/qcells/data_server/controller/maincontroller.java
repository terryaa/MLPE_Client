package com.qcells.data_server.controller;

import java.util.List;

import com.qcells.data_server.dto.ModulesLog;
import com.qcells.data_server.service.ModulesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class maincontroller {
    

    @Autowired
    ModulesService service;

    @RequestMapping(path="/data",method=RequestMethod.POST)
    @ResponseBody
    public String hello(@RequestBody String str) throws Exception {
        service.parseData(str);
        
        return "index.html";
    }

    
    

}