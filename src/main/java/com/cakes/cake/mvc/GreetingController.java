package com.cakes.cake.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/main")
    public String main(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "main";
    }
     @RequestMapping("/desserts")
    public String indedx() {
        return "desserts";
    }
    @RequestMapping("/AMainPage")
    public String main() {
        return "AMainPage";
    }
    @RequestMapping("/cir")
    public String cir() {
        return "cir";
    }

    @RequestMapping("/cir-1")
    public String cir1() {
        return "cir-1";
    }
    @RequestMapping("/cir-2")
    public String cir2() {
        return "cir-2";
    }
    @RequestMapping("/cir-3")
    public String cir3() {
        return "cir-3";
    }

    @RequestMapping("/cir-1-cho")
    public String cir1cho() {
        return "cir-1-cho";
    }
    @RequestMapping("/cir-2-cho")
    public String cir2cho() {
        return "cir-2-cho";
    }
    @RequestMapping("/cir-3-cho")
    public String cir3cho() {
        return "cir-3-cho";
    }
    @RequestMapping("/cir-1-cho-wht")
    public String cir1chowht() {
        return "cir-1-cho-wht";
    }
    @RequestMapping("/cir-2-cho-wht")
    public String cir2chowht() {
        return "cir-2-cho-wht";
    }
    @RequestMapping("/cir-3-cho-wht")
    public String cir3chowht() {
        return "cir-3-cho-wht";
    }

    @RequestMapping("/cir-1-crm")
    public String cir1crm() {
        return "cir-1-crm";
    }

    @RequestMapping("/cir-2-crm")
    public String cir2crm() {
        return "cir-2-crm";
    }
    @RequestMapping("/cir-3-crm")
    public String cir3crm() {
        return "cir-3-crm";
    }

    @RequestMapping("/cir-1-crm-wht")
    public String cir1crmwht() {
        return "cir-1-crm-wht";
    }

    @RequestMapping("/cir-2-crm-wht")
    public String cir2crmwht() {
        return "cir-2-crm-wht";
    }
    @RequestMapping("/cir-3-crm-wht")
    public String cir3crmwht() {
        return "cir-3-crm-wht";
    }

    @RequestMapping("/cir-1-crm-ros")
    public String cir1crmros() {
        return "cir-1-crm-ros";
    }

    @RequestMapping("/cir-2-crm-ros")
    public String cir2crmros() {
        return "cir-2-crm-ros";
    }
    @RequestMapping("/cir-3-crm-ros")
    public String cir3crmros() {
        return "cir-3-crm-ros";
    }
    @RequestMapping("/cir-1-crm-swr")
    public String cir1crmswr() {
        return "cir-1-crm-swr";
    }

    @RequestMapping("/cir-2-crm-swr")
    public String cir2crmswr() {
        return "cir-2-crm-swr";
    }
    @RequestMapping("/cir-3-crm-swr")
    public String cir3crmswr() {
        return "cir-3-crm-swr";
    }
    @RequestMapping("/sqr")
    public String sqr() {
        return "sqr";
    }
    @RequestMapping("/sqr-1")
    public String sqr1() {
        return "sqr-1";
    }
    @RequestMapping("/sqr-2")
    public String sqr2() {
        return "sqr-2";
    }
    @RequestMapping("/sqr-3")
    public String sqr3() {
        return "sqr-3";
    }
    @RequestMapping("/sqr-1-cho")
    public String sqr1cho() {
        return "sqr-1-cho";
    }
    @RequestMapping("/sqr-2-cho")
    public String sqr2cho() {
        return "sqr-2-cho";
    }
    @RequestMapping("/sqr-3-cho")
    public String sqr3cho() {
        return "sqr-3-cho";
    }
    @RequestMapping("/sqr-1-crm")
    public String sqr1crm() {
        return "sqr-1-crm";
    }
    @RequestMapping("/sqr-2-crm")
    public String sqr2crm() {
        return "sqr-2-crm";
    }
    @RequestMapping("/sqr-3-crm")
    public String sqr3crm() {
        return "sqr-3-crm";
    }
    @RequestMapping("/sqr-1-crm-wht")
    public String sqr1crmwht() {
        return "sqr-1-crm-wht";
    }

    @RequestMapping("/sqr-2-crm-wht")
    public String sqr2crmwht() {
        return "sqr-2-crm-wht";
    }
    @RequestMapping("/sqr-3-crm-wht")
    public String sqr3crmwht() {
        return "sqr-3-crm-wht";
    }

    @RequestMapping("/sqr-1-crm-ros")
    public String sqr1crmros() {
        return "sqr-1-crm-ros";
    }

    @RequestMapping("/sqr-2-crm-ros")
    public String sqr2crmros() {
        return "sqr-2-crm-ros";
    }
    @RequestMapping("/sqr-3-crm-ros")
    public String sqr3crmros() {
        return "sqr-3-crm-ros";
    }
    @RequestMapping("/sqr-1-crm-swr")
    public String sqr1crmswr() {
        return "sqr-1-crm-swr";
    }

    @RequestMapping("/sqr-2-crm-swr")
    public String sqr2crmswr() {
        return "sqr-2-crm-swr";
    }
    @RequestMapping("/sqr-3-crm-swr")
    public String sqr3crmswr() {
        return "sqr-3-crm-swr";
    }
    
}