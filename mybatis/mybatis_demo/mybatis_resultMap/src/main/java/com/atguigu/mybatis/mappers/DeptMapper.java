package com.atguigu.mybatis.mappers;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getDeptByDeptId(@Param("deptId") Integer deptId);

    Dept getDeptEmpByDid(@Param("deptId") Integer deptId);

    Dept getDetpByStep(@Param("deptId") Integer deptId);
}
