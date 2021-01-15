package com.example.JavaLabSpringCloudWeb.repository;

import com.example.JavaLabSpringCloudWeb.model.MeD;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRepository implements IRepository {
    private static final String DB_FILENAME = "MeD.json";


    public List<MeD> createDBFile() throws IOException {
        File db = new File(DB_FILENAME);
        ObjectMapper mapper = new ObjectMapper();
        db.createNewFile();
        List<MeD> MeD = new ArrayList<>();
        FileWriter fw = new FileWriter(db,false);
        MeD c = new MeD();
        ArrayList<String> tags = new ArrayList<>();
        ArrayList<String> disease = new ArrayList<>();
        c.setDateBirth("12.13.1987");
        c.setId(0);
        c.setFIO("Кузякин  Игорь Анатольевич");
        tags.add("Programming"); tags.add("Efficiency");
        disease.add("disease 1. ОРЗ");
        disease.add("disease 2. Covid");
        c.setTags(tags);
        c.setDisease(disease);
        MeD.add(c);
        c = new MeD();
        tags = new ArrayList<>();
        disease = new ArrayList<>();
        c.setDateBirth("21.12.1970");
        c.setId(1);
        c.setFIO("Московский Пётр Иванович");
        tags.clear();
        disease.clear();
        disease.add("disease 1. Flu");
        disease.add("disease 2. Covid");
        disease.add("disease 3. Fracture");
        c.setTags(tags);
        c.setdisease(disease);
        MeD.add(c);
        mapper.writeValue(fw, MeD);
        return MeD;
    }

    @Override
    public List<MeD> read() {
        File db = new File(DB_FILENAME);
        try {
            if (!db.exists()) {
                return createDBFile();
            } else {
                ObjectMapper mapper = new ObjectMapper();
                List<MeD> courses = mapper.readValue(db, new TypeReference<ArrayList<MeD>>() {});
                return MeD;
            }
        } catch (IOException e) {
            System.out.println("ERROR: Troubles with json file");
            return null;
        }

    }

    @Override
    public void write(List<MeD> accounts) {
        try {
            File db = new File(DB_FILENAME);
            ObjectMapper mapper = new ObjectMapper();
            FileWriter fw = new FileWriter(db, false);
            mapper.writeValue(fw, accounts);
        } catch (IOException e) {
            System.out.println("ERROR: Writing to JSON");
        }
    }
}
