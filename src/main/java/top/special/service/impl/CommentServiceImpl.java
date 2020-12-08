package top.special.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.special.mapper.CommentMapper;
import top.special.mapper.NotifyMapper;
import top.special.mapper.ReportMapper;
import top.special.pojo.Admin;
import top.special.pojo.Comment;
import top.special.pojo.Notify;
import top.special.pojo.Report;
import top.special.pojo.User;
import top.special.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;
	@Autowired
	private ReportMapper reportMapper;
	@Autowired
	private NotifyMapper notifyMapper;
	
	public List<Report> findCommentReport(Boolean status) {
		return reportMapper.findByPojoId(3, status);
	}

	public Integer releasedComment(Admin admin, User user, Comment comment, Report report, String reason) {
		// 处理举报
		reportMapper.trueReport(report.getId());
		// 通知被举报人
		Notify notifyForUser = new Notify(admin, user, report, reason, new Date());
		notifyMapper.addNotify(notifyForUser);
		return commentMapper.disableById(comment);
	}

}
