package top.special.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import top.special.pojo.Comment;

/**
 **留言Mapper
 * @author SpecialCarp
 * 2020年12月8日 下午8:12:55
 *
 */
@Mapper
public interface CommentMapper {

	/**
	 **根据id查询留言
	 * @param id
	 * @return
	 */
	@Select("select * from comment where id = #{id}")
	public Comment findCommentById(Integer id);
	
	/**
	 **根据id查询留言
	 * @param id
	 * @return (book | booklist | comment, user)
	 */
	public Comment findCommentByIdResultCommentWithPojo(Integer id);
	
	/**
	 **根据书籍id查询留言
	 * @param b_id
	 * @return
	 */
	public List<Comment> findCommentByBIdResultLastComment(@Param("b_id") Integer b_id, @Param("last") Integer last);
	
	/**
	 **删除留言
	 * @param comment
	 * @return
	 */
	@Update("update comment set status = #{status} where id = #{id}")
	@Options(keyProperty="id",useGeneratedKeys=true)
	public Integer disableCommentById(Comment comment);
	
}
