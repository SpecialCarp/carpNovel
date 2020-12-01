package top.special.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import top.special.pojo.User;
import top.special.service.UserService;

@RestControllerAdvice
@CrossOrigin
@RequestMapping("/back/user")
public class BackUserApi {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/findUser")
	public Object findByCondition
		(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, 
				User user, Date oldCreate, Date newCreate) {
		System.out.println(pageNo+","+user+","+oldCreate+","+newCreate);
		return userService.findByCondition(pageNo, user, oldCreate, newCreate);
	}
	
	@RequestMapping("/findEnableUser")
	public Object findEnableByCondition
		(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, 
				User user, Date oldCreate, Date newCreate) {
		user.setStatus(true);
		return userService.findByCondition(pageNo, user, oldCreate, newCreate);
	}
	
	@RequestMapping("/findDisableUser")
	public Object findDisableByCondition
		(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, 
				User user, Date oldCreate, Date newCreate) {
		user.setStatus(false);
		return userService.findByCondition(pageNo, user, oldCreate, newCreate);
	}
	
	@RequestMapping("/findAuthor")
	public Object findAuthor
		(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, 
				User user, Date oldCreate, Date newCreate) {
		user.setAuthor(true);
		return userService.findByCondition(pageNo, user, oldCreate, newCreate);
	}
	
	@RequestMapping("/disableUser")
	public Integer disableUser(Integer id) {
		return userService.disableUser(id);
	}
	
}
