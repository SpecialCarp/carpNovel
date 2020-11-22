package top.special.mapper;

import java.util.List;

import top.special.pojo.User;

public interface UserMapper {
	
	/**
	 **查询所有用户
	 * @return
	 */
	public List<User> findUserAll();

}
