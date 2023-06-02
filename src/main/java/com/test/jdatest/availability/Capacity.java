package com.test.jdatest.availability;

import java.util.Date;

public class Capacity {
    private String storeNo;
    private String productid;
    private double noOfOrdersAccepted;
    private java.util.Date date;

    public Capacity(String storeNo,String productid, double noOfOrdersAccepted, java.util.Date date) {
        super();
        this.storeNo = storeNo;
        this.productid = productid;
        this.noOfOrdersAccepted = noOfOrdersAccepted;
        this.date = date;

    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public double getNoOfOrdersAccepted() {
        return noOfOrdersAccepted;
    }

    public void setNoOfOrdersAccepted(double noOfOrdersAccepted) {
        this.noOfOrdersAccepted = noOfOrdersAccepted;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "com.test.jdatest.availability.Capacity{" +
                "storeNo='" + storeNo + '\'' +
                ", productid='" + productid + '\'' +
                ", noOfOrdersAccepted=" + noOfOrdersAccepted +
                ", date=" + date +
                '}';
    }
}
