package top.special.service;

import top.special.pojo.User;

/**
 **禁用和启用用户账号
 * @author SpecialCarp
 * 2020年11月25日 下午9:00:52
 *
 */
public interface DisableUserService {

	/**
	 **禁用或启用用户账号
	 * @param user
	 * @return rows
	 */
	public Integer disableById(User user);

}
