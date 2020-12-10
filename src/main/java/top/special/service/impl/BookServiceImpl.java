package top.special.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.special.mapper.BookMapper;
import top.special.mapper.ChapterMapper;
import top.special.mapper.ClassifyMapper;
import top.special.mapper.CommentMapper;
import top.special.mapper.NotifyMapper;
import top.special.mapper.ReportMapper;
import top.special.pojo.Book;
import top.special.pojo.Chapter;
import top.special.pojo.Notify;
import top.special.pojo.Report;
import top.special.service.BookSevice;

@Service
public class BookServiceImpl implements BookSevice{

	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private NotifyMapper notifyMapper;
	@Autowired
	private ReportMapper reportMapper;
	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private ClassifyMapper classifyMapper;
	@Autowired
	private ChapterMapper chapterMapper;
	
	public PageInfo<Book> findByCondition(Integer pageNo, Book book) {
		if(book.getTitle()=="") { book.setTitle(null); }
		if(book.getAuthor()=="") { book.setAuthor(null); }
		if(book.getIntroducty()=="") { book.setIntroducty(null); }
		Integer pageSize=10;	// 每页显示记录数
		PageHelper.startPage(pageNo, pageSize);	// 下一个方法使用分页查询
		List<Book> bookList = bookMapper.findBookByConditionResultBookWhithUploader(book);
		PageInfo<Book> pageInfo=new PageInfo<Book>(bookList);	// 处理分页查询的详细信息
		return pageInfo;
	}

	public List<Book> findByUserId(Integer u_id) {
		return bookMapper.fingBookByUploader(u_id);
	}

	public Integer releasedById(Notify notify, Book book, String reason) {
		System.out.println(notify.getReport());
		if(notify.getReport() != null) {
			reportMapper.changeReportSetStatusById(notify.getReport().getId());
		}
		notifyMapper.saveNotify(notify);
		Integer rows = bookMapper.releasedBookById(book);
		return rows;
	}
	
	public List<Report> findBookReports(Boolean status){
		return reportMapper.findReportByPojoIdResultReportWithPojo(1,status);
	}
	
	public List<Book> findBookByUId(Integer u_id){
		return bookMapper.findBookByUId(u_id);
	}

	public Map<String,Object> findBookByIdResultPojo(Integer b_id, Integer chapter_last, Integer comment_last){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("bookInfo", bookMapper.findBookById(b_id));
		map.put("classifies",classifyMapper.findClassifyByBId(b_id));
		map.put("lastChapter",chapterMapper.findChapterByBIdResultLastChapter(b_id, chapter_last));
		map.put("lastComment",commentMapper.findCommentByBIdResultLastComment(b_id, comment_last));
		return map;
	}
	
	public List<Chapter> findChapterByBId(Integer b_id){
		return chapterMapper.findChapterByBIdResultLastChapter(b_id, null);
	}

	public Chapter findChapterByCIdResultChapterWithContent(Integer c_id) {
		return chapterMapper.findChapterByIdResultChapterWithContent(c_id);
	}

	public Integer bookSaveBookShelf(Integer u_id, Integer b_id) {
		return bookMapper.saveBookInBookshelf(u_id, b_id);
	}

	public Integer bookShelfDelbook(Integer u_id, Integer b_id) {
		return bookMapper.delBookForBookshelf(u_id, b_id);
	}

	public Integer saveBookReport(Report report, Integer b_id, Integer u_id) {
		report.setCreate(new Date());
		return reportMapper.saveReport(report, 1, b_id, u_id);
	}
	
}
