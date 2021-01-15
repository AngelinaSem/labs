package com.example.JavaLabSpringCloudWeb.service;

import com.example.JavaLabSpringCloudWeb.model.Course;
import com.example.JavaLabSpringCloudWeb.model.Store;
import com.example.JavaLabSpringCloudWeb.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class FileMedService implements MeDService {

    @Autowired
    public Store store;

    @Autowired
    public IRepository repository;

    @Override
    public List<MeD> getAllCourses() {
        return store.MedList;
    }

    @Override
    public List<MeD> getCourses(List<Integer> MeDIds) {
        List<MeD> MeD = new ArrayList<>();
        for (int i : MeDIds) {
            MeD.add(getMeD(i));
        }
        return MeD;
    }

    @Override
    public Med getMed(int id) {
        for (MeD c: store.MeDList){
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }





}