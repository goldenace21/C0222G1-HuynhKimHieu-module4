package com.example.controller;

import com.example.model.Music;
import com.example.service.MusicApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MusicController {

    @Autowired
    private MusicApplicationService musicApplicationService;

    @GetMapping("/")
    public String goList(Model model) {
        model.addAttribute("musics", musicApplicationService.getAll());
        return "/list-music";
    }

    @GetMapping("/create")
    public String goFormCreate(Model model) {
        model.addAttribute("music", new Music());
        return "/form-create";
    }

    @PostMapping("/create")
    public String create(Music music) {
        musicApplicationService.save(music);
        return "redirect:/";
    }

    @GetMapping("/update/{name}")
    public String goFormUpdate(@PathVariable String name, Model model) {
        model.addAttribute("music", musicApplicationService.getByName(name));
        return "/form-update";
    }

    @PostMapping("/update")
    public String update(Music music) {
        musicApplicationService.update(music);
        return "redirect:/";
    }

    @GetMapping("/delete/{name}")
    public String delete(@PathVariable String name) {
        musicApplicationService.delete(musicApplicationService.getByName(name));
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(String name, Model model) {
        model.addAttribute("musics", musicApplicationService.searchByName(name));
        return "/list-music";
    }
}
