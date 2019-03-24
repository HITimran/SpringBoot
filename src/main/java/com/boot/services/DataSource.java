package com.boot.services;

public class DataSource {

    private String server;
    private int post;

    public DataSource(String server, int post) {
        this.server = server;
        this.post = post;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "server='" + server + '\'' +
                ", post=" + post +
                '}';
    }
}
