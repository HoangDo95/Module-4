package com.codegym.controller;

import com.codegym.model.Book;
import com.codegym.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    public Book book = new Book();
    @Autowired
    BookService bookService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        return "/list";
    }

    @GetMapping("/get")
    public String getBook(@RequestParam int id, Model model) throws NullPointerException {
        Book book = bookService.findById(id).orElse(null);
        if (book.getCount() == 0) {
            throw new NullPointerException();
        }
        model.addAttribute("book", bookService.getBook(id));
        return "redirect:/list";
    }

    @GetMapping("/return")
    public String returnBook(@RequestParam int id, Model model) throws Exception {
        Book book = bookService.findById(id).orElse(null);
        if (book.getCount() == 5) {
            throw new Exception();
        }
        model.addAttribute("book", bookService.returnBook(id));
        return "redirect:/list";
    }

    @ExceptionHandler(NullPointerException.class)
    public String showMin() {
        return "/errorMin";

    }

    @ExceptionHandler(Exception.class)
    public String showMax() {
        return "/errorMax";
    }
}
