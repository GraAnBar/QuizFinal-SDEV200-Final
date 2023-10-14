package com.example.QuizFinal;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {
    
    @RequestMapping("/testers")
    public List<testStation> globaltestStation(){
        List<testStation> list = new ArrayList<>();
        
        list.add(new testStation (1, "Chris", 2345));
        list.add(new testStation (2, "Jill", 3395));
        list.add(new testStation (3, "Ashley", 0216));
        list.add(new testStation (4, "Leon", 7495));
        return list;
    }
}
