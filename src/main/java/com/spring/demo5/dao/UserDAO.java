package com.spring.demo5.dao;

import com.spring.demo5.domain.UserDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDAO {

  @Select("select * from user order by mid")
  public List<UserDTO> getUserList();

  public int setUserInput(UserDTO dto);

  @Select("select * from user where mid = #{mid}")
  public UserDTO getUserSearch(String mid);

  @Delete("delete from user where idx = #{idx}")
  public int setUserDelete(int idx);
}
