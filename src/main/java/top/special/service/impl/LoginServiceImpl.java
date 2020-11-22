package top.special.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.special.mapper.AdminMapper;
import top.special.pojo.Admin;
import top.special.pojo.User;
import top.special.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdminMapper adminMapper;

	public Admin adminLogin(Admin admin) {
		return adminMapper.findAdminByAccountAndPassword(admin);
	}

	public User userLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
