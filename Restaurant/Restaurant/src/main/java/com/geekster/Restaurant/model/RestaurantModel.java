package com.geekster.Restaurant.model;

public class RestaurantModel {
    private int id;
    private String restaurantName;
    private String restaurantAddress;
    private long restaurantNumber;
    private String restaurantSpecialty;
    private int restaurantStaffs;

    public RestaurantModel(int id, String restaurantName, String restaurantAddress, long restaurantNumber, String restaurantSpecialty, int restaurantStaffs) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantNumber = restaurantNumber;
        this.restaurantSpecialty = restaurantSpecialty;
        this.restaurantStaffs = restaurantStaffs;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public long getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(long restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getRestaurantSpecialty() {
        return restaurantSpecialty;
    }

    public void setRestaurantSpecialty(String restaurantSpecialty) {
        this.restaurantSpecialty = restaurantSpecialty;
    }

    public int getRestaurantStaffs() {
        return restaurantStaffs;
    }

    public void setRestaurantStaffs(int restaurantStaffs) {
        this.restaurantStaffs = restaurantStaffs;
    }
}
