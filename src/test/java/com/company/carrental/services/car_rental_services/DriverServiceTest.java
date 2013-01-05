package com.company.carrental.services.car_rental_services;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.company.carrental.data.pojo.DriverContact;
import com.company.carrental.data.pojo.DriverMaster;
import com.company.carrental.services.api.service.generic.CarRentalServiceFactory;
import com.company.carrental.services.test.generic.GenericTest;

/**
 * @author Vijay
 * 
 */
public class DriverServiceTest extends GenericTest {

    /**
     * Constructor
     */
    public DriverServiceTest() {
        super();
    }

//    public void testGetAllDrivers() {
//
//        List<DriverMaster> dms = CarRentalServiceFactory.getDriverService().getAllDrivers();
//
//        for(DriverMaster dm : dms){
//        System.out.println(dm.getDriverFullName());
//        }
//
//    }
    
//    public void testGetDriver() {
//
//        DriverMaster dm = CarRentalServiceFactory.getDriverService().getDriver(1);
//
//        System.out.println(dm.getDriverFullName());
//
//    }
    
    public void testSave(){
        
        DriverMaster dm = new DriverMaster();
        dm.setDriverFullName("Brinal ");
        dm.setDob(new Date());
        dm.setGender('M');
        dm.setPrimaryContactNumber("98692");

        DriverContact dc = new DriverContact();
        dc.setContactNumber(1212);
//        dc.setContactType("1");
        dc.setDriverMaster(dm);
        Set<DriverContact> dcs = new HashSet<DriverContact>();
        dcs.add(dc);
        dm.setDriverContacts(dcs);
        CarRentalServiceFactory.getDriverService().saveDriver(dm);
    }

    /**
     * @return Test
     */
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(DriverServiceTest.class);
        return suite;
    }
}