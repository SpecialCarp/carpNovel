package top.special.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import top.special.pojo.Admin;

/**
 **管理员数据库操作类
 * @author SpecialCarp
 * 2020年11月20日 上午10:51:35
 */
@Mapper
public interface AdminMapper {

	/**
	 **添加管理员
	 * @param admin(name, account, password, iphone, user_access, book_access, comment_access, booklist_access, create)
	 * @return rows(0:error; 1:success)
	 */
	public Integer sevaAdmin(Admin admin);
	
	/**
	 **禁用或启用管理员账号
	 * @param id
	 * @return rows(0:error; 1:success)
	 */
	public Integer disableAdmin(Integer id);
	
	/**
	 **批量禁用管理员账号
	 * @param ids
	 * @return rows(0:error; >1:success)
	 */
	public Integer disableAdminList(List<Integer> ids);
	
	/**
	 **修改管理员账号信息
	 * @param admin(id, password or iphone)
	 * @return rows(0:error; 1:success)
	 */
	public Integer changeAdminInfoById(Admin admin);
	
	/**
	 **修改管理员权限
	 * @param admin(userAccess, bookAccess, commentAccess, booklistAccess)
	 * @return rows(0:error; 1:success)
	 */
	public Integer changeAdminAccessById(Admin admin);
	
	/**
	 **根据账号密码查询管理员
	 * @param admin
	 * @return
	 */
	@Select("select * from admin where account = #{account} and `password` = #{password} and `status` = 1")
	public Admin findAdminByAccountAndPassword(Admin admin);
	
	/**
	 **根据名字查询管理员
	 * @param admin(name)
	 * @return List<Admin>
	 */
	public List<Admin> findAdminByName(Admin admin);
	
	/**
	 **根据权限查询管理员
	 * @param admin(userAccess, bookAccess, commentAccess, booklistAccess)
	 * @return List<Admin>
	 */
	public List<Admin> findAdminByAccess(Admin admin);
	
	/**
	 **查询全部管理员
	 * @return List<Admin>
	 */
	public List<Admin> findAll
		(@Param("admin") Admin admin, @Param("access") Integer access, 
				@Param("oldCreate") Date oldCreate, @Param("newCreate") Date newCreate);

}
