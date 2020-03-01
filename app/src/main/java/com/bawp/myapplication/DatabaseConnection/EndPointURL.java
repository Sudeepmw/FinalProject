package com.bawp.myapplication.DatabaseConnection;


import com.bawp.myapplication.Classes.AddItems;
import com.bawp.myapplication.Classes.DeliveredItems;
import com.bawp.myapplication.Classes.EditProfile;
import com.bawp.myapplication.Classes.Items;
import com.bawp.myapplication.Classes.NotReceivedGoods;
import com.bawp.myapplication.Classes.ReceivedGoods;
import com.bawp.myapplication.Classes.ViewAllMyOrders;
import com.bawp.myapplication.Classes.ViewOrders;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;

public interface EndPointURL {
    @GET("InventoryManagementSystem/user_registration.php")
    Call<ResponseData> user_registration(
            @Query("name") String name,
            @Query("phone") String phone,
            @Query("emailid") String emailid,
            @Query("uname1") String uname1,
            @Query("pwd1") String pwd,
            @Query("restaurant_name") String restaurant_name

    );
    @GET("InventoryManagementSystem/user_login.php")
    Call<ResponseData> user_login(
            @Query("uname") String uname,
            @Query("pwd") String pwd
    );

    @GET("InventoryManagementSystem/admin_login.php")
    Call<ResponseData> admin_login(
            @Query("uname") String uname,
            @Query("pwd") String pwd
    );

    @GET("InventoryManagementSystem/getUserProfile.php")
    Call<List<EditProfile>> getUserProfile
            (
                    @Query("uname") String uname
            );




    @GET("InventoryManagementSystem/getItems.php")
    Call<List<AddItems>> getiteams();

    @GET("InventoryManagementSystem/getItems.php")
    Call<List<Items>> getiteams1();

    @GET("/InventoryManagementSystem/update_user_profile.php")
    Call<ResponseData> update_user_profile(
            @Query("name") String name,
            @Query("phone") String phone,
            @Query("emailid") String emailid,
            @Query("pwd1") String pwd1,
            @Query("pincode") String pincode,
            @Query("locality") String locality,
            @Query("shipping_address") String shipping_address,
            @Query("uname1") String uname1
    );

    @GET("InventoryManagementSystem/add_orders.php")
    Call<ResponseData> add_orders(
            @Query("Items") String items,
            @Query("price") String price,
            @Query("order_date") String order_date,
            @Query("order_created_by") String order_created_by,
            @Query("quantity") String quantity,
            @Query("restaurant_name") String restaurant_name

    );

    @GET("InventoryManagementSystem/getOrders.php")
    Call<List<ViewOrders>> getOrders();

    @GET("InventoryManagementSystem/getUserOrders.php")
    Call<List<ViewAllMyOrders>> getUserOrders(@Query("uname") String uname);

    @GET("InventoryManagementSystem/getUserDeliveredOrders.php")
    Call<List<ReceivedGoods>> getUserDeliveredOrders(@Query("uname") String uname);

    @GET("InventoryManagementSystem/getUserOutOfStockOrders.php")
    Call<List<NotReceivedGoods>> getUserOutOfStockOrders(@Query("uname") String uname);

    @GET("InventoryManagementSystem/updateOrderStatus.php?")
    Call<ResponseData> updateOrderStatus(
            @Query("id") String id,
            @Query("status") String status
    );
    @GET("InventoryManagementSystem/getUseforgotPasswordrProfile.php")
    Call<ResponseData> forgotPassword(
            @Query("emailid") String emailid,
            @Query("uname") String uname
    );

    @Multipart
    @POST("InventoryManagementSystem/add_items.php?")
    Call<ResponseData> add_items(
            @Part MultipartBody.Part file,
            @PartMap Map<String, String> partMap

    );
    @GET("/InventoryManagementSystem/edit_item.php")
    Call<ResponseData> edit_items(
            @Query("item_name") String item_name,
            @Query("price") String price,
            @Query("quantity") String quantity,
            @Query("id") String id
    );

    @GET("/InventoryManagementSystem/delete_item.php")
    Call<ResponseData> delete_items(

            @Query("id") String id
    );

    @GET("InventoryManagementSystem/get_admin_delivered_items.php")
    Call<List<DeliveredItems>> getAdminDeliveredItems();

    @GET("InventoryManagementSystem/get_admin_out_of_stock.php")
    Call<List<DeliveredItems>> getAdminOutOfStockItems();

}
