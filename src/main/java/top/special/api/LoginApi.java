package top.special.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.special.pojo.Admin;
import top.special.service.LoginService;

@RestController
public class LoginApi {
	
	@Autowired
	private LoginService loginService;
//	@Autowired
//	private FindAdminService findAdminService;

	@CrossOrigin
	@RequestMapping(value="/back/index")
	// 管理员登陆
	public Object AdminLogin(Admin a) {
		Admin admin = loginService.adminLogin(a);
		if(admin != null) {
			return admin;
		}else {
			return "NoExist";
		}
	}
	
//	@RequestMapping(value="/list")
//	// 管理员登陆
//	public Object AdminList(@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo) {
//		Integer pageSize=3;//每页显示记录数
//        
//        List<Admin> list = findAdminService.findAll();//分页查询
//        PageHelper.startPage(pageNo, pageSize);
//        List<Admin> list1 = findAdminService.findAll();//分页查询
//        List<Admin> list2 = findAdminService.findAll();//分页查询
////        PageInfo<Admin> pageInfo=new PageInfo<Admin>(list);
//        return list2;
//	}
}