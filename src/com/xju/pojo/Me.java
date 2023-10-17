package com.xju.pojo;

public class Me {
    private int id;
    private String qq;
    private String email;
    private String username;
    private String mess;

    public Me(){}
    public Me(String qq,String email,String username,String mess){
        this.qq = qq;
        this.email = email;
        this.username = username;
        this.mess = mess;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
