package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.data.Employee;
import com.example.demo.service.EmployeeInterface;
;
@Controller
public class IntroController {
	@Autowired
	private EmployeeInterface repo;
	@RequestMapping("/")
	public String Intro(Model model) {
		model.addAttribute("employee", repo.findAll());
		return "List-Employee";
	}
}





