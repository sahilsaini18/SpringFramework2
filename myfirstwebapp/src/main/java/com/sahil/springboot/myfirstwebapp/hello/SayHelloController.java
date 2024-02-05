package com.sahil.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//"say-hello => "Hello! what are you learning today?

	//http://localhost:8080/say-hello
	//	@RequestMapping("say-hello")
	//	@ResponseBody
	//	public String sayHello() {
	//		return "Hello! what are you learning today?";
	//	}
	//
	//	@RequestMapping("say-hello-html")
	//	@ResponseBody
	//	public String sayHelloHtml() {
	//		StringBuffer sb = new StringBuffer();
	//		sb.append("<html>");
	//		sb.append("<head>");
	//		sb.append("<title>My first HTML page with body</title>");
	//		sb.append("</head>");
	//		sb.append("<body>");
	//		sb.append("My first HTML page with body");
	//		sb.append("</body>");
	//		sb.append("</html>");
	//
	//		return sb.toString();
	//	}

	//Using JSP

	@RequestMapping("say-hello-jsp")
	@ResponseBody
	public String sayHelloJsp() {
		return "sayHello";
	}

}
