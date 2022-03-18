package com.sprxavier.springdemo.controller;



import com.sprxavier.springdemo.pojo.branch;
import com.sprxavier.springdemo.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/branches")
public class BranchController {

    @Autowired
    private IBranchService service;

    @GetMapping("/getOne/{id}")
    private branch getOneById(@PathVariable int id) {
        branch branchById = service.getBranchById(id);

        return branchById;
    }


}
