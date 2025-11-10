package com.fatec.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/categorias")
    public String categorias() {
        return "categorias";
    }

    @GetMapping("/produto")
    public String produto() {
        return "produto";
    }

    @GetMapping("/conta")
    public String conta() {
        return "conta";
    }
}
