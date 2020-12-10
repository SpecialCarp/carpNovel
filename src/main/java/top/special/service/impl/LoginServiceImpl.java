package top.special.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.special.mapper.AdminMapper;
import top.special.mapper.BookMapper;
import top.special.mapper.UserMapper;
import top.special.pojo.Admin;
import top.special.pojo.User;
import top.special.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdminMapper adminMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private BookMapper bookMapper;

	public Admin adminLogin(Admin admin) {
		return adminMapper.findAdminByAccountAndPassword(admin);
	}

	public List<Object> userLogin(User u) {
		User user = userMapper.findUserByAccountAndPassword(u);
		if(user != null) {
			List<Object> list = new ArrayList<Object>();
			list.add(user);
			list.add(bookMapper.findBookByUId(user.getId()));
			return list;
		}
		return null;
	}
	
	
}
