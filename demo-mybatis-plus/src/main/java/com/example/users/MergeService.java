package com.example.users;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Monster
 * @date: 2019-11-13 20:46
 **/
@Service
public class MergeService {

    @Autowired(required = false)
    WinxinNowMapper nowMapper;

    @Autowired(required = false)
    WinxinOldMapper oldMapper;

    @Autowired(required = false)
    WinxinStatusMapper winxinStatusMapper;
    public void addNow(){
        for (WeixinNow now : ConstantUtil.getWinxinNewList()) {
            nowMapper.insert(now);
        }
    }

    public void addOld(){
        for (WeixinOld old : ConstantUtil.getWinxinOldList()) {
            oldMapper.insert(old);
        }
    }

    public void addStatus() {
        for (WeixinStatus o : ConstantUtil.getWinxinStatusList()) {
            winxinStatusMapper.insert(o);
        }
    }
}
