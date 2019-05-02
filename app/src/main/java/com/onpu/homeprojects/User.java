package com.onpu.homeprojects;

import java.util.Date;

public class User {
    public int id;
    public String time;
    public String search;

    public User(String time, String search) {
        this.id = -1;
        this.time = time;
        this.search = search;
    }

    public User(int id, String time, String search) {
        this.id = id;
        this.time = time;
        this.search = search;
    }

    public User(int id, String time) {
        this.id = id;
        this.time = time;
        this.search = "";
    }

    public User() {
        this.id = -1;

        this.search = "";

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
