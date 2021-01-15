package com.example.JavaLabSpringCloudWeb.repository;

import com.example.JavaLabSpringCloudWeb.model.MeD;

import java.util.List;

public interface IRepository {
    List<MeD> read();
    void write(List<MeD> accounts);
}
