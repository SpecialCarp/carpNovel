package top.special.pojo;

import java.util.Date;

/**
 **管理员类
 * @author SpecialCarp
 * 2020年11月20日 上午10:33:22
 *
 */
public class Admin {

	private Integer id;				// 主键
	private String name;			// 姓名
	private String account;			// 账号
	private String password;		// 密码
	private String iphone;			// 预留语句
	private Boolean adminSupreme;	// 至高权限：管理员管理
	private Boolean userAccess;		// 用户管理
	private Boolean bookAccess;		// 书记管理
	private Boolean commentAccess;	// 留言管理
	private Boolean booklistAccess; // 书单管理
	private Date create;			// 创建时间
	private Boolean status;			// 状态 0：禁用；1：启用
	
	// 无参构造
	public Admin() {}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + ", iphone="
				+ iphone + ", adminSupreme=" + adminSupreme + ", userAccess=" + userAccess + ", bookAccess="
				+ bookAccess + ", commentAccess=" + commentAccess + ", booklistAccess=" + booklistAccess + ", create="
				+ create + ", status=" + status + "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIphone() {
		return iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

	public Boolean getAdminSupreme() {
		return adminSupreme;
	}

	public void setAdminSupreme(Boolean adminSupreme) {
		this.adminSupreme = adminSupreme;
	}

	public Boolean getUserAccess() {
		return userAccess;
	}

	public void setUserAccess(Boolean userAccess) {
		this.userAccess = userAccess;
	}

	public Boolean getBookAccess() {
		return bookAccess;
	}

	public void setBookAccess(Boolean bookAccess) {
		this.bookAccess = bookAccess;
	}

	public Boolean getCommentAccess() {
		return commentAccess;
	}

	public void setCommentAccess(Boolean commentAccess) {
		this.commentAccess = commentAccess;
	}

	public Boolean getBooklistAccess() {
		return booklistAccess;
	}

	public void setBooklistAccess(Boolean booklistAccess) {
		this.booklistAccess = booklistAccess;
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
