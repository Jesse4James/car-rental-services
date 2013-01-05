package com.company.carrental.services.core.dto;



public class DriverContactDto {
    private Integer driverContactId;
    private Integer contactNumber;
    private Boolean isPrimary;
    private ContactTypeMasterDto contactTypeMaster;
    private DriverMasterDto driverMaster;
    public Integer getDriverContactId() {
        return driverContactId;
    }
    public void setDriverContactId(Integer driverContactId) {
        this.driverContactId = driverContactId;
    }
    public Integer getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }
    public Boolean getIsPrimary() {
        return isPrimary;
    }
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }
    public ContactTypeMasterDto getContactTypeMaster() {
        return contactTypeMaster;
    }
    public void setContactTypeMaster(ContactTypeMasterDto contactTypeMaster) {
        this.contactTypeMaster = contactTypeMaster;
    }
    public DriverMasterDto getDriverMaster() {
        return driverMaster;
    }
    public void setDriverMaster(DriverMasterDto driverMaster) {
        this.driverMaster = driverMaster;
    }

    }
