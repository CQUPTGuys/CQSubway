package com.kevin.cqsubway.model.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Kevin Liu on 2016/12/18.
 * Function：
 */

public class SubwayThree extends DataSupport {
    private String subRight;

    private String subLeft;

    private int position;

    private String name;

    private int stationId;

    private String data;

    public SubwayThree(String subRight, String subLeft, int position, String name, int stationId, String data) {
        this.subRight = subRight;
        this.subLeft = subLeft;
        this.position = position;
        this.name = name;
        this.stationId = stationId;
        this.data = data;
    }

    public String getSubRight() {
        return subRight;
    }

    public void setSubRight(String subRight) {
        this.subRight = subRight;
    }

    public String getSubLeft() {
        return subLeft;
    }

    public void setSubLeft(String subLeft) {
        this.subLeft = subLeft;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
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
}
