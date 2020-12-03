package top.special.pojo;

import java.util.Date;

/**
 **举报类
 * @author SpecialCarp
 * 2020年11月20日 上午10:37:34
 *
 */
public class Report {
	
	private Integer id;			// 主键
	private Book book;			// 被举报的书
	private Booklist booklist;	// 被举报的书单
	private Comment comment;	// 被举报的留言
	private User user;			// 举报人
	private String content;		// 举报内容
	private Date create;		// 举报时间
	private Boolean status;		// 状态 0：未处理，1：已处理
	
	//无参构造
	public Report() {}

	@Override
	public String toString() {
		return "Report [id=" + id + ", book=" + book + ", booklist=" + booklist + ", comment=" + comment + ", user="
				+ user + ", content=" + content + ", create=" + create + ", status=" + status + "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Booklist getBooklist() {
		return booklist;
	}

	public void setBooklist(Booklist booklist) {
		this.booklist = booklist;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
