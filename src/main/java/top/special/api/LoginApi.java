package top.special.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.special.pojo.Admin;
import top.special.pojo.User;
import top.special.service.LoginService;

@CrossOrigin
@RestController
public class LoginApi {
	
	@Autowired
	private LoginService loginService;

	// 管理员登陆
	@RequestMapping(value="/back/index")
	public Object AdminLogin(Admin a) {
		Admin admin = loginService.adminLogin(a);
		if(admin != null) {
			return admin;
		}else {
			return "NoExist";
		}
	}
	
	// 用户登录
	@RequestMapping(value = "/front/index")
	public Object UserLogin(User u) {
		List<Object> list = loginService.userLogin(u);
		if(list != null) {
			return list;
		}else {
			return "NoExist";
		}
	}
	
}