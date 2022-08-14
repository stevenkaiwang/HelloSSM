import com.atguigu.mybatis.mappers.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultTypeTest {
//    @Test
//    public void testgetEmpByEmpId(){
//        SqlSession session = SqlSessionUtil.getSession();
//        EmpMapper mapper = session.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpByEmpId(1);
//        System.out.println(emp);
//        session.close();
//    }

    @Test
    public void testgetEmpAndDeptByEmpId(){
        SqlSession session = SqlSessionUtil.getSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
        session.close();
    }
}
