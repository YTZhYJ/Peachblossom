package com.pytd.db.dao.impl;

import com.pytd.db.dao.AuthUserDao;

public class AuthUserDaoImpl implements AuthUserDao {

	AuthUserDao authUserDao;

	public AuthUserDao getAuthUserDao() {
		return authUserDao;
	}

	public void setAuthUserDao(AuthUserDao authUserDao) {
		this.authUserDao = authUserDao;
	}
	
}
