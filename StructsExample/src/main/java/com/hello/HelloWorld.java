package com.hello;
import com.opensymphony.xwork2.*;
public class HelloWorld extends ActionSupport {

	private static final long serialVersionUID = 1L;
   public String execute() {
	  System.out.println("success");
	return "Success";
   }
}
