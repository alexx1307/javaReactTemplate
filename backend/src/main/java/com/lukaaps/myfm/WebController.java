package com.lukaaps.myfm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lukas on 15.01.2017.
 */

@Controller
public class WebController {
    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
}
