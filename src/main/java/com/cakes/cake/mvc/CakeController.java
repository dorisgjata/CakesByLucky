package com.cakes.cake.mvc;
import java.util.HashMap;
import java.util.Map;

import com.cakes.cake.model.Cakes;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CakeController {

    @RequestMapping("/cake")
    public String cake(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "cake";
    }
    
    @RequestMapping("/dropdown")
    public String postDropdown(Map<String, Object> model, Cakes cake) {
		try {
			Map<String, String> shapes = new HashMap<String, String>();
			shapes.put("Circular", "circular");
			shapes.put("Square", "square");
            model.put("shapes", shapes);

            Map<Integer, String> tiers = new HashMap<Integer, String>();
			tiers.put(1, "1");
            tiers.put(2, "2");
            tiers.put(3, "3");
            model.put("tiers", tiers);
            
            Map<String, String> drips = new HashMap<String, String>();
			drips.put("Chocolate", "chocolate");
			drips.put("Creamchese", "creamcheese");
            model.put("drips", drips);

            Map<String, String> borders = new HashMap<String, String>();
			borders.put("Rose", "rose");
            borders.put("Swirl", "swirl");
            borders.put("White", "white");
            model.put("borders", borders);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "dropdown";
	}

}