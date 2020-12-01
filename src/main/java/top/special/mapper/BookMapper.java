package top.special.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.special.pojo.Book;

@Mapper
public interface BookMapper {

	/**
	 **根据条件查询书籍
	 * @return
	 */
	public List<Book> findByCondition(Book book);
	
	public List<Book> fingByUploader(Integer u_id);
	
}
