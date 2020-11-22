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
	
	public List<User> findAll() {
		return userMapper.findUserAll();
	}

}
