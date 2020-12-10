package top.special.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import top.special.pojo.Chapter;

/**
 **章节Mapper
 * @author SpecialCarp
 * 2020年12月9日 下午4:07:34
 *
 */
@Mapper
public interface ChapterMapper {

	/**
	 **根据书籍id查询最新章节
	 * @param b_id
	 * @return
	 */
	public List<Chapter> findChapterByBIdResultLastChapter(@Param("b_id") Integer b_id, @Param("last") Integer last);
	
	/**
	 **根据id查询章节和内容
	 * @param b_id
	 * @return
	 */
	public Chapter findChapterByIdResultChapterWithContent(Integer b_id);
	
}
