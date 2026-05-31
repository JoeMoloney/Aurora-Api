package joe.aurora.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import joe.aurora.domains.wallet.Wallet;
import reactor.core.publisher.Mono;

public interface WalletRepository extends R2dbcRepository<Wallet, Long> {
    public Mono<Wallet> findByWalletId(Long walletId);
    public Mono<Wallet> findByUserId(Long userId);
    public Mono<Wallet> save(Wallet wallet);
}
