package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich{

    @RequestMapping("/save")
    public String save(@RequestParam(value = "condiment", required = false) String condiment, ModelMap model) {
        model.addAttribute("condiment", condiment);
        return "index";
    }
}