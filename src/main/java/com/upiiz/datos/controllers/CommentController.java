package com.upiiz.datos.controllers;

import com.upiiz.datos.models.CommentModel;
import com.upiiz.datos.models.ProductModel;
import com.upiiz.datos.services.CommentService;
import com.upiiz.datos.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ProductService productService;

    @GetMapping("/comments")
    public String comments(Model model) {
        return "listado-comentarios";
    }

    @GetMapping("/comments/product/{id}")
    public String productComments(Model model, @PathVariable int id) {
        List<CommentModel> commentModels = commentService.findCommentsProductById(id);
        ProductModel productModel = productService.findById(id);

        CommentModel comentario = new CommentModel();
        comentario.setIdProduct(id);

        model.addAttribute("producto", productModel);
        model.addAttribute("comentarios", commentModels);
        model.addAttribute("comentario", comentario);
        return "listado-comentarios";
    }

    @PostMapping("/comments/guardar")
    public String guardarComment(CommentModel comentario) {
        commentService.save(comentario);
        return "redirect:/comments/product/" + comentario.getIdProduct();
    }
}
