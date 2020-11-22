package top.special.pojo;

import java.util.Date;

/**
 **评分类
 * @author SpecialCarp
 * 2020年11月20日 上午10:37:11
 *
 */
public class Score {
	
	private Integer id;			// 主键
	private Double score;		// 评分
	private Book book;			// 被评分书
	private User user;			// 评分人
	private Date create;		// 评分时间
	
	// 无参构造
	public Score() {}

	@Override
	public String toString() {
		return "Score [id=" + id + ", score=" + score + ", book=" + book + ", user=" + user + ", create=" + create
				+ "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}
	
}
