package top.special.pojo;

import java.util.Date;
import java.util.List;

/**
 **书单类
 * @author SpecialCarp
 * 2020年11月20日 上午10:34:51
 *
 */
public class Booklist {

	private Integer id;			// 主键
	private String title;		// 标题
	private String introducty;	// 简介
	private String userId;		// 创建人
	private Date create;		// 创建时间
	private Integer status;		// 状态 0：禁用；1：启用；2：待发布
	private List<Book> books;	// 书目
	
	// 无参构造
	public Booklist() {}

	@Override
	public String toString() {
		return "Booklist [id=" + id + ", title=" + title + ", introducty=" + introducty + ", userId=" + userId
				+ ", create=" + create + ", status=" + status + "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntroducty() {
		return introducty;
	}

	public void setIntroducty(String introducty) {
		this.introducty = introducty;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
