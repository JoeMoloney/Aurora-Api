package joe.aurora.dtos;

import java.math.BigDecimal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransferRequestDTO {
    private Long sourceWalletId;
    private Long destinationWalletId;
    private BigDecimal amount;

    public TransferRequestDTO() {};
    public TransferRequestDTO(Long sourceWalletId, Long destinationWalletId, BigDecimal amount) {
        this.sourceWalletId = sourceWalletId;
        this.destinationWalletId = destinationWalletId;
        this.amount = amount;
    }

    public Long getSourceWalletId() {
        return this.sourceWalletId;
    }
    public Long getDestinationWalletId() {
        return this.destinationWalletId;
    }
    public BigDecimal getAmount() {
        return this.amount;
    }
}
