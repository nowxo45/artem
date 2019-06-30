package com.example.artem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.artem.table.User;

@Mapper
public interface UserMapper {

	@Select("SELECT count(*) FROM user where loginId = #{loginId}, password = #{password}")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	User isUserAccount(User user);
	
}
