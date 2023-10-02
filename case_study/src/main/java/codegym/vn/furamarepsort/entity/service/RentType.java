package codegym.vn.furamarepsort.entity.service;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue
    @Column(name = "rent_type_id")
    private int rentTypeId;
    @Column(name = "rent_type_name",columnDefinition = "varchar(45)")
    private String rentTypeName;
    @Column(name = "rent_type_cost")
    private double rentTypeCost;
    @JsonBackReference
    @OneToMany(mappedBy = "rentType")
    List<Service> serviceList;

    public RentType() {
    }

    public RentType(String rentTypeName, double rentTypeCost, List<Service> serviceList) {
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
        this.serviceList = serviceList;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
