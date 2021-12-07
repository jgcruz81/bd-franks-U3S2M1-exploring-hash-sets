package com.amazon.ata.hashingset.partsmanager;

import java.util.List;
import java.util.Objects;

public class DevicePart {
    private String manufacturer;
    private String manufacturersPartNumber;
    private List<AmazonDevice> devicesUsedIn;

    public DevicePart(String manufacturer, String manufacturersPartNumber, List<AmazonDevice> devicesUsedIn) {
        this.manufacturer = manufacturer;
        this.manufacturersPartNumber = manufacturersPartNumber;
        this.devicesUsedIn = devicesUsedIn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getManufacturersPartNumber() {
        return manufacturersPartNumber;
    }

    public List<AmazonDevice> getDevicesUsedIn() {
        return devicesUsedIn;
    }

    public void setDevicesUsedIn(List<AmazonDevice> devicesUsedIn) {
        this.devicesUsedIn = devicesUsedIn;
    }

    public void addDeviceUsedIn(AmazonDevice amazonDevice) {
        devicesUsedIn.add(amazonDevice);
    }

    public void removeDeviceUsedIn(AmazonDevice amazonDevice) {
        devicesUsedIn.remove(amazonDevice);
    }

    @Override
    public String toString() {
        return String.format("Device Part: {manufacturer: %s, manufacturersPartNumber: %s, devicesUsedIn: %s}",
                manufacturer, manufacturersPartNumber, devicesUsedIn);
    }

    @Override
    public boolean equals(Object o) {
        //if this object being compared is the same as the object you're comparing to, they are equal
        if (this == o) return true;

        //if the object being compared is null or a different class than the object you're comparing to, they are not equal
        if (o == null || getClass() != o.getClass()) return false;

        //instatiate an object of the class to used in comparison
        DevicePart that = (DevicePart) o;

        //use the class data members to determine equality
        //note the use of the string class .equals to check attributes
        return getManufacturer().equals(that.getManufacturer()) && getManufacturersPartNumber().equals(that.getManufacturersPartNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getManufacturersPartNumber());
    }
}
