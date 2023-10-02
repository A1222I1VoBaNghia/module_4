package codegym.vn.furamarepsort.entity.customer;

import codegym.vn.furamarepsort.entity.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private int customerID;
    @Column(columnDefinition = "varchar(45)",name = "customer_name")
    @NotNull
    private String customerName;
    @Column(name = "customer_birthday", columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date customerBirthday;
    @Column(name = "customer_gender")
    @NotNull
    private boolean customerGender;
    @Column(name = "customer_id_card",columnDefinition = "varchar(45)")
    @NotNull
    private String customerIdCard;
    @Column(name = "customer_phone", columnDefinition = "varchar(45)")
    @NotNull
    private String customerPhone;
    @Column(name = "customer_email",columnDefinition = "varchar(45)")
    private String customerEmail;
    @Column(name = "customer_address",columnDefinition = "varchar(45)")
    private String customerAddress;
    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    @NotNull
    private CustomerType customerType;
    @JsonBackReference
    @OneToMany(mappedBy = "customer")
    private List<Contract> contractList;
    public Customer() {
    }

    public Customer(int customerID, String customerName, Date customerBirthday, boolean customerGender, String customerIdCard, String customerPhone, String customerEmail, String customerAddress, CustomerType customerType) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerType = customerType;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public boolean isCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(boolean customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
