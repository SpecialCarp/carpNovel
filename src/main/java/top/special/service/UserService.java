package top.special.service;

import java.util.Date;

import com.github.pagehelper.PageInfo;

import top.special.pojo.User;

public interface UserService {

	public PageInfo<User> findByCondition(Integer pageNo, User user, Date oldCreate, Date newCreate);
	
	public Integer disableUser(Integer id);
}
