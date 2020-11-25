package top.special.mapper;

import java.util.List;

import top.special.pojo.User;

public interface UserMapper {
	
	/**
	 **查询所有用户
	 * @return List<User>
	 */
	public List<User> findUserAll();
	
	/**
	 **根据账号精准查询用户
	 * @param user(account)
	 * @return List<User>
	 */
	public List<User> findUserAllByUsername(User user);
	
	/**
	 **根据用户名模糊查询用户
	 * @param user(username)
	 * @return List<User>
	 */
	public List<User> findUserAllByAccount(User user);

	/**
	 **禁用或启用用户账号
	 * @param user(id)
	 * @return rows
	 */
	public Integer disableUser(User user);

	/**
	 **根据账号精准查询被禁用用户
	 * @param user
	 * @return List<User>
	 */
	public List<User> findDisableUserAllByAccount(User user);

	/**
	 **根据用户名模糊查询被禁用用户
	 * @param user(account)
	 * @return List<User>
	 */
	public List<User> findDisableUserAllByUsername(User user);

	/**
	 **查询所有被禁用的用户
	 * @return List<User>
	 */
	public List<User> findDisableUserAll();

}
