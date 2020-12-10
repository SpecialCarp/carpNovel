package top.special.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import top.special.pojo.Booklist;

/**
 **书单Mapper
 * @author SpecialCarp
 * 2020年12月8日 下午8:03:22
 *
 */
@Mapper
public interface BooklistMapper {

	/**
	 **根据id查询书单
	 * @param id
	 * @return
	 */
	@Select("select * from booklist where id = #{id}")
	public Booklist findBooklistById(Integer id);
	
}
