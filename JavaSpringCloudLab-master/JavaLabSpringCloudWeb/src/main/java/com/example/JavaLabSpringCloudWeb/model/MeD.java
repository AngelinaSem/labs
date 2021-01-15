package com.example.JavaLabSpringCloudWeb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
@Document(collection = "MeD")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MeD {

    @Field("FIO")
    private String FIO;
    @Field("DateBirth")
    private String DateBirth;
    @Field("id")
    private int id;
    @Field("tags")
    private List<String> tags;
    @Field("disease")
    private List<String> disease;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getDateBirth() {
        return DateBirth;
    }

    public void setDateBirth(String DateBirth) {
        this.DateBirth = DateBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getDisease() {
        return disease;
    }

    public void setDisease(List<String> disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "MeD '" + FIO + "\'\n" +
                "DateBirth: " + DateBirth + '\n' +
                "Tags: " + tags +
                "\ndisease: " + disease +
                '\n';
    }

    public String briefDescription(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getId());
        stringBuilder.append(" : ");
        stringBuilder.append(getFIO());
        stringBuilder.append(" DateBirth: ");
        stringBuilder.append(getDateBirth());
        stringBuilder.append(" Tags: ");
        stringBuilder.append(getTags());
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public void setDisease(List<String> disease) {
        this.disease = disease;
    }
}
