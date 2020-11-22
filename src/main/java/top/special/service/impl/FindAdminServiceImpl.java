package top.special.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.special.mapper.AdminMapper;
import top.special.pojo.Admin;
import top.special.service.FindAdminService;

@Service
public class FindAdminServiceImpl implements FindAdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	public List<Admin> findAll() {
		return adminMapper.findAdminAll();
	}

}
