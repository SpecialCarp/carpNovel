package top.special.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import top.special.pojo.Notify;

/**
 **通知类Mapper
 * @author SpecialCarp
 * 2020年12月3日 上午10:54:24
 *
 */
@Mapper
public interface NotifyMapper {

	/**
	 **根据id查询通知
	 * @param id
	 * @return
	 */
	@Select("select * from notify where id = #{id}")
	public Notify findNotifyById(Integer id);
	
	/**
	 **添加一个通知
	 **若非处理举报，则仅为通知
	 * @param notify
	 * @return rows
	 */
	public Integer saveNotify(Notify notify);
	
}
