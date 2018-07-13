package com.suxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by suxy on 2018/7/9.
 */
@Controller
public class PicController {

    @RequestMapping(value ="/home")
    public String index(){
        return "index";
    }
}
