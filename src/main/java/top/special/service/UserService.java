package top.special.service;

import java.util.Date;
import java.util.List;

import top.special.pojo.User;

public interface UserService {

	public List<Object> findByCondition(Integer pageNo, User user, Date oldCreate, Date newCreate);
}
