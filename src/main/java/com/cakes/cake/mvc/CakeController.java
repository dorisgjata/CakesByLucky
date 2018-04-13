package com.cakes.cake.mvc;
import java.util.HashMap;
import java.util.Map;
import com.cakes.cake.model.Cakes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

            Map<String, String> flavors = new HashMap<String, String>();
			flavors.put("Vanilla", "vanilla");
            flavors.put("White", "white");
            flavors.put("Color dyed", "dyed");
            flavors.put("Chocolate", "chocolate");
            flavors.put("Marble", "marble");
            flavors.put("Red Velvet", "red velvet");
            flavors.put("Strawberry", "strawberry");
            flavors.put("Coffee (special)", "coffee");
            flavors.put("Mocha Chiffon (special)S", "mocha chiffon");
            model.put("flavors", flavors);

            Map<String, String> fillings = new HashMap<String, String>();
			fillings.put("Whipped Cream", "whipped cream");
            fillings.put("Fruits with Whipped Cream", "fruits");
            fillings.put("Fruit Jam", "jam");
            fillings.put("American Buttercream", "american buttercream");
            fillings.put("Banana Cream", "banana cream");
            fillings.put("Creamcheese Frosting", "creamcheese frosting");
            fillings.put("Chocolate Mousse (special)", "chocolate mousse");
            fillings.put("White Cholocate Mousse (special)", "white chocolate mousse");
            fillings.put("Strawberry Mousse (special)", "strawberry mousse");
            fillings.put("Mocha Mousse (special)", "mocha mousse");
            fillings.put("Creamcheese Mousse (special)", "creamcheese mousse");
            fillings.put("Lemon Curd (special)", "lemon curd");
            fillings.put("Chocoalte Ganache (special)", "chocolate ganache");
            fillings.put("Swiss Merengue Buttercream (special)", "swiss merengue buttercream");
            fillings.put("Italian Merengue buttercream (special)", "italian merengue buttercream");
            model.put("fillings", fillings);

            Map<String, String> colors = new HashMap<String, String>();
			colors.put("Mint", "mint");
            colors.put("Orange", "orange");
            colors.put("Pink", "pink");
            colors.put("Red Velvet", "red velvet");
            colors.put("White", "White");
            
            model.put("colors", colors);


		} catch (Exception e) {
			e.printStackTrace();
		}
		return "dropdown";
    }
    @RequestMapping(value="/dropdown",  method=RequestMethod.POST)
    public String getCake(){
        return "dropdown";
    }




}
