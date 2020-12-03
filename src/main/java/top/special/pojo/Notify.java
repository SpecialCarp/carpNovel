package top.special.pojo;

import java.util.Date;

/**
 **通知类
 * @author SpecialCarp
 * 2020年11月20日 上午10:37:49
 *
 */
public class Notify {
	
	private Integer id;			// 主键
	private Admin admin;		// 处理者
	private User user;			// 被通知者
	private Report report;		// 举报信息
	private String content;		// 通知内容
	private Date create;		// 通知时间

	// 无参构造
	public Notify() {}
	
	public Notify(Admin admin, User user, Report report, String content, Date create) {
		this.admin = admin;
		this.user = user;
		this.report = report;
		this.content = content;
		this.create = create;
	}

	@Override
	public String toString() {
		return "Notify [id=" + id + ", admin=" + admin + ", user=" + user + ", report=" + report + ", content="
				+ content + ", create=" + create + "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
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
	
}
