package top.special.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	@Select("select * from `user` where id = #{id}")
	public User findById(Integer id);
	
	/**
	 **禁用或启用用户账号
	 * @param id
	 * @return rows
	 */
	@Update("update user set `status` = if(`status`=1,0,1)  where id = #{id}")
	@Options(useGeneratedKeys=true,keyProperty="userId")
	public Integer disableUser(Integer id);

	/**
	 **添加用户
	 * @param user
	 * @return rows
	 */
	public Integer add(User user);
	
	/**
	 **根据账号密码查询用户
	 * @param user
	 * @return
	 */
	public User findByAccountAndPassword(User user);
	
}
