package com.himly.jpaDynamicSql.service.impl;

import com.himly.jpaDynamicSql.model.Test;
import com.himly.jpaDynamicSql.repository.TestRepository;
import com.himly.jpaDynamicSql.repository.TestRepositorySpec;
import com.himly.jpaDynamicSql.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestRepository testRepository;

    @Override
    public List<Test> getByConditions(String name, String code, String content) {

        List<Test> tests = testRepository.findAll(TestRepositorySpec.getAllByCondition(name,code));
        System.out.println(tests);

        return tests;
    }
}
