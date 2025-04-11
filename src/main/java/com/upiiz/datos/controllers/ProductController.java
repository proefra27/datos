package com.upiiz.datos.controllers;


import com.upiiz.datos.models.ProductModel;
import com.upiiz.datos.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String products(Model model) {
        List<ProductModel> productos = productService.findAll();
        model.addAttribute("productos", productos);
        return "listado-productos";
    }

    @GetMapping("/products/new")
    public String mostrarFormularioProduct(Model model) {
        ProductModel producto = new ProductModel();
        model.addAttribute("producto", producto);
        return "agregar-producto";
    }

    @PostMapping("/products/guardar")
    public String guardarProducto(@ModelAttribute ProductModel producto) {
        productService.save(producto);
        return "redirect:/products";
    }

    @GetMapping("/products/delete/{id}")
    public String mostrarFormularioEliminarProducto(@PathVariable int id,
                                                    Model model) {
        ProductModel producto = productService.findById(id);
        model.addAttribute("producto", producto);
        return "eliminar-producto";
    }

    @PostMapping("/products/delete")
    public String eliminarProducto(@ModelAttribute ProductModel producto) {
        productService.delete(producto.getId());
        return "redirect:/products";
    }

    @GetMapping("/products/edit/{id}")
    public String mostrarFormularioEditarProducto(@PathVariable int id,
                                                  Model model) {
        ProductModel producto = productService.findById(id);
        model.addAttribute("producto", producto);
        return "editar-producto";
    }

    @PostMapping("/products/edit")
    public String editarProducto(@ModelAttribute ProductModel producto) {
        productService.update(producto);
        return "redirect:/products";
    }


}
