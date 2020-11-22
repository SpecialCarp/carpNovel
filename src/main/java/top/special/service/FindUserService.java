package top.special.service;

import java.util.List;

import top.special.pojo.User;

public interface FindUserService {
	
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> findAll();
}
