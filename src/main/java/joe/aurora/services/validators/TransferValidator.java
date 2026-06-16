package joe.aurora.services.validators;

import java.math.BigDecimal;

import joe.aurora.domains.wallet.Wallet;

public interface TransferValidator {
    public void validate(Wallet wallet, BigDecimal amount);

}
