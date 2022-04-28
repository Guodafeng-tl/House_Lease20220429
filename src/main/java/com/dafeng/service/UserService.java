package com.dafeng.service;


import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.bean.User;
import com.dafeng.dao.UserMapper;
import com.dafeng.exception.CommonException;


/** 
* @author 作者 Dafeng
* @version 创建时间：2019年3月3日 上午12:17:30 
* 类说明 
*/
@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	/**
	 * 
	* @author 作者 Dafeng
	* @version 创建时间：2019年3月3日 下午6:28:09 
	* 方法说明
	* 用户登录
	* 
	 */
	public User login(String username, String password) throws CommonException {
		if (StringUtils.isBlank(username)||StringUtils.isBlank(password)) {
			throw CommonException.getException(401);
		}
		User user = userMapper.selectByNamePhoneEmail(username);
		if (user==null || !user.getUserPassword().equals(password)) {
			throw CommonException.getException(402);
		}
		return user;
	}
	
}
