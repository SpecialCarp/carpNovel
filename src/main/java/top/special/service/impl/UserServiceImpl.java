package top.special.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.special.mapper.UserMapper;
import top.special.pojo.User;
import top.special.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User findUserById(Integer id) {
		return userMapper.findUserById(id);
	}
	
	public PageInfo<User> findByCondition(Integer pageNo, User user, Date oldCreate, Date newCreate) {
		if(user.getAccount()=="") {
			user.setAccount(null);
		}
		if(user.getUsername()=="") {
			user.setUsername(null);
		}
		// 每页显示记录数
		Integer pageSize=10;
		// 下一个方法使用分页查询
		PageHelper.startPage(pageNo, pageSize);
		List<User> userList = userMapper.findUserByCondition(user, oldCreate, newCreate);
		// 处理分页查询的详细信息
		PageInfo<User> pageInfo=new PageInfo<User>(userList);
		
		// List<User> userAllList = userMapper.findByCondition(user, oldCreate, newCreate);
		
		// List<Object> list = new ArrayList<Object>();
		
		// list.add(pageInfo);
		// list.add(userAllList);
		
		return pageInfo;
	}

	public Integer disableUser(Integer id) {
		return userMapper.disableUser(id);
	}

	public Integer changeUserInfo(User user) {
		return userMapper.changeUserSetInfoById(user);
	}

}
