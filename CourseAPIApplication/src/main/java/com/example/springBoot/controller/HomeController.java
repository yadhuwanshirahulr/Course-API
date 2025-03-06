package com.example.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

		@RequestMapping("/hello")
		public String sayHi() {
			return "Rom Rom Bhaiyo";
		}
}
