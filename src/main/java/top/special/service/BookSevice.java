package top.special.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import top.special.pojo.Book;
import top.special.pojo.Notify;
import top.special.pojo.Report;

/**
 * 书籍逻辑层
 * @author SpecialCarp
 * 2020年12月3日 上午11:02:15
 *
 */
public interface BookSevice {
	
	/**
	 * 根据一段文字分页查询书籍
	 * @param pageNo
	 * @param book
	 * @return PageInfo<Book>
	 */
	public PageInfo<Book> findByCondition(Integer pageNo, Book book);
	
	/**
	 * 根据上传人查询书籍
	 * @param u_id
	 * @return List<Book>
	 */
	public List<Book> findByUserId(Integer u_id);

	/**
	 * 根据id处理书籍的状态并生成相应的通知
	 * @param notify
	 * @param book
	 * @param reason
	 * @return Integer
	 */
	public Integer releasedById(Notify notify, Book book, String reason);
	
	/**
	 * 根据书籍状态查询书籍举报
	 * @param status
	 * @return
	 */
	public List<Report> findBookReports(Boolean status);
}
