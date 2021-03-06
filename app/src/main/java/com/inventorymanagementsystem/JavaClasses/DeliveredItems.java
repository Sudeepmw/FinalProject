package com.inventorymanagementsystem.JavaClasses;

import com.google.gson.annotations.SerializedName;

public class DeliveredItems {


    @SerializedName("id")
    public String id;

    @SerializedName("items")
    public String items;

    @SerializedName("quantity")
    public String quantity;

    @SerializedName("price")
    public String price;

    @SerializedName("order_date")
    public String order_date;

    @SerializedName("order_created_by")
    public String order_created_by;
}
