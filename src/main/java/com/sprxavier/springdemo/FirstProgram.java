package com.sprxavier.springdemo;

import com.sprxavier.springdemo.dao.BranchDAO;
import com.sprxavier.springdemo.pojo.branch;
import com.sprxavier.springdemo.pojo.myDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RestController用于代替 ResponseBody & Controller用于标记这个类是Controller
 * 并且给类中的所有方法都加上了 ResponseBody的注解
 */
@RestController
@RequestMapping(value = "/branches")
public class FirstProgram {

    @Value("${users[1].nickname}")
    private String users;

    @Autowired
    private Environment env;

    @Autowired
    private BranchDAO branchDao;

    @Autowired
    private myDataSource source;

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

        return source.getDriver();
    }

    @GetMapping
    public List<branch> selectA() {

        System.out.println(branchDao.selectAll());

        return branchDao.selectAll();
    }


}
