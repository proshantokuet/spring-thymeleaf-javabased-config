/**
 * 
 */
package com.proshanto.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proshanto.spring.service.Person;

/**
 * @author proshanto
 */
@Controller
public class HomeController {
	
	@Autowired
	private Person person;
	
	@RequestMapping("/home")
	public String showHome(Model model) {
		
		System.err.println("some thing");
		model.addAttribute("name", "Tom");
		model.addAttribute("formatted", "<b>blue</b>");
		return "home";
	}
	
	@RequestMapping("/")
	public String showview(Model model) {
		person.setName("Partho prothim");
		System.err.println(person.getName());
		
		System.err.println("some thing");
		model.addAttribute("name", "Tom");
		model.addAttribute("formatted", "<b>blue</b>");
		
		return "home";
	}
}
