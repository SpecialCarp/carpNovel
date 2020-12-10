package top.special.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import top.special.pojo.Book;
import top.special.pojo.Chapter;
import top.special.pojo.Report;
import top.special.service.BookSevice;

@CrossOrigin
@RestControllerAdvice
@RequestMapping("/front/book")
public class FrontBookApi {

	@Autowired
	private BookSevice bookSevice;
	
	@RequestMapping("/findBookShelf")
	public List<Book> findBookByUId(Integer u_id){
		return bookSevice.findBookByUId(u_id);
	}
	
	@RequestMapping("/findBookById")
	public Object findBookById
		(Integer b_id, @RequestParam(defaultValue="1", required=true,value="chapter_last") Integer chapter_last,
				@RequestParam(defaultValue="3",required=true,value="comment_last") Integer comment_last) {
		return bookSevice.findBookByIdResultPojo(b_id, chapter_last, comment_last);
	}
	
	@RequestMapping("/findChapterByBId")
	public List<Chapter> findChapterByBId(Integer b_id){
		return bookSevice.findChapterByBId(b_id);
	}
	
	@RequestMapping("/findChapterByCId")
	public Chapter findChapterByCId(Integer c_id) {
		return bookSevice.findChapterByCIdResultChapterWithContent(c_id);
	}
	
	@RequestMapping("bookShelfSaveBook")
	public Integer bookShelfSaveBook(Integer u_id ,Integer b_id) {
		return bookSevice.bookSaveBookShelf(u_id, b_id);
	}
	
	@RequestMapping("bookShelfDelBook")
	public Integer bookShelfDelBook(Integer u_id ,Integer b_id) {
		return bookSevice.bookShelfDelbook(u_id, b_id);
	}
	
	@RequestMapping("/reportBook")
	public Integer reportBook(Report report, Integer b_id, Integer u_id) {
		return bookSevice.saveBookReport(report, b_id, u_id);
	}
	
}
