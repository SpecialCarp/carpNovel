package top.special.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import top.special.pojo.Classify;

@Mapper
public interface ClassifyMapper {

	/**
	 **根据书籍id查询分类
	 * @param b_id
	 * @return
	 */
	@Select("select c.* from classify c,book_classify_fr bcr where c.id = bcr.classify_id and bcr.book_id = #{b_id}")
	public List<Classify> findClassifyByBId(Integer b_id);
	
}
