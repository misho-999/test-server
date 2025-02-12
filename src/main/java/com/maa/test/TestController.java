/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maa.test;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author misho_999
 */
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public List<TestModel> test() {
        TestModel t1 = new TestModel();
        t1.setTest("Backend is here");
        TestModel t2 = new TestModel();
        t2.setTest("Backend WORK");
        List<TestModel> test = new ArrayList<>();
        test.add(t1);
        test.add(t2);
        return test;
    }
}
