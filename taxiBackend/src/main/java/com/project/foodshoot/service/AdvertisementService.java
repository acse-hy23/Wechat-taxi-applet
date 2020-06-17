package com.project.foodshoot.service;

import com.project.foodshoot.entity.Advertisement;
import org.springframework.stereotype.Service;

@Service
public interface AdvertisementService {
    Advertisement insertAd(double passengerLatitude,double passengerLongitude,
                                   double destinationLatitude,double destinationLongitude);
}
