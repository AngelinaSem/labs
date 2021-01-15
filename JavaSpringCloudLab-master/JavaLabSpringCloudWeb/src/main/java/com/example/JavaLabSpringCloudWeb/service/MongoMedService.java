package com.example.JavaLabSpringCloudWeb.service;

import com.example.JavaLabSpringCloudWeb.model.MeD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.ArrayList;
import java.util.List;

public class MongoMeDService implements MedService {
    @Autowired
    MongoTemplate mongoTemplate;
    @Override
    public List<MeD> getAllMed() {
        return mongoTemplate.findAll(Course.class);
    }

    @Override
    public List<MeD> getMed(List<Integer> MeDIds) {
        List<MeD> MeD = new ArrayList<>();
        for (Integer i: MeDIds){
            MeD.add(getMed(i));
        }
        return MeD;
    }

    @Override
    public MeD getMed(int id) {
        MeD med = mongoTemplate.query(MeD.class).matching(Query.query(Criteria.where("id").is(id))).oneValue();
        return MeD;
    }
}
