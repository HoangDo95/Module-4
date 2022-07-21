package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    MusicService musicService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("musicList", musicService.showList());
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("music", new Music());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Music music) {
        musicService.create(music);
        return "redirect:/music";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model) {
        model.addAttribute("music", musicService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Music music) {
        musicService.edit(music.getId(), music);
        return "redirect:/music";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        musicService.delete(id);
        return "redirect:/music";
    }
}
