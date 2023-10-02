package codegym.vn.furamarepsort.entity.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "attach_service")
public class AttachService {
    @Id
    @GeneratedValue
    @Column(name ="attach_service_id")
    private int attachServiceId;
    @Column(name = "attach_service_name",columnDefinition = "varchar(45)")
    @NotNull
    private String attachServiceName;
    @Column(name = "attach_service_status",columnDefinition = "varchar(45)")
    private String attachServiceStatus;
    @Column(name = "attach_service_cost")
    @NotNull
    private double attachServiceCost;
    @Column(name = "attach_service_unit")
    @NotNull
    private int attachServiceUnit;
    @OneToMany(mappedBy = "attachService")
    @JsonBackReference
    private List<ContractDetail> contractDetailList;

    public AttachService() {
    }

    public AttachService(int attachServiceId, String attachServiceName, String attachServiceStatus, double attachServiceCost, int attachServiceUnit) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.attachServiceStatus = attachServiceStatus;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceUnit = attachServiceUnit;
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }

    public double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(double attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public int getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(int attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
