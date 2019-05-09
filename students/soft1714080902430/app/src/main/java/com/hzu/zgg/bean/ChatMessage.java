package com.hzu.zgg.bean;

public class ChatMessage {
    private String data;
    private String time;
    private String name;
    private int number;

    public ChatMessage(String data , int number,String time, String name) {
        this.data = data;
        this.time = time;
        this.name = name;
        this.number = number;
    }

    public ChatMessage() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
