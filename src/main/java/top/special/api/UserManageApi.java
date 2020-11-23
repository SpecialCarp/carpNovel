package top.special.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.special.pojo.User;
import top.special.service.FindUserService;

@RestController
@CrossOrigin
@RequestMapping("/back/user")
public class UserManageApi {

	@Autowired
	private FindUserService findUserService;
	
	@RequestMapping(value = "/findUserAll/{pageNo}")
	// 查询所有用户信息
	public PageInfo<User> userList( @PathVariable Integer pageNo, User user, Date oldCreate, Date newCreate){
		Integer pageSize=4;//每页显示记录数
		PageHelper.startPage(pageNo, pageSize);// 分页查询
		List<User> userList = findUserService.findAll();
		PageInfo<User> pageInfo=new PageInfo<User>(userList);
		return pageInfo;
	}
	
}
