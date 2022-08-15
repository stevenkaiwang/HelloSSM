import com.atguigu.mybatis.mappers.DeptMapper;
import com.atguigu.mybatis.mappers.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultTypeTest {
//    @Test
//    public void testgetEmpByEmpId(){
//        SqlSession session = SqlSessionUtil.getSession();
//        EmpMapper mapper = session.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpByEmpId(1);
//        System.out.println(emp);
//        session.close();
//    }

//    @Test
//    public void testGetEmpAndDeptByEmpId(){
//        SqlSession session = SqlSessionUtil.getSession();
//        EmpMapper mapper = session.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpAndDeptByEmpId(1);
//        System.out.println(emp);
//        session.close();
//    }

//    @Test
//    public void testGetEmpAndDeptByEmpIdWithAssociation(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpAndDeptByEmpIdWithAssociation(5);
//        System.out.println(emp);
//        sqlSession.close();
//    }

//    @Test
//    public void testGetEmpAndDeptByStep(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpAndDeptByStep(3);
//        System.out.println(emp);
//        sqlSession.close();
//    }

//    @Test
//    public void getDeptEmpByDid(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
//        Dept dept = mapper.getDeptEmpByDid(1);
//        System.out.println(dept);
//        sqlSession.close();
//    }

    @Test
    public void getDetpByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDetpByStep(2);
        System.out.println(dept);
        sqlSession.close();
    }

    @Test
    public void TestGetEmpsByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        HashMap<String, Object> condition = new HashMap<String, Object>();
//        condition.put("empName", "");
        condition.put("gender", "男");
        List<Emp> emps = mapper.getEmpsByCondition(condition);
        emps.forEach(emp -> System.out.println(emp));
//        System.out.println(emp);
        sqlSession.close();
    }


}
