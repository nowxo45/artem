package com.example.artem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.artem.table.User;

@Mapper
public interface UserMapper {

	@Select("SELECT count(*) FROM user where loginId = #{loginId}, password = #{password}")
	User isUserAccount(@Param("loginId") String loginId, @Param("password") String password);
	
}
