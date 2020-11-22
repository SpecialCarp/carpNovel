package top.special.pojo;

/**
 **类型类
 * @author SpecialCarp
 * 2020年11月20日 上午10:34:34
 *
 */
public class Classify {
	
	private Integer id;		// 主键
	private String type;	// 类型名称
	private Boolean status;	// 状态 0：禁用；1：启用
	
	// 无参构造
	public Classify() {}

	@Override
	public String toString() {
		return "Classify [id=" + id + ", type=" + type + ", status=" + status + "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
}
