package org.bins.ssm.web.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *  author  bins
 *  date 17-4-19
 */
@RequestMapping("/")
@Controller
public class HomeController {
    private static final String PAGE_INDEX = "index";

    @RequestMapping
    public String index() {
        return PAGE_INDEX;
    }
}
