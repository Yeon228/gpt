package gpt.study.core.controller;

import gpt.study.core.data.Answer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class GPTResponseController {
    @PostMapping("/answer")
    public String giveResponse(Model model){
        Answer answer = new Answer();
        answer.setResponse("hi");
        model.addAttribute(answer);
        return "basic/answer";
    }
}
