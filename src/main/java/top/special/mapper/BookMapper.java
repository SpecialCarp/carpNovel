package top.special.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	@Select("select * from `book` where `status` != 3 and uploader = #{u_id}")
	public List<Book> fingByUploader(Integer u_id);
	
	/**
	 * 设置书籍状态(0:禁用;1:已发布;2:待发布;3:未发布)
	 * @param book
	 * @return rows
	 */
	@Update("update book set `status` = #{status} where id = #{id}")
	@Options(useGeneratedKeys=true,keyProperty="userId")
	public Integer releasedById(Book book);
	
	/**
	 **根据id查询书籍
	 * @param id
	 * @return
	 */
	@Select("select * from book where `status` != 3 and id = #{id}")
	public Book findById(Integer id);
	
	/**
	 **根据用户id查询用户书架上的书
	 * @param u_id
	 * @return
	 */
	@Select("select book.* from book,bookshelf where book.id = bookshelf.book_id and bookshelf.user_id = #{u_id}")
	public List<Book> findByUId(Integer u_id);
	
}
