package top.special.mapper;

import top.special.pojo.Comment;

public interface CommentMapper {

	public Comment findById(Integer id);
	
	public Integer disableById(Comment comment);
}
