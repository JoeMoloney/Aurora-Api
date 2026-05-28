import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Transaction {
    private Long id;
    private Long sourceWalletId;
    private Long destinationWalletId;
    private BigDecimal amount;
    private TransactionType type;
    private LocalDateTime timestamp;
}
