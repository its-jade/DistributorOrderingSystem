package com.example.distributororderingsystem;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String beerLicenseNumber;
    private String paymentMethod;
    private String loadingDockInfo;
    private String deliveryConstraints;
    private String pointOfContact;

    public Customer(String name, String address, String city, String state, String zipCode, String phoneNumber, String beerLicenseNumber, String paymentMethod, String loadingDockInfo, String deliveryConstraints, String pointOfContact) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.beerLicenseNumber = beerLicenseNumber;
        this.paymentMethod = paymentMethod;
        this.loadingDockInfo = loadingDockInfo;
        this.deliveryConstraints = deliveryConstraints;
        this.pointOfContact = pointOfContact;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getBeerLicenseNumber() { return beerLicenseNumber; }
    public void setBeerLicenseNumber(String beerLicenseNumber) { this.beerLicenseNumber = beerLicenseNumber; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public String getLoadingDockInfo() { return loadingDockInfo; }
    public void setLoadingDockInfo(String loadingDockInfo) { this.loadingDockInfo = loadingDockInfo; }
    public String getDeliveryConstraints() { return deliveryConstraints; }
    public void setDeliveryConstraints(String deliveryConstraints) { this.deliveryConstraints = deliveryConstraints; }
    public String getPointOfContact() { return pointOfContact; }
    public void setPointOfContact(String pointOfContact) { this.pointOfContact = pointOfContact; }

    // Override toString, equals, and hashCode methods if needed
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", beerLicenseNumber='" + beerLicenseNumber + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", loadingDockInfo='" + loadingDockInfo + '\'' +
                ", deliveryConstraints='" + deliveryConstraints + '\'' +
                ", pointOfContact='" + pointOfContact + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!name.equals(customer.name)) return false;
        if (!address.equals(customer.address)) return false;
        if (!city.equals(customer.city)) return false;
        if (!state.equals(customer.state)) return false;
        if (!zipCode.equals(customer.zipCode)) return false;
        if (!phoneNumber.equals(customer.phoneNumber)) return false;
        if (!beerLicenseNumber.equals(customer.beerLicenseNumber)) return false;
        if (!paymentMethod.equals(customer.paymentMethod)) return false;
        if (!loadingDockInfo.equals(customer.loadingDockInfo)) return false;
        if (!deliveryConstraints.equals(customer.deliveryConstraints)) return false;
        return pointOfContact.equals(customer.pointOfContact);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + zipCode.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + beerLicenseNumber.hashCode();
        result = 31 * result + paymentMethod.hashCode();
        result = 31 * result + loadingDockInfo.hashCode();
        result = 31 * result + deliveryConstraints.hashCode();
        result = 31 * result + pointOfContact.hashCode();
        return result;
    }
}
