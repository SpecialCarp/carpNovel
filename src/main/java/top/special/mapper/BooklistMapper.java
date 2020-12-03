package top.special.mapper;

import org.apache.ibatis.annotations.Mapper;

import top.special.pojo.Booklist;

@Mapper
public interface BooklistMapper {

	public Booklist findById(Integer id);
	
}
