package top.special.pojo;

import java.util.List;

/**
 **书架类
 * @author SpecialCarp
 * 2020年11月20日 上午10:35:53
 *
 */
public class Bookshelf {
	
	private String userId;		// 用户主键
	private List<Book> books;	// 书
	
	// 无参构造
	public Bookshelf() {}
	
	@Override
	public String toString() {
		return "Bookshelf [userId=" + userId + ", books=" + books + "]";
	}

	// getter and setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
