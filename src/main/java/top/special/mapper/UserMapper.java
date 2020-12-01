package top.special.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import top.special.pojo.User;

@Mapper
public interface UserMapper {

	/**
	 **根据条件查询用户
	 * @param User(account || username, status), oldCreate, newCreate
	 * @return List<User>
	 */
	public List<User> findByCondition(@Param("user") User user,@Param("oldCreate") Date oldCreate,@Param("newCreate") Date newCreate);

	/**
	 **根据id查询用户
	 * @return User
	 */
	public User findById(Integer id);
	
	/**
	 **禁用或启用用户账号
	 * @param id
	 * @return rows
	 */
	public Integer disableUser(Integer id);

}
