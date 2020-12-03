package top.special.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
	 * 根据条件查询举报
	 * @param pojoId(1:查询书籍举报;2:查询书单举报;3:查询留言举报)
	 * @param status(null:全部;true:已处理;false:未处理)
	 * @return List<Report>
	 */
	public List<Report> findByPojoId(@Param("pojoId") Integer pojoId, @Param("status") Boolean status);
	
	/**
	 * 根据id设置举报为已处理
	 * @param id
	 * @return
	 */
	public Integer trueReport(Integer id);
}
