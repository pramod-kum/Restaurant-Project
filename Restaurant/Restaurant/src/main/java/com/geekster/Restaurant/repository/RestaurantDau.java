package com.geekster.Restaurant.repository;

import com.geekster.Restaurant.model.RestaurantModel;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Repository
public class RestaurantDau {

    ArrayList<RestaurantModel> list=new ArrayList<>();

    public boolean AddAllDeatails(RestaurantModel deatails){

        list.add(deatails);
        return true;
    }

    public ArrayList<RestaurantModel> RestaurantDeatailsShow(){
        return list;
    }

}
