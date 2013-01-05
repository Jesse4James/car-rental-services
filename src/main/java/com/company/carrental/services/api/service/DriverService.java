package com.company.carrental.services.api.service;

import java.util.List;

import com.company.carrental.data.pojo.DriverMaster;
import com.company.carrental.services.core.dto.DriverMasterDto;


public interface DriverService {

    public List<DriverMaster> getAllDrivers();
    
    public DriverMaster getDriver(Integer driverId);
    
    public void saveDriver(DriverMasterDto driverMasterDto);
}