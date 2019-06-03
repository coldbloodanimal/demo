package com.example.users;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    //    此处推测 autowired 可能没有聪明到找到mapper的实现类，所以会害怕mapper是null
    @Autowired(required = false)
    UsersMapper mapper;

    Users selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    IPage<Users> selectPage(Page page, Users record) {
        return mapper.selectPage(page,record);
    }
}
