package com.nio.test;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by szc on 16/9/29.
 * 读取完整的行,避免出现汉字乱码情况
 */
public class TestNIOReadWholeLine {

    /**
     * 乱码的情况
     */
    public void testDisorder() throws Exception{
        RandomAccessFile file = new RandomAccessFile("/Users/szc/TestWorkPlace/Tests/TestNIO/src/main/java/testDisorder.txt","r");
        FileChannel channel = file.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(256);
       // while (channel.)

    }


}
