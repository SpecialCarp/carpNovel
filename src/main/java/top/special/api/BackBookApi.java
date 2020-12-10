package top.special.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import top.special.pojo.Admin;
import top.special.pojo.Book;
import top.special.pojo.Notify;
import top.special.pojo.Report;
import top.special.pojo.User;
import top.special.service.BookSevice;

@CrossOrigin
@RestControllerAdvice
@RequestMapping("/back/book")
public class BackBookApi {

	@Autowired
	private BookSevice bookSevice;
	
	@RequestMapping(value = "/findBookByUId")
	public List<Book> findBookByUserId(Integer u_id){
		return bookSevice.findByUserId(u_id);
	}
	
	@RequestMapping(value = "/findBook")
	public Object findBookByCondition(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, Book book){
		return bookSevice.findByCondition(pageNo, book);
	}
	
	@RequestMapping(value = "/releasedBook")
	public Integer releasedBookById
		(Notify notify, Admin admin,User user, Book book, Report report, 
				Integer a_id, Integer u_id, Integer b_id, Integer r_id, 
				String reason, Integer statu) {
		admin.setId(a_id);
		user.setId(u_id);
		if(r_id != null) {
			report.setId(r_id);
			notify.setReport(report);
		}
		System.out.println(a_id+","+u_id+","+b_id+","+r_id+","+reason+","+statu);
		notify.setAdmin(admin);
		notify.setUser(user);
		notify.setContent(reason);
		notify.setCreate(new Date());
		book.setId(b_id);
		book.setStatus(statu);
		return bookSevice.releasedById(notify, book, reason);
	}
	
	@RequestMapping(value = "/findBookReports")
	public List<Report> findBookReports(Boolean status){
		System.out.println(status);
		System.out.println(bookSevice.findBookReports(status));
		return bookSevice.findBookReports(status);
	}
	
}
