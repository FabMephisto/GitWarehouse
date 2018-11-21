package com.SpringMVC;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc")
public class MVCController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("say hello");
		return "hello";

	}

	// match automatically
	@RequestMapping("/person")
	public String toPerson(String name, double age) {
		System.out.println(name + " " + age);
		return "hello";
	}

	// pass the parameters to front-end
	@RequestMapping("/show")
	public ModelAndView showPerson() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("person", new Person("person1", 11));
		mav.setViewName("hello");
		return mav;
	}

	// pass the parameters to front-end using ajax
	@RequestMapping("/getPerson")
	public void getPerson(String name, PrintWriter pw) {
		pw.write("hello," + name);
	}

	@RequestMapping("/name")
	public String sayHello() {
		return "name";
	}

	@RequestMapping("/user")
	public @ResponseBody List<Person> get() {
		List ps = new ArrayList<Person>();
		ps.add(new Person("李华", 11));
		ps.add(new Person("韩梅梅", 12));
		ps.add(new Person("李雷", 13));
		return ps;
	}

}
