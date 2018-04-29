package com.address;
public class Address {
    private String house;
    private String road;
    private String thana;
    private District district;

    public Address(String house, String road, String thana, District district) {
        this.house = house;
        this.road = road;
        this.thana = thana;
        this.district = district;
    }

    public String getHouse() {
        return house;
    }

    public String getRoad() {
        return road;
    }

    public String getThana() {
        return thana;
    }

    public District getDistrict() {
        return district;
    }
    
    
    
}
