package com.example.JavaLabSpringCloudWeb.service;

import com.example.JavaLabSpringCloudWeb.model.MeD;

import java.util.List;

public interface MedService {
    List<Med> getAllMed();
    List<Med> getMed(List<Integer> MedIds);
    MeD getMed(int id);
}
