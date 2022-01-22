package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.EmployeeInterface;

@Controller
public class DeleteController {
	@Autowired
	private EmployeeInterface repo;
	@RequestMapping("/delete/{id}")
	public String DeleteEmploy(@PathVariable("id")int id) {
		repo.deleteById(id);
		return "redirect:/";
	}
}





