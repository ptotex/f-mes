package com.fwy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fwy.model.Student;
import com.fwy.service.TestService;

@Controller
@RequestMapping("/hellotest")
public class TestController {
	@Resource
	private TestService testService;

	@RequestMapping("/test")
	public ModelAndView set() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("log");
		return mv;
	}

	@RequestMapping("/add")
	public ModelAndView get(Student s) {
		System.out.println(s);
		testService.add(s);
		return null;
	}
}
