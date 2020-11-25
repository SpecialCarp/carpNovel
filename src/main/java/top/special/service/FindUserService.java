package top.special.service;

import java.util.List;

import top.special.pojo.User;

/**
 **查询用户
 * @author SpecialCarp
 * 2020年11月25日 下午8:58:04
 *
 */
public interface FindUserService {
	
	/**
	 **根据条件查询所有用户
	 **有账号条件就不走用户名
	 **若没有条件则返回所有
	 * @return List<User>
	 */
	public List<User> findAll(User user);

	/**
	 **根据条件查询所有被禁用用户
	 **有账号条件就不走用户名
	 **若没有条件则返回所有
	 * @return List<User>
	 */
	public List<User> findDisableAll(User user);
}
