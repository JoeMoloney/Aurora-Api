import java.math.BigDecimal;

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
        throw new UnsupportedOperationException("Feature Incomplete.");
    }

    private void credit(BigDecimal amount) {
        throw new UnsupportedOperationException("Feature Incomplete.");
    }
}
