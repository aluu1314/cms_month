package com.shenjialong.cms.service;

import javax.validation.Valid;

import com.shenjialong.cms.entity.User;

public interface UserService {

	User getUserByUsername(String username);

	int register(@Valid User user);

	/**
	 * 登录操作
	 * @param user
	 * @return
	 */
	User login(User user);

}
