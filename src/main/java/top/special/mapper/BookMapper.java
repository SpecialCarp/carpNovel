package top.special.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.special.pojo.Book;

/**
 * 书籍类Mapper
 * @author SpecialCarp
 * 2020年12月3日 上午10:56:47
 *
 */
@Mapper
public interface BookMapper {

	/**
	 * 根据一段文字查询书籍
	 * @param book
	 * @return List<Book>
	 */
	public List<Book> findByCondition(Book book);
	
	/**
	 * 根据上传人查询书籍
	 * @param u_id
	 * @return List<Book>
	 */
	public List<Book> fingByUploader(Integer u_id);
	
	/**
	 * 设置书籍状态(0:禁用;1:已发布;2:待发布;3:未发布)
	 * @param book
	 * @return rows
	 */
	public Integer releasedById(Book book);
	
	public Book findById(Integer id);
	
}
