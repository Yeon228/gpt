package gpt.study.core.controller;

import gpt.study.core.data.QuestionForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class GPTRequestController{
    @GetMapping("/main")
    public String getMain(Model model){
        QuestionForm questionForm = new QuestionForm();
        questionForm.setQuestion("hello gpt");
        model.addAttribute("questionForm",questionForm);
        return "basic/main";
    }
}