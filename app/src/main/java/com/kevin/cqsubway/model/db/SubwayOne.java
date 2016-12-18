package com.kevin.cqsubway.model.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Kevin Liu on 2016/12/18.
 * Function：
 */

public class SubwayOne extends DataSupport{

    private int position;

    private String name;

    private int stationId;

    private String data;

    public SubwayOne(int position, String name, int stationId, String data) {
        this.position = position;
        this.name = name;
        this.stationId = stationId;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }
}
