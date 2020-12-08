package top.special.service;

import java.util.List;

import top.special.pojo.Admin;
import top.special.pojo.Comment;
import top.special.pojo.Report;
import top.special.pojo.User;

/**
 **留言逻辑层
 * @author SpecialCarp
 * 2020年12月6日 下午2:39:01
 *
 */
public interface CommentService {

	/**
	 **查询所有留言举报
	 * @param status
	 * @return
	 */
	public List<Report> findCommentReport(Boolean status);
	
	public Integer releasedComment(Admin admin, User user, Comment comment, Report report, String reason);
	
}
