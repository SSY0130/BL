package com.ssy.bl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping(value="/")
	@ResponseBody
	public String sample() {
		return "Hello Spring Boot~!!";
	}
}
