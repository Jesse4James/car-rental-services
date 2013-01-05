package com.company.carrental.services.core.service;

import java.util.List;

import com.company.carrental.data.api.dao.DriverMasterDao;
import com.company.carrental.data.pojo.DriverContact;
import com.company.carrental.data.pojo.DriverMaster;
import com.company.carrental.services.api.service.DriverService;
import com.company.carrental.services.core.dto.DriverMasterDto;
import com.company.carrental.services.util.transformUtil.DriverServiceTransformUtil;

public class DriverServiceImpl implements DriverService {

    private DriverMasterDao driverMasterDao;

    public List<DriverMaster> getAllDrivers() {
        return driverMasterDao.getAll();
    }
    
    public DriverMaster getDriver(Integer driverId){
        DriverMaster dm = driverMasterDao.get(driverId);
        for(DriverContact dC : dm.getDriverContacts()){
            System.out.println(dC.getContactNumber());
        }
        
        return dm;
    }
    
    public void saveDriver(DriverMasterDto driverMasterDto){
        driverMasterDao.save(DriverServiceTransformUtil.transformToDriverMaster(driverMasterDto));
    }

    public DriverMasterDao getDriverMasterDao() {
        return driverMasterDao;
    }

    public void setDriverMasterDao(DriverMasterDao driverMasterDao) {
        this.driverMasterDao = driverMasterDao;
    }

}