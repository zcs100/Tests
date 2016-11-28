package com.redis.source.example1;

import com.redis.source.BaseRedis;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by szc on 16/11/2.
 */
public class VoteArticle extends BaseRedis{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private String currentUser = "张三";
    @Before
    public void initData(){
        //有序列表:保存时间和成员
        jedis.zadd("javas", System.currentTimeMillis(),"java:01");
        jedis.zadd("javas", System.currentTimeMillis(),"java:02");
        jedis.zadd("javas", System.currentTimeMillis(),"java:03");
        jedis.zadd("javas", System.currentTimeMillis(),"java:04");
        //有序列表:保存评分和成员
        jedis.zadd("scores",100,"java:01");
        jedis.zadd("scores",10,"java:02");
        jedis.zadd("scores",0,"java:03");
        jedis.zadd("scores",50,"java:04");
        //集合保存用户以评论的文章
        jedis.lpush("java:01:","张三");
        jedis.lpush("java:01:","张三三");
        jedis.lpush("java:02:","张三");
    }

    //评论规则:已发布时间大于1周不允许在评分,用户已评分的文章不能重复评分
    @Test
    public void voteArticle(){
        Long systemTime = jedis.zrank("javas","java:01");
        Long currentTime = System.currentTimeMillis();
        if(currentTime-systemTime>7*24*60*60*1000){
            logger.info("发布文章超过7天,不能进行评分");
            return;
        }
        //jedis.z

    }

}
