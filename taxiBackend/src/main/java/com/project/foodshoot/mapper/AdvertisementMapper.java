package com.project.foodshoot.mapper;

import com.project.foodshoot.entity.Advertisement;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdvertisementMapper {
    @Insert("insert into ad(passengerLatitude,passengerLongitude,destinationLatitude,destinationLongitude)" +
            " values(#{advertisement.passengerLatitude},#{advertisement.passengerLongitude},#{advertisement.destinationLatitude},#{advertisement.destinationLongitude})")
    @Options(useGeneratedKeys = true, keyProperty = "reqId")
    void add(@Param("advertisement") Advertisement advertisement);
}
