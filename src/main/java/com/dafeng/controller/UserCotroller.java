package com.dafeng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dafeng.bean.User;
import com.dafeng.exception.CommonException;
import com.dafeng.service.UserService;

/** 
* @author 作者 Dafeng
* @version 创建时间：2019年3月3日 上午12:13:33 
* 类说明 
*/
@Controller
public class UserCotroller {
	
	@Autowired
	UserService userService;
	
	
	/**
	 * 
	* @author 作者 Dafeng
	* @version 创建时间：2019年3月3日 下午3:48:22 
	* 方法说明
	* 客户登录
	 */
	@RequestMapping("/login")
	public Object login(HttpServletRequest request,HttpSession session) {
		String username=request.getParameter("userid");
		String password=request.getParameter("password");
		try {
			User user=userService.login(username,password);
			return "index";
		} catch (CommonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "index2";
		}
		
	}
	
}
