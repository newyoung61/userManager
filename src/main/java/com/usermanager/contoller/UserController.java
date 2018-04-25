package com.usermanager.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.usermanager.entity.JsonResult;
import com.usermanager.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	@ResponseBody
	public JsonResult toListUser(){
		JsonResult  jsonResult =new JsonResult(userService.getUsers());
		System.out.println("controller");
		return jsonResult;
	}
	
}
