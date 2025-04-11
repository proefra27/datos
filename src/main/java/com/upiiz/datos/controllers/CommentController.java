package com.upiiz.datos.controllers;

import com.upiiz.datos.models.CommentModel;
import com.upiiz.datos.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public String comments(Model model) {
        return "listado-comentarios";
    }

    @GetMapping("/comments/product/{id}")
    public String productComments(Model model, @PathVariable int id) {
        List<CommentModel> commentModels = commentService.findCommentsProductById(id);
        model.addAttribute("comentarios", commentModels);
        return "listado-comentarios";
    }
}
