package top.special.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import top.special.pojo.Admin;
import top.special.service.AdminService;

@CrossOrigin
@RestControllerAdvice
@RequestMapping("/back/admin")
public class BackAdminApi {
	
	@Autowired
	public AdminService adminService;
	
	@RequestMapping("/findAll")
	public Object findAdminAll
		(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, 
				Admin admin, Integer access, Date oldCreate, Date newCreate) {
		System.out.println(admin.getName());
		return adminService.findAll(pageNo, admin, access, oldCreate, newCreate);
	}

}
