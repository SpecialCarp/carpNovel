package top.special.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import top.special.pojo.User;

/**
 **用户Mapper
 * @author SpecialCarp
 * 2020年12月9日 下午4:43:15
 *
 */
@Mapper
public interface UserMapper {

	/**
	 **根据id查询用户
	 * @return User
	 */
	@Select("select * from `user` where id = #{id}")
	public User findUserById(Integer id);

	/**
	 **根据条件查询用户
	 * @param User(account || username, status), oldCreate, newCreate
	 * @return List<User>
	 */
	public List<User> findUserByCondition(@Param("user") User user,@Param("oldCreate") Date oldCreate,@Param("newCreate") Date newCreate);
	
	/**
	 **禁用或启用用户账号
	 * @param id
	 * @return rows
	 */
	@Update("update user set `status` = if(`status`=1,0,1)  where id = #{id}")
	@Options(keyProperty="id", useGeneratedKeys=true)
	public Integer disableUser(Integer id);

	/**
	 **添加用户
	 * @param user
	 * @return rows
	 */
	@Insert("insert `user` into (username, password, sex, `create`) values (#{username}, #{password}, #{sex}, #{create})")
	@Options(keyProperty="id", useGeneratedKeys=true)
	public Integer saveUser(User user);
	
	/**
	 **根据账号密码查询用户
	 * @param user
	 * @return
	 */
	@Select("select * from `user` where account = #{account} and password = #{password}")
	public User findUserByAccountAndPassword(User user);
	
	/**
	 **更新用户数据
	 * @param user
	 * @return
	 */
	@Update("update `user` set username=#{username}, iphone=#{iphone}, email=#{email} where id=50")
	@Options(keyProperty="id", useGeneratedKeys=true)
	public Integer changeUserSetInfoById(User user);
	
}
