package Aula2.lista1.ControllerPagina;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/page")
    public String home(Model model) {
        model.addAttribute("mensagem", "Hello World");
        return "desafio";
    }
}
