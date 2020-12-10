package top.special.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import top.special.pojo.Report;

/**
 **举报类Mapper
 * @author SpecialCarp
 * 2020年12月3日 上午10:50:08
 *
 */
@Mapper
public interface ReportMapper {

	/**
	 **根据id查询举报
	 * @param id
	 * @return
	 */
	@Select("select * from report where id = #{id}")
	public Report findReportById(Integer id);
	
	/**
	 **根据举报类型查询举报
	 * @param pojoId(1:查询书籍举报;2:查询书单举报;3:查询留言举报)
	 * @param status(null:全部;true:已处理;false:未处理)
	 * @return List<Report>
	 */
	public List<Report> findReportByPojoIdResultReportWithPojo
		(@Param("pojoId") Integer pojoId, @Param("status") Boolean status);
	
	/**
	 **根据id设置举报为已处理
	 * @param id
	 * @return
	 */
	@Update("update report set `status` = 0 where id = #{id}")
	@Options(keyProperty="id", useGeneratedKeys=true)
	public Integer changeReportSetStatusById(Integer id);
	
	/**
	 **根据pojoId生成举报
	 * @param report
	 * @param pojoId
	 * @param id
	 * @return
	 */
	public Integer saveReport
		(@Param("report") Report report, @Param("pojoId") Integer pojoId, 
				@Param("p_id") Integer p_id, @Param("u_id") Integer u_id);
	
}
