package top.special.pojo;

import java.util.Date;
import java.util.List;

/**
 **书籍类
 * @author SpecialCarp
 * 2020年11月20日 上午10:34:16
 *
 */
public class Book {

	private Integer id;			// 主键
	private String title;		// 书名
	private String avatar;		// 封面
	private String author;		// 作者
	private String introducty;	// 简介
	private Double score;		// 评分
	private User user;			// 上传人
	private Date create;		// 创建时间
	private Integer hits;		// 点击量
	private Integer status;		// 状态 0：禁用；1：启用；2：待发布；3：未发布
	private List<Classify> classifies;	// 所属类型
	private List<Chapter> chapters;		// 章节目录
	
	// 无参构造
	public Book() {}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", avatar=" + avatar + ", introducty=" + introducty + ", score="
				+ score + ", user=" + user + ", create=" + create + ", hits=" + hits + ", status=" + status + "]";
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

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIntroducty() {
		return introducty;
	}

	public void setIntroducty(String introducty) {
		this.introducty = introducty;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
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

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<Classify> getClassifies() {
		return classifies;
	}

	public void setClassifies(List<Classify> classifies) {
		this.classifies = classifies;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	
}
