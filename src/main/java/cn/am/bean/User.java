package cn.am.bean;

import java.io.Serializable;

public class User implements Serializable {
    private String uid;
    private String uname;
    private String upassword;
    private String urealname;
    private String ucompany;
    private String isadmin;
    private String isdel;
    private String umore;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname;
    }

    public String getUcompany() {
        return ucompany;
    }

    public void setUcompany(String ucompany) {
        this.ucompany = ucompany;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    public String getUmore() {
        return umore;
    }

    public void setUmore(String umore) {
        this.umore = umore;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", urealname='" + urealname + '\'' +
                ", ucompany='" + ucompany + '\'' +
                ", isadmin='" + isadmin + '\'' +
                ", isdel='" + isdel + '\'' +
                ", umore='" + umore + '\'' +
                '}';
    }
}
