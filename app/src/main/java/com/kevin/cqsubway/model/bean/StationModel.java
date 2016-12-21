package com.kevin.cqsubway.model.bean;

/**
 * Created by Kevin Liu on 2016/12/20.
 * Function：
 */

public class StationModel {

    private String name;
    private String data;
    private int subwayNum;
    private int id;

    public StationModel(String name, String data, int subwayNum, int id) {
        this.name = name;
        this.data = data;
        this.subwayNum = subwayNum;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getSubwayNum() {
        return subwayNum;
    }

    public void setSubwayNum(int subwayNum) {
        this.subwayNum = subwayNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
