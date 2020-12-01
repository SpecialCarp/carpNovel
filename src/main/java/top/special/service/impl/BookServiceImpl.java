package top.special.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.special.mapper.BookMapper;
import top.special.pojo.Book;
import top.special.service.BookSevice;

@Service
public class BookServiceImpl implements BookSevice{

	@Autowired
	private BookMapper bookMapper;
	
	public PageInfo<Book> findByCondition(Integer pageNo, 
			Book book, Date oldCreate, Date newCreate) {
		if(book.getTitle()=="") {
			book.setTitle(null);
		}
		if(book.getAuthor()=="") {
			book.setAuthor(null);
		}
		// 每页显示记录数
		Integer pageSize=10;
		// 下一个方法使用分页查询
		PageHelper.startPage(pageNo, pageSize);
		List<Book> bookList = bookMapper.findByCondition(book);
		// 处理分页查询的详细信息
		PageInfo<Book> pageInfo=new PageInfo<Book>(bookList);
		return pageInfo;
	}

	public List<Book> findByUserId(Integer u_id) {
		return bookMapper.fingByUploader(u_id);
	}

}
