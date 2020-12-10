package top.special.service;

import java.util.List;

import top.special.pojo.Admin;
import top.special.pojo.User;

/**
 **登录
 * @author SpecialCarp
 * 2020年11月20日 下午4:26:46
 *
 */
public interface LoginService {
	
	/**
	 **管理员登录
	 * @param admin(account, password)
	 * @return admin
	 */
	public Admin adminLogin(Admin admin);

	/**
	 **用户登录
	 * @param user(account, password)
	 * @return user
	 */
	public List<Object> userLogin(User user);
}
