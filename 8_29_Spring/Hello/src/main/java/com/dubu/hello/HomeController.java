package com.dubu.hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//@Controller는 이 객체로 클라이언트의 요청에 대해서 응답하겠다는 의미
@Controller
public class HomeController {

	// 해당 context에  root 요청이 왔을 때 이 메소드로 응답하겠다는 의미
	/*
	 *  HttpServletRequest, HttpServletResponse, HttpSession 
	 *  등의 객체가 메소드 안에서 필요할때  
	 *  필요한 객체를 전달받을 매개변수를 선언만 해 놓으면 자동으로 객체가 전달된다.
	 */
	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		//request 영역에 weatherToday라는 키값으로 String type 담기
		request.setAttribute("weatherToday", "오늘의 날씨는 흐림!");
		/*
		 * 	여기서 리턴한 문자열의 
		 * 	접두어로 "/WEB-INF/view/" 
		 * 	접미어로 ".jsp" 
		 * 	가 붙게 된다. 
		 * 
		 * "/WEB-INF/vies/"+"home"+".jsp"
		 * 
		 * 결과적으로 "/WEB-INF/views/home.jsp" 가 되어서
		 * 해당 jsp 페이지로 forward 이동 되어서 응답하게 된다.
		 */
		return "home";
	}
	// "/study" 경로의 요청이 왔을 때 이 메소드를 이용해서 응답을 하겠다는 의미
	@RequestMapping("/study")
	public String study() {
		
		// /WEB-INF/views/study.jsp 페이지로 forward 이동해서 응답하겠다는 의미
		return "study";
	}
	@RequestMapping("/play")
	public String play() {
		return "play";
	}
}