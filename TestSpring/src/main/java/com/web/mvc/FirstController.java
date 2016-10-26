package com.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by szc on 16/10/26.
 */
@Controller
@RequestMapping("firstController")
public class FirstController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("============================");
        ModelMap map = new ModelMap();
        map.put("dec","chenggongl");
        return "index";
    }

}
