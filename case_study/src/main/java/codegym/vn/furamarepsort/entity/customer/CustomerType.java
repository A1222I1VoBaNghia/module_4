package codegym.vn.furamarepsort.entity.customer;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue
    @Column(name = "customer_type_id")
    private int customerTypeId;
    @Column(name = "customer_type_name",columnDefinition = "varchar(45)")
    private String customerTypeName;
    @JsonBackReference
    @OneToMany(mappedBy = "customerType")
    private List<Customer> customerList;

    public CustomerType() {
    }

    public CustomerType(int customerTypeId, String customerTypeName) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
