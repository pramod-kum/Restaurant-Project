package com.geekster.Restaurant.controller;

import com.geekster.Restaurant.model.RestaurantModel;
import com.geekster.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/Data")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantservice;

    @PostMapping("/addRestaurent")
    public String AddRestaurant(@RequestBody RestaurantModel deatails){
        return restaurantservice.AddRestaurantDeatails(deatails);
    }
    @GetMapping("/showRestauran")
    public ArrayList<RestaurantModel> AllRestaurant(){
        return restaurantservice.AllRestaurantDeatails();
    }

    @GetMapping("getDeatailById/{id}")
    public RestaurantModel GetByid(@PathVariable int id){
        return restaurantservice.GetObjByid(id);
    }
    @PutMapping("/UpdateSpecialtyById/{id}/{specialty}")
    public String UpdateResturant(@PathVariable int id , @PathVariable String specialty){
        return restaurantservice.UpdateSpecialty(id,specialty);
    }

    @DeleteMapping("/deleteRestaurant/{id}")
    public String Delete(@PathVariable int id){
        return restaurantservice.DeteteDetails(id);
    }
}
