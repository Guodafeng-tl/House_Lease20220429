package com.dafeng.service;


import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.bean.User;
import com.dafeng.dao.UserMapper;
import com.dafeng.exception.CommonException;


/** 
* @author ���� Dafeng
* @version ����ʱ�䣺2019��3��3�� ����12:17:30 
* ��˵�� 
*/
@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	/**
	 * 
	* @author ���� Dafeng
	* @version ����ʱ�䣺2019��3��3�� ����6:28:09 
	* ����˵��
	* �û���¼
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
