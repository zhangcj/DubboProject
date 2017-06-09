package com.xxx.beecho.dubbo.service;

import com.xxx.beecho.dubbo.api.BeechoService;

/**
 * 服务实现类
 *
 * Created by Administrator on 2017/6/9.
 */
public class BeechoServiceImpl implements BeechoService{

    public String say(String info) {
        System.out.println("---- say function call ----");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("---- say function call ----");
        stringBuffer.append("info:" + info);
        return stringBuffer.toString();
    }
}
