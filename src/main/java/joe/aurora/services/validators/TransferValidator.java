package joe.aurora.services.validators;

import java.math.BigDecimal;

import joe.aurora.domains.wallet.Wallet;
import joe.aurora.exceptions.InsufficientFundsException;

public class TransferValidator {
    public void validate(Wallet wallet, BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) < 0)
            throw new InsufficientFundsException("Insufficient Funds");
    } 
}
