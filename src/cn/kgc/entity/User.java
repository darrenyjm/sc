package cn.kgc.entity;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;
    private String uanme;
    private String upwd;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUanme() {
        return uanme;
    }

    public void setUanme(String uanme) {
        this.uanme = uanme;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uanme='" + uanme + '\'' +
                ", upwd='" + upwd + '\'' +
                '}';
    }
}
