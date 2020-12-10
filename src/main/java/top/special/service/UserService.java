package top.special.service;

import java.util.Date;

import com.github.pagehelper.PageInfo;

import top.special.pojo.User;

/**
 **用户逻辑层
 * @author SpecialCarp
 * 2020年12月3日 上午11:00:25
 *
 */
public interface UserService {

	/**
	 **根据id查询用户信息
	 * @param id
	 * @return
	 */
	public User findUserById(Integer id);
	
	/**
	 **根据条件分页查询用户
	 * @param pageNo
	 * @param user
	 * @param oldCreate
	 * @param newCreate
	 * @return PageInfo<User>
	 */
	public PageInfo<User> findByCondition(Integer pageNo, User user, Date oldCreate, Date newCreate);
	
	/**
	 **根据id禁用用户
	 * @param id
	 * @return rows
	 */
	public Integer disableUser(Integer id);
	
	/**
	 **修改用户信息
	 * @param user
	 * @return
	 */
	public Integer changeUserInfo(User user);
	
}
