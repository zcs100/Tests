package com.redis.source;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

/**
 * Created by szc on 16/11/2.
 */
public class BaseRedis {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Jedis jedis = null;

    @Before
    public void init(){
        //初始化数据
        jedis = new Jedis("localhost");
    }

    @Test
    public void testConnection(){
        String result = jedis.ping();
        logger.info(result);
        Assert.assertNotNull(result);
        Assert.assertEquals("PONG",result);
    }

    @After
    public void close(){
        jedis.close();
    }

}
