package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    //    此处推测 autowired 可能没有聪明到找到mapper的实现类，所以会害怕mapper是null
    @Autowired(required = false)
    UsersMapper mapper;


    Users selectByPrimaryKey(String id) {

        com.mysql.jdbc.util.ReadAheadInputStream
        return mapper.selectByPrimaryKey(id);
    }

    List<Users> selectByCondition(UserCriteriaModel criteria) {
        return mapper.selectByCondition(criteria);
    }

/*    IPage<Users> selectPage(Page page, Users record) {
        return mapper.selectPage(page,record);
    }*/
}
