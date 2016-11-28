package com.Junit.Test.business.test;

import com.Junit.Test.BaseTest;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import javax.annotation.Resource;

/**
 * Created by szc on 16/11/3.
 */
public class LoadDataSourceTest extends BaseTest{

    @Resource
    private ComboPooledDataSource dataSource;

    @Test
    public void testLoadSource() throws SQLException{
        Assert.assertNotNull(dataSource);
        Connection con = dataSource.getConnection();
        Assert.assertNotNull(con.isClosed());
    }

}
