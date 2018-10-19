package com.example.kecloakDEMO2;

import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class KecloakDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KecloakDemoApplication.class, args);
	}
}


@Controller
class ProductController {

	@GetMapping(path = "/products")
	public String getProducts(Model model){
		model.addAttribute("products", Arrays.asList("iPad","iPhone","iPod"));
		return "products";
	}

	@GetMapping(path = "/products1")
	public String getProducts1(Model model){
		model.addAttribute("products", Arrays.asList("iPad","iPhone","iPod"));
		return "products";
	}

	
	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}
}