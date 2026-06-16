package joe.aurora.services.validators.validatorimpls;

import java.math.BigDecimal;

import joe.aurora.domains.wallet.Wallet;
import joe.aurora.exceptions.InappropriateTransferAmountException;
import joe.aurora.exceptions.InsufficientFundsException;
import joe.aurora.services.validators.TransferValidator;

public class TransferValidatorImpls implements TransferValidator {

    // BigDecimal.compareTo()
    // 0 = a == b
    // 1 = a > b
    // -1 = a < b
    public void validate(Wallet wallet, BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) == 0) {
            throw new InappropriateTransferAmountException("Transfer Must Be More Than 0");
        }
        else if(amount.compareTo(wallet.getBalance()) == -1) {
            throw new InsufficientFundsException("Insufficient Funds For Transfer");
        }
    }
}
