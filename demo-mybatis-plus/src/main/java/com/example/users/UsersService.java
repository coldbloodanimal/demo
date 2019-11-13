package com.example.users;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    //    此处推测 autowired 可能没有聪明到找到mapper的实现类，所以会害怕mapper是null
    @Autowired(required = false)
    UsersMapper mapper;

    Users selectByPrimaryKey(String id) {
        return mapper.selectById(id);
    }

    Integer getCount(){
        QueryWrapper queryWrapper =new QueryWrapper();
        //queryWrapper.eq("username","RNXS6NWU5D9Q5Q");
        queryWrapper.like("username","RNXS6NWU5D9Q5Q");
       return mapper.selectCount(queryWrapper);
    }

    public IPage<Users> selectPage(Page page, Users user) {
        QueryWrapper queryWrapper =new QueryWrapper();
        //queryWrapper.eq("username","RNXS6NWU5D9Q5Q");
        queryWrapper.like("username",user.getUsername());
        return mapper.selectPage(page,queryWrapper);
    }


    int deleteByUsername(String username) {
        QueryWrapper queryWrapper =new QueryWrapper();
        //queryWrapper.eq("username","RNXS6NWU5D9Q5Q");
        queryWrapper.eq("username",username);
        return mapper.delete(queryWrapper);
    }

//    List<Users> selectByCondition(UserCriteriaModel criteria) {
//        return mapper.selectByCondition(criteria);
//    }

/*    IPage<Users> selectPage(Page page, Users record) {
        return mapper.selectPage(page,record);
    }*/
}
