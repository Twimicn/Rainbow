package com.twimi.rainbow;

import com.twimi.rainbow.Dao.StudentDao;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void TestStudent(){
        String expect = "[id:14080026]";
        StudentDao dao = new StudentDao();
        String actual = dao.getStudents().toString();
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void TestLoginCorret(){
        StudentDao dao = new StudentDao();
        boolean actual = dao.login("ivan","123");
        Assert.assertEquals(true,actual);
    }

    @Test
    public void TestLoginWrong(){
        StudentDao dao = new StudentDao();
        boolean actual = dao.login("ivan1","123");
        Assert.assertEquals(false,actual);
    }
}
