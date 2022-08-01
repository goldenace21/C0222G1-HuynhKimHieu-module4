package com.example.exam_m4.controller;

import com.example.exam_m4.model.QuestionContent;
import com.example.exam_m4.service.QuestionContentService;
import com.example.exam_m4.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionTypeService questionTypeService;

    @Autowired
    private QuestionContentService questionContentService;

    @RequestMapping
    public String goListQuestion(Model model) {
        model.addAttribute("contents", questionContentService.findAll());
        model.addAttribute("types", questionTypeService.findAll());
        return "/content";
    }

    @GetMapping("/create")
    public String goFormCeate(Model model){
        model.addAttribute("question", new QuestionContent());
        model.addAttribute("types", questionTypeService.findAll());
        return "/create";
    }

    @PostMapping("/create")
    public String create(QuestionContent questionContent){
        questionContent.setStatus(false);
        questionContent.setStatusDelete(0);
        questionContentService.save(questionContent);
        return "redirect:/question";
    }

//    @GetMapping("/Search")
//    public String search(Model model, @RequestParam(name = "title", defaultValue = "")) {
//        model.addAttribute("contents",questionContentService.findAllByTitleAndType());
//        return "/content";
//    }

    @GetMapping("/delete")
    public String delete(@RequestParam(name = "id") Integer id) {
        questionContentService.delete(id);
        return "redirect:/question";
    }
}
