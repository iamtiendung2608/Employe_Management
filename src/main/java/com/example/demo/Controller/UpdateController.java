package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.data.Employee;
import com.example.demo.service.EmployeeInterface;

@Controller
public class UpdateController {
	@Autowired
	private EmployeeInterface repo;
	@RequestMapping("/update/{id}")
	public String UpdateEmploy(@PathVariable("id")int id, Model model) {
		model.addAttribute("employ", repo.findById(id).orElse(null));
		return "UpdateEmploy";
	}
}




