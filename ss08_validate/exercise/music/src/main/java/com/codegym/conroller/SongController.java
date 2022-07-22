package com.codegym.conroller;

import com.codegym.dto.SongDto;
import com.codegym.model.Song;
import com.codegym.service.SongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("songList", songService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("song", new SongDto());
        return "/create";
    }

    @PostMapping("/save")
    public String createFrom(@Validated @ModelAttribute("song") SongDto songDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);
            songService.save(song);
            return "redirect:/song";
        }
    }

    @GetMapping("/{id}/edit")
    public String showFormUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("songDto", songService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(@Validated @ModelAttribute("song") SongDto songDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "/edit";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto, song);
            songService.update(song);
            return "redirect:/song";
        }
    }
}
