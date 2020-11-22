package top.special.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.special.pojo.User;
import top.special.service.FindUserService;

@RestController
@CrossOrigin
public class UserManageApi {

	@Autowired
	private FindUserService findUserService;
	
	@RequestMapping(value = "/findUserAll")
	// 查询所有用户信息
	public List<User> userList(){
		List<User> userList = findUserService.findAll();
		return userList;
	}
	
}
