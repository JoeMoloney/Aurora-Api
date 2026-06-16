package joe.aurora.services.serviceimpls;

import java.math.BigDecimal;

import org.springframework.web.reactive.function.client.WebClient;

import joe.aurora.domains.wallet.Wallet;
import joe.aurora.repositories.TransactionRepository;
import joe.aurora.repositories.WalletRepository;
import joe.aurora.services.WalletService;
import joe.aurora.services.validators.TransferValidator;

public class WalletServiceImpl implements WalletService {
    private WalletRepository walletRepository;
    private TransactionRepository transactionRepository;
    private TransferValidator transferValidator;

    private final WebClient webClient;

    public WalletServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("127.0.0.1").build(); // Example
    }

    public void executeTransfer(Long sourceWalletId, Long destinationWalletId, BigDecimal amount) {
        // Possible WebClients to use: 
        // RestTemplate (synchronous, no reactive support, spring status maintenance)
        // FeignClient (declarative interface driven, limited reactive support via open-feign extensions, spring status community driven)
        // WebClient (functional fluent api, fully reactive, spring status spring standard)

        // Flow:
        // fetch user data from db?
        // fetch wallet data from db
        // run validator
        // update balances
        // send updated wallet data back to DB
    }
}
