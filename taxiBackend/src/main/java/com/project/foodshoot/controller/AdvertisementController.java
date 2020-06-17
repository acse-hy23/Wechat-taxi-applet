package com.project.foodshoot.controller;

import com.alibaba.fastjson.JSON;
import com.project.foodshoot.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/mes")
public class AdvertisementController {
    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping
    public String getAdvertisement(@RequestParam double pasLa,@RequestParam double pasLon,@RequestParam double desLa,@RequestParam double desLon){
        return JSON.toJSONString(advertisementService.insertAd(pasLa,pasLon,desLa,desLon));
    }
}
