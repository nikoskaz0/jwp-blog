package com.techcourse.myblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/articles")
    public String articles() {
        return "index";
    }

    @GetMapping("/writing")
    public String writing() {
        return "article-edit";
    }
}
