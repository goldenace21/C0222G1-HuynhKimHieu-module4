package com.example.music.controller;

import com.example.music.model.Music;
import com.example.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @RequestMapping("/")
    public String goList(Model model) {
        model.addAttribute("musis", musicService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("music", new Music());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@Valid Music music, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/create";
        }
        musicService.save(music);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String goFormUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("music",musicService.findById(id));
        return "/update";
    }

    @PostMapping("/update")
    public String update(@Valid Music music, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/update";
        }
        musicService.save(music);
        return "redirect:/";
    }
}
