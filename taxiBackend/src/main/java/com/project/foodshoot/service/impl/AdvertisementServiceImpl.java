package com.project.foodshoot.service.impl;

import com.project.foodshoot.entity.Advertisement;
import com.project.foodshoot.mapper.AdvertisementMapper;
import com.project.foodshoot.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
    @Autowired
    private AdvertisementMapper advertisementMapper;
    @Override
    public Advertisement insertAd(double passengerLatitude, double passengerLongitude, double destinationLatitude, double destinationLongitude) {
        Advertisement advertisement = new Advertisement();
        advertisement.destinationLongitude=destinationLongitude;
        advertisement.destinationLatitude=destinationLatitude;
        advertisement.passengerLongitude=passengerLongitude;
        advertisement.passengerLatitude=passengerLatitude;
        //按引用传递？？
        advertisementMapper.add(advertisement);

        String str="8261261930693ABCDEFGHIJKLM0123456789";
        String str1="ABCDE";
        Random random=new Random();
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<1;i++){
            int number=random.nextInt(5);
            sb1.append(str1.charAt(number));
        }
        String taxi1 = sb1.toString();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<5;i++){
            int number=random.nextInt(36);
            sb.append(str.charAt(number));
        }
        String taxi = sb.toString();

        advertisement.taxiId="黑"+taxi1+" "+taxi;
        return advertisement;
    }
}
