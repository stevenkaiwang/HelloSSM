package com.atguigu.mybatis.mappers;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptByEmpIdWithAssociation(@Param("empId") Integer empId);

    Emp getEmpAndDeptByStep(@Param("empId") Integer empId);

    Emp getEmpsOfDept(@Param("deptId") Integer deptId);

    List<Emp> getEmpsByCondition(HashMap<String,Object> conditions);

    int insertEmps(@Param("emps") List<Emp> emps);

    int deletEmps(@Param("empIds") int[] empIds);

}
