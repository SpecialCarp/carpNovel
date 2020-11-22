package top.special.service;

import java.util.List;

import top.special.pojo.Admin;

public interface FindAdminService {
	
	/**
	 * 查询所有管理员
	 * @return List<Admin>
	 */
	public List<Admin> findAll();

}
