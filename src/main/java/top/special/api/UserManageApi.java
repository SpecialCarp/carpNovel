package top.special.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.special.pojo.User;
import top.special.service.DisableUserService;
import top.special.service.FindUserService;

/**
 **管理员操作用户
 * @author SpecialCarp
 * 2020年11月25日 下午8:59:49
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/back/user")
public class UserManageApi {

	@Autowired
	private FindUserService findUserService;
	@Autowired
	private DisableUserService disableUserService;
	
	@RequestMapping(value = "/findUserAll")
	// 查询所有用户信息
	public PageInfo<User> userList(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, User user){
		// System.out.println(user);
		Integer pageSize=7;//每页显示记录数
		PageHelper.startPage(pageNo, pageSize);// 分页查询
		List<User> userList = findUserService.findAll(user);
		PageInfo<User> pageInfo=new PageInfo<User>(userList);
		return pageInfo;
	}
	
	@RequestMapping(value = "/findDisableUserAll")
	// 查询所有被禁用用户信息
	public PageInfo<User> disableUserList(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, User user){
		// System.out.println(user);
		Integer pageSize=7;//每页显示记录数
		PageHelper.startPage(pageNo, pageSize);// 分页查询
		List<User> userList = findUserService.findDisableAll(user);
		PageInfo<User> pageInfo=new PageInfo<User>(userList);
		return pageInfo;
	}
	
	@RequestMapping(value = "/disableUser")
	// 禁用或启用用户账号
	public Integer userDisable(User user) {
		// System.out.println(user);
		Integer i = disableUserService.disableById(user);
		// System.out.println(i);
		return i;
	}
	
}
