package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){//1.파라미터를 넣기 위해 Model클래스를 매개변수로 넣고
        model.addAttribute("username", "김종율"); //2.이 부분을 추가
        return "greetings"; //templates/greetings.mustache ->브라우저로 전송!
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "김종율");
        return "goodbye";
    }
}
