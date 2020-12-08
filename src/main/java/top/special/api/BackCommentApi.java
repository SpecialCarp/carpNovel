package top.special.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import top.special.pojo.Admin;
import top.special.pojo.Comment;
import top.special.pojo.Report;
import top.special.pojo.User;
import top.special.service.CommentService;

@CrossOrigin
@RestControllerAdvice
@RequestMapping("/back/comment")
public class BackCommentApi {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value = "/findReport")
	public List<Report> findCommentReport(Boolean status){
		return commentService.findCommentReport(status);
	}
	
	@RequestMapping(value = "/releasedComment")
	public Integer releasedComment
		(Admin admin, User user, Comment comment, Report report, 
				Integer a_id, Integer u_id, Integer c_id, Integer r_id, Integer statu, String reason) {
		admin.setId(a_id);
		user.setId(u_id);
		comment.setId(c_id);
		comment.setStatus(statu);
		report.setId(r_id);
		return commentService.releasedComment(admin, user, comment, report, reason);
	}

}
