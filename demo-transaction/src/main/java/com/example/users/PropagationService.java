package com.example.users;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Slf4j
@Service
public class PropagationService {
    @Setter
    @Resource
    UsersMapper mapper;

    @Transactional
    public void outerInsert(){
        insert2();
        insert1();

        throw new RuntimeException("transactional exception");
    }

    @Transactional
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert1(){
        Users user1=Users.getGoodUser();
//        user1.setPassword("支持事务");
        mapper.insert(user1);
        SysException.throwSysException();
        mapper.insert(user1);

//        insert2();
//       throw new RuntimeException("transactional exception");

    }

    @Transactional(rollbackFor = Exception.class,propagation = Propagation.NOT_SUPPORTED)
    public void insert2(){
        Users user2=Users.getGoodUser();
//        user2.setPassword("不支持事务");
        mapper.insert(user2);
    }
}
