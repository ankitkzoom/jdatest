package com.test.jdatest.availability;

import java.time.LocalDateTime;
import java.util.Date;

public class Availability {
    private String storeNo;
    private String productid;
    private double availQty;
    private java.util.Date date;

    public Availability(String storeNo,String productid, double availQty, java.util.Date date){
        super();
        this.storeNo=storeNo;
        this.productid=productid;
        this.availQty=availQty;
        this.date=date;
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

    public double getAvailQty() {
        return availQty;
    }

    public void setAvailQty(double availQty) {
        this.availQty = availQty;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "com.test.jdatest.availability.Availability{" +
                "storeNo='" + storeNo + '\'' +
                ", productid='" + productid + '\'' +
                ", availQty=" + availQty +
                ", date=" + date +
                '}';
    }
}
