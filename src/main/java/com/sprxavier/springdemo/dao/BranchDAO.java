package com.sprxavier.springdemo.dao;

import com.sprxavier.springdemo.pojo.branch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 导入
 */
@Mapper
@Repository
public interface BranchDAO {

    @Select("SELECT * FROM branch;")
    public List<branch> selectAll();

    @Select("SELECT * FROM branch WHERE branch_id = #{branchId};")
    public branch selectById(@Param("branchId") int id);

}
