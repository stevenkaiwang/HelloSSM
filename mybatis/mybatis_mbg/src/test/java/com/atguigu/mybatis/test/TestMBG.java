package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mappers.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMBG {
    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);

        // 修改数据
//        Emp emp = new Emp(12, "王四2", null, "女");
//        mapper.updateByPrimaryKeySelective(emp);

        EmpExample example = new EmpExample();
        example.createCriteria().andEmpNameLike("%name%").andGenderEqualTo("男");
        example.or().andGenderEqualTo("女");
        PageHelper.startPage(1,4);
        List<Emp> emps = mapper.selectByExample(example);
        PageInfo<Emp> pageInfo = new PageInfo<>(emps, 8);
        emps.forEach(System.out::println);
        System.out.println(pageInfo);
        sqlSession.close();
    }
}
