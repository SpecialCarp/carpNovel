package top.special.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import top.special.pojo.Book;
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
	public Object findBookByCondition(@RequestParam(defaultValue="1",required=true,value="pageNo")Integer pageNo, 
			Book book, Date oldCreate, Date newCreate){
		return bookSevice.findByCondition(pageNo, book, oldCreate, newCreate);
	}
}
