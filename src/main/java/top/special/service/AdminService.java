package top.special.service;

import java.util.Date;

import com.github.pagehelper.PageInfo;

import top.special.pojo.Admin;

public interface AdminService {

	public PageInfo<Admin> findAll(Integer pageNo, Admin admin, Integer access, Date oldCreate, Date newCreate);
	
}
