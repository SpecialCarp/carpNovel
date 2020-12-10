package top.special.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import top.special.pojo.Book;
import top.special.pojo.Chapter;
import top.special.pojo.Notify;
import top.special.pojo.Report;

/**
 **书籍逻辑层
 * @author SpecialCarp
 * 2020年12月3日 上午11:02:15
 *
 */
public interface BookSevice {
	
	/**
	 **根据一段文字分页查询书籍
	 * @param pageNo
	 * @param book
	 * @return PageInfo<Book>
	 */
	public PageInfo<Book> findByCondition(Integer pageNo, Book book);
	
	/**
	 **根据上传人查询书籍
	 * @param u_id
	 * @return List<Book>
	 */
	public List<Book> findByUserId(Integer u_id);

	/**
	 **根据id处理书籍的状态并生成相应的通知
	 * @param notify
	 * @param book
	 * @param reason
	 * @return Integer
	 */
	public Integer releasedById(Notify notify, Book book, String reason);
	
	/**
	 **根据书籍状态查询书籍举报
	 * @param status
	 * @return
	 */
	public List<Report> findBookReports(Boolean status);
	
	/**
	 **根据用户id查询用户书架上的书
	 * @param u_id
	 * @return
	 */
	public List<Book> findBookByUId(Integer u_id);
	
	/**
	 **根据id查询书籍，最后一章和最后c_last条评论
	 * @param b_id
	 * @param c_last
	 * @return
	 */
	public Map<String,Object> findBookByIdResultPojo(Integer b_id, Integer chapter_last, Integer comment_last);
	
	/**
	 **根据id查询所有章节
	 * @param b_id
	 * @return
	 */
	public List<Chapter> findChapterByBId(Integer b_id);
	
	/**
	 **根据章节id查询内容
	 * @param c_id
	 * @return
	 */
	public Chapter findChapterByCIdResultChapterWithContent(Integer c_id);
	
	/**
	 **添加书籍到书架
	 * @param u_id
	 * @param b_id
	 * @return
	 */
	public Integer bookSaveBookShelf(Integer u_id, Integer b_id);
	
	/**
	 **将书从书架上移除
	 * @param u_id
	 * @param b_id
	 * @return
	 */
	public Integer bookShelfDelbook(Integer u_id, Integer b_id);
	
	/**
	 **生成书籍举报
	 * @param report
	 * @param pojoId
	 * @param p_id
	 * @param u_id
	 * @return
	 */
	public Integer saveBookReport(Report report, Integer b_id, Integer u_id);
	
}
