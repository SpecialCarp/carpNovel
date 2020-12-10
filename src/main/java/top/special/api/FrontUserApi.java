package top.special.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import top.special.pojo.User;
import top.special.service.UserService;

@CrossOrigin
@RestControllerAdvice
@RequestMapping("/front/user")
public class FrontUserApi {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/findUserInfo")
	public User findUserInfo(Integer id) {
		return userService.findUserById(id);
	}
	
	@RequestMapping("/changeUserInfo")
	public Integer changeUserInfo(User user) {
		return userService.changeUserInfo(user);
	}
	
}
