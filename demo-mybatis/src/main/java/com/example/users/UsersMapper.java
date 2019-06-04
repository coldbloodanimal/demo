package com.example.users;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

//    IPage<User> selectPageVo(Page page, @Param("state") Integer state);

/*    IPage<Users> selectPage(Page page, Users record);*/
}