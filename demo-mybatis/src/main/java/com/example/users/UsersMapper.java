package com.example.users;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Users record);

    int insert2(Map<String,Object> map);

    int insert3(Map<String,Object> map);

    int insert4(List<Map<String, Object>> entityList);

    int update2(Map<String,Object> map);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<Users> selectByCondition(UserCriteriaModel criteria);

    List<Map<String,String>> selectMap();

//    IPage<User> selectPageVo(Page page, @Param("state") Integer state);

    /*    IPage<Users> selectPage(Page page, Users record);*/
}