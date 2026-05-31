package joe.aurora.services;

import java.math.BigDecimal;

public interface WalletService {
    public void executeTransfer(Long src, Long dest, BigDecimal amount);
}
