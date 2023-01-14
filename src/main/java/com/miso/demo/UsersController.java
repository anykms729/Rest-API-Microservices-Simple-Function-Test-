/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miso.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// Once REST format request is sent, controller is invoked
@RestController 
// Whenever request is sent with some source(ex: "users" in URL), annotated class should be invoked
@RequestMapping("/users")
public class UsersController {
 
// When request is sent as URL format, the method will be triggered
//    @GetMapping
//    public String getUsers(){
//        return "http GET request was sent";
//    }
    
    @GetMapping
    // Use Query parameter to get users in specific page
    public String getUsers(@RequestParam(value="page") int pageno, @RequestParam(value="limit") int limitno){
        return "http GET request was sent: "+pageno+" and limit is "+limitno;
    }
    
    // Below getUser() method to handle request which requires specific info with parameter passed
    // Query parameter is used to filter the data and Path parameter is used to get specific data
    @GetMapping(path="/{userID}")
    public String getUser(@PathVariable String userID){
        return "http GET request was sent for userID: "+userID;
    }
    
    @PostMapping
    public String createUsers(){
        return "http POST request was sent";
    }
    
    @PutMapping
    public String updateUsers(){
        return "http PUT request was sent";
    }
    
    @DeleteMapping
    public String deleteUsers(){
        return "http DELETE request was sent";
    }
}
