package codegym.vn.furamarepsort.entity.contract;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue
    @Column(name = "contract_detail_id")
    private int contractDetailId;
    @ManyToOne
    @JoinColumn(name = "contract_id")
    @NotNull
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "attach_service_id")
    @NotNull
    private AttachService attachService;
    @Column(name = "quantity")
    @NotNull
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int contractDetailId, Contract contract, AttachService attachService, int quantity) {
        this.contractDetailId = contractDetailId;
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
