package com.sprxavier.springdemo;

import beanInclude.controllerBean;
import com.sprxavier.springdemo.dao.BranchDAO;
import com.sprxavier.springdemo.pojo.branch;
import com.sprxavier.springdemo.pojo.myDataSource;

import com.sprxavier.springdemo.service.IBranchService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RestController用于代替 ResponseBody & Controller用于标记这个类是Controller
 * 并且给类中的所有方法都加上了 ResponseBody的注解
 */
@Slf4j
@RestController
@RequestMapping(value = "/branches")
public class FirstProgram {

    @Value("${users[1].nickname}")
    private String users;

    @Autowired
    private controllerBean bean;

    @Autowired
    private Environment env;

    @Autowired
    private BranchDAO branchDao;

    @Autowired
    private myDataSource source;

    @Autowired
    private IBranchService service;

//    private static final Logger log = LoggerFactory.getLogger(FirstProgram.class);

    /**
     * REST风格的注解开发
     * /@PostMapping("/xxx/xx")
     * /PutMapping ("/xxx")
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String save(@PathVariable int id) {
        System.out.println("save...." + id);
        System.out.println(env.getProperty("server.port"));
        System.out.println(source.getPassword());

        log.info("info...");
        log.warn("warn...");
        log.error("error...");

        return source.getDriver();
    }

    @GetMapping
    public List<branch> selectA() {
        branch branch = branchDao.selectById(4);

        System.out.println(branchDao.selectAll());

        return branchDao.selectAll();
    }

    @GetMapping("/injection")
    public void inj() {
        branch branchById = service.getBranchById(6);
        System.out.println("branch using service : " + branchById);

    }


}
