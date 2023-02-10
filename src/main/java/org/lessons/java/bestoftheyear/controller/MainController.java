package org.lessons.java.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")

public class MainController {
	@GetMapping()
	@ResponseBody
	public String index(Model model) {
		model.addAttribute("myName", "bestemmie");
		return "index";
	}
}
