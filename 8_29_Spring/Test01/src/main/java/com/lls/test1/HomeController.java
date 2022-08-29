package com.lls.test1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("GsHouse", "거제도입니다!");
	return "home";
	}
	@RequestMapping("/breed")
	public String breed() {
		return "breed";
	}
	@RequestMapping("/age")
	public String age() {
		return "age";
	}
}
