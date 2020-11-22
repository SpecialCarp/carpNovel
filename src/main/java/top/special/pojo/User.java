package top.special.pojo;

import java.util.Date;

/**
 **用户类
 * @author SpecialCarp
 * 2020年11月20日 上午10:33:59
 *
 */
public class User {
	
	private Integer id;			// 主键
	private String username;	// 用户名
	private String account;		// 账号
	private String password;	// 密码
	private String iphone;		// 预留电话号
	private Boolean sex;		// 性别 0：男；1：女
	private String email;		// 邮箱
	private String avatar;		// 头像
	private Date create;		// 创建时间
	private Boolean status;		// 状态 0：禁用；1：启用
	private Boolean author;		// 作者 0：不是；1是
	
	// 无参构造
	public User() {}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", account=" + account + ", password=" + password
				+ ", iphone=" + iphone + ", sex=" + sex + ", email=" + email + ", avatar=" + avatar + ", create="
				+ create + ", status=" + status + ", author=" + author + "]";
	}

	// getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
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

	public Boolean getAuthor() {
		return author;
	}

	public void setAuthor(Boolean author) {
		this.author = author;
	}

}
