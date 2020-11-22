package top.special.pojo;

import java.util.Date;

/**
 **章节类
 * @author SpecialCarp
 * 2020年11月20日 上午10:36:10
 *
 */
public class Chapter {
	
	private Integer id;			// 主键
	private Integer number;		// 章节数
	private String title;		// 章节名
	private Integer bookId;		// 所属书id
	private Date create;		// 创建时间
	private Integer words;		// 字数
	private Content content;	// 内容
	private Boolean status;		// 状态 0：禁用；1：启用；2：待发布；3：未发布
	
	// 无参构造
	public Chapter() {}
	
	@Override
	public String toString() {
		return "Chapter [id=" + id + ", number=" + number + ", title=" + title + ", bookId=" + bookId + ", create="
				+ create + ", words=" + words  + ", status=" + status + "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public Integer getWords() {
		return words;
	}

	public void setWords(Integer words) {
		this.words = words;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
}
