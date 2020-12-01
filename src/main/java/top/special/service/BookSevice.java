package top.special.service;

import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageInfo;

import top.special.pojo.Book;

public interface BookSevice {
	
	public PageInfo<Book> findByCondition(Integer pageNo, 
			Book book, Date oldCreate, Date newCreate);
	
	public List<Book> findByUserId(Integer u_id);

}
