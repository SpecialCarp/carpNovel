package top.special.pojo;

/**
 **内容类
 * @author SpecialCarp
 * 2020年11月20日 上午10:36:32
 *
 */
public class Content {
	
	private Integer id;			// 主键
	private String content;		// 内容
	
	// 无参构造
	public Content() {}

	@Override
	public String toString() {
		return "Content [id=" + id + ", content=" + content + "]";
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
}
