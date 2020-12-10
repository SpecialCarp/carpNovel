package top.special.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.special.mapper.AdminMapper;
import top.special.pojo.Admin;
import top.special.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	public PageInfo<Admin> findAll(Integer pageNo, Admin admin, Integer access, Date oldCreate, Date newCreate) {
		if(admin.getAccount()=="") {
			admin.setAccount(null);
		}
		if(admin.getName()=="") {
			admin.setName(null);
		}
		// 每页显示记录数
		Integer pageSize=10;
		// 下一个方法使用分页查询
		PageHelper.startPage(pageNo, pageSize);
		List<Admin> adminList = adminMapper.findAdminAll(admin, access, oldCreate, newCreate);
		PageInfo<Admin> pageInfo = new PageInfo<Admin>(adminList);
		return pageInfo;
	}

}
