package com.java.bean;

public class FastjsonReq {
    private String name;
    private String idNo;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "FastjsonReq{" +
                "name='" + name + '\'' +
                ", idNo='" + idNo + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
