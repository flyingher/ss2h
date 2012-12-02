package com.flyingh.action;

import java.util.Date;

import org.springframework.stereotype.Controller;

import com.flyingh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class RegAction extends ActionSupport {
	private static final long serialVersionUID = 1354628176648418440L;
	private static final String SUCCESS = "success";
	private UserService userService;
	private String username;
	private String password;
	private Date birthday;

	public String execute() {
		System.out.println(userService);
		return SUCCESS;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public static String getSuccess() {
		return SUCCESS;
	}
}
