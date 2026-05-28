package joe.aurora.dtos;

import java.math.BigDecimal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransferRequestDTO {
    private Long sourceWalletId;
    private Long destinationWalletId;
    private BigDecimal amount;
}
