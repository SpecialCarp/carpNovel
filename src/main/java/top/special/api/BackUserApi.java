package top.special.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.special.pojo.User;
import top.special.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/back/user")
public class BackUserApi {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/findUser")
	public Object findByCondition
		(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, 
				User user, Date oldCreate, Date newCreate) {
		return userService.findByCondition(pageNo, user, oldCreate, newCreate);
	}
	
}
