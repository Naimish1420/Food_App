package com.example.foodapp.models;

public class Ordersmodels {
int ordrimage;
String soldItamname,price,ordernumber;

    public Ordersmodels(int ordrimage, String soldItamname, String price, String ordernumber) {
        this.ordrimage = ordrimage;
        this.soldItamname = soldItamname;
        this.price = price;
        this.ordernumber = ordernumber;
    }

    public int getOrdrimage() {
        return ordrimage;
    }

    public void setOrdrimage(int ordrimage) {
        this.ordrimage = ordrimage;
    }

    public String getSoldItamname() {
        return soldItamname;
    }

    public void setSoldItamname(String soldItamname) {
        this.soldItamname = soldItamname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }
}
