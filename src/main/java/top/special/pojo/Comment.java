package top.special.pojo;

import java.util.Date;

/**
 **留言类
 * @author SpecialCarp
 * 2020年11月20日 上午10:36:52
 *
 */
public class Comment {
	
	private Integer id;				// 主键
	private String content;			// 留言内容
	private User user;				// 留言人
	private Book book;				// 被留言书
	private Comment comment;		// 被回复人
	private Booklist booklist;		// 被留言书单
	private Date datetime;			// 留言时间
	private Boolean status;			// 状态 0：删除；1：可查
	
	// 无参构造
	public Comment() {}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", user=" + user + ", book=" + book + ", comment="
				+ comment + ", booklist=" + booklist + ", datetime=" + datetime + ", status=" + status + "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Booklist getBooklist() {
		return booklist;
	}

	public void setBooklist(Booklist booklist) {
		this.booklist = booklist;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
