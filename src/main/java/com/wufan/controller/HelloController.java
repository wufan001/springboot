package com.wufan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wufan
 *         Created by wu on 2022/11/29.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/helloword")
    public String HelloWord(){
        return  "HelloWord";
    }
}
