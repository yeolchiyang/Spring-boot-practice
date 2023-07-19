package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {


    @GetMapping("/articles/new")
    public String newArticleForm(){

        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){//new.mustatche에서 post로 파라미터를 던지면 AricleForm 클래스로 만든 생성자에 파라미터로 던져짐
        System.out.println(form.toString());
        return "";
    }

}
