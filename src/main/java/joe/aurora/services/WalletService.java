package joe.aurora.services;

import java.math.BigDecimal;

public interface WalletService {
    public void executeTransfer(Long sourceWalletId, Long destinationWalletId, BigDecimal amount);
}
