import com.atguigu.mybatis.mappers.DeptMapper;
import com.atguigu.mybatis.mappers.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

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

//    @Test
//    public void getDetpByStep(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
//        Dept dept = mapper.getDetpByStep(2);
//        System.out.println(dept);
//        sqlSession.close();
//    }

    @Test
    public void TestGetEmpsByCondition() throws InterruptedException {
        SqlSession sqlSession = SqlSessionUtil.getSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        HashMap<String, Object> condition = new HashMap<String, Object>();
//        condition.put("empName", "name4");
        condition.put("gender", "女");
        List<Emp> emps = mapper.getEmpsByCondition(condition);
        emps.forEach(emp -> System.out.println(emp));

        //如果sleep期间由其它程序更新了数据，该线程仍然是读的缓存旧数据
        sleep(30000);

//        sqlSession.clearCache();
        SqlSession sqlSession1 = SqlSessionUtil.getSession();
        EmpMapper mapper1 = sqlSession.getMapper(EmpMapper.class);
        for (Emp emp : mapper1.getEmpsByCondition(condition)) {
            System.out.println(emp);
        }


//        System.out.println(emp);
        sqlSession.close();
    }

//    @Test
//    public void TestInsertEmps(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        List<Emp> emps = new ArrayList<>();
//
//        for(int i = 13; i<30; i++){
//            Emp emp = new Emp("name"+i, i, "男");
//            emps.add(emp);
//        }
//        Integer num = mapper.insertEmps(emps);
//        System.out.println(num);
//        sqlSession.close();
//    }
//
//    @Test
//    public void TestDeletEmps(){
//        SqlSession sqlSession = SqlSessionUtil.getSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        int[] empIds = {6,7};
//        int num = mapper.deletEmps(empIds);
//        System.out.println(num);
//        sqlSession.close();
//    }


}
