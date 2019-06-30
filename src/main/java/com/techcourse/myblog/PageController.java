package com.techcourse.myblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String index(String blogName, Model model) {
        model.addAttribute("blogName", blogName);
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
