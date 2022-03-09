package com.sprxavier.springdemo.service.impl;

import com.sprxavier.springdemo.dao.BranchDAO;
import com.sprxavier.springdemo.pojo.branch;
import com.sprxavier.springdemo.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 代表它是Bean
 * 业务层的的bean
 */
@Service
public class BranchServiceImpl implements IBranchService {

    /**
     * 依赖注入，先根据类型注入 再根据变量名注入
     */
    @Autowired
    private BranchDAO branchDAO;

    @Override
    public branch getBranchById(Integer id) {
        return branchDAO.selectById(id);
    }

}
