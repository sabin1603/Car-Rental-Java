package domain;

import java.util.Date;
import java.util.UUID;

public class Rental implements Identifiable<String> {
    private String id;
    private Car car;
    private Customer customer;
    private Date startDate;
    private Date endDate;

    public Rental(String id, Car car, Customer customer, Date startDate, Date endDate) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        String customerName = (customer != null) ? customer.getName() : "Unknown Customer";
        return "Rental: ID - " + id + "; " + "Car - " + car.getNameOfCar() + " | Customer - " + customerName +
                " | Start Date: " + startDate + " | End Date: " + endDate;
    }



    @Override
    public String getId() {
        return id;
    }

}
