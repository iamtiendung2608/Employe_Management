package com.example.demo.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.data.Employee;
import com.example.demo.service.EmployeeInterface;

@Controller
public class AddEmpoyeeController {
	@Autowired
	private EmployeeInterface repo;
	@RequestMapping("/add")
	public String addEmploy(@ModelAttribute("employee")Employee employ) {
		return "addEmploy";
	}
	@PostMapping("/add")
	public String SaveToList(@Valid@ModelAttribute("employee")Employee employ
			,BindingResult BR) {
		if(BR.hasErrors()) {
			return "addEmploy";
		}
		repo.save(employ);
		return "redirect:/";
	}
}



