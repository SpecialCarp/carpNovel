package top.special.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.special.mapper.UserMapper;
import top.special.pojo.User;
import top.special.service.FindUserService;

@Service
public class FindUserServiceImpl implements FindUserService {


	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAll(User user) {
		if(user.getAccount() != null && user.getAccount() != "") {
			return userMapper.findUserAllByAccount(user);
		}else if(user.getUsername() != null && user.getUsername() != "") {
			return userMapper.findUserAllByUsername(user);
		}else {
			return userMapper.findUserAll();
		}
	}

	public List<User> findDisableAll(User user) {
		if(user.getAccount() != null && user.getAccount() != "") {
			return userMapper.findDisableUserAllByAccount(user);
		}else if(user.getUsername() != null && user.getUsername() != "") {
			return userMapper.findDisableUserAllByUsername(user);
		}else {
			return userMapper.findDisableUserAll();
		}
	}

}
