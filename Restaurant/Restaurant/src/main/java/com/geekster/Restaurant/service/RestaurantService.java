package com.geekster.Restaurant.service;

import com.geekster.Restaurant.model.RestaurantModel;
import com.geekster.Restaurant.repository.RestaurantDau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class RestaurantService {
    @Autowired
    RestaurantDau restaurantdau;
    public String AddRestaurantDeatails(RestaurantModel deatails){
        boolean status = restaurantdau.AddAllDeatails(deatails);

        if(status){
            return "Restaurant deatails Added Succesfully...////";
        }else {
            return "Restaurant deatails are Not Added Error...////";
        }
    }


    public ArrayList<RestaurantModel> AllRestaurantDeatails(){
        return restaurantdau.RestaurantDeatailsShow();
    }

    public RestaurantModel GetObjByid(int id){
       ArrayList<RestaurantModel> allList = restaurantdau.RestaurantDeatailsShow();
       RestaurantModel Objects = null;
       for(RestaurantModel objList : allList){
           if(objList.getId()==id){
               Objects = objList;
               break;
           }
       }
       return Objects;
    }

    public String UpdateSpecialty(int id , String specialty){
        ArrayList<RestaurantModel> allList = restaurantdau.RestaurantDeatailsShow();

        for(RestaurantModel objList : allList){
            if(objList.getId()==id){
                objList.setRestaurantSpecialty(specialty);
                return "Restaurant Specialty Updated Successfully...///";
            }
        }
        return "Restaurant ID Not Updated...Error...///";
    }

    public String DeteteDetails(int id){
        ArrayList<RestaurantModel> allList = restaurantdau.RestaurantDeatailsShow();

        for(RestaurantModel objList : allList){
            if(objList.getId()==id){
                allList.remove(objList);
                return "Restaurant deleted Successfully...///";
            }
        }
        return "Restaurant ID not found Error...///";
    }
}
