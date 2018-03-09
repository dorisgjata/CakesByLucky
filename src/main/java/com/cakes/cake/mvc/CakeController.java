package com.cakes.cake.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CakeController {

    @RequestMapping("/cake")
    public String cake(@RequestParam(value="cake", required=false, defaultValue="World") String cake, Model model) {
        model.addAttribute("cakes");
        return "cake";
    };

    @RequestMapping("/contact")
    public String contact(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "contact";
    };
    

}