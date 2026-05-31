package joe.aurora.services.serviceimpls;

import java.math.BigDecimal;

import joe.aurora.repositories.TransactionRepository;
import joe.aurora.repositories.WalletRepository;
import joe.aurora.services.WalletService;

public class WalletServiceImpl implements WalletService {
    private WalletRepository walletRepository;
    private TransactionRepository transactionRepository;
    // private TransferValidator transferValidator;

    public void executeTransfer(Long src, Long dest, BigDecimal amount) {
        throw new UnsupportedOperationException("Function not implemented");
    }
}
