package joe.aurora.domains.wallet;

import java.math.BigDecimal;

import joe.aurora.exceptions.InsufficientFundsException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Wallet {
    private Long id;
    private Long userId;
    private String currency;
    private BigDecimal balance;
    private Integer version;

    private void debit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    private void credit(BigDecimal amount) {
        if(this.balance.compareTo(amount) < 0)
            throw new InsufficientFundsException("Insufficient Funds");
        this.balance = this.balance.subtract(amount);
    }
}
