package com.xing.service.impl;

import com.xing.dataobject.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {
    private static final String openid="abc";

    @Autowired
    private SellerServiceImpl sellerService;

    @Test
    public void findSellerInfoByOpenId()throws Exception {
        SellerInfo result=sellerService.findSellerInfoByOpenId(openid);
        Assert.assertEquals(openid,result.getOpenId());
    }
}