package joe.aurora.repositories;

import java.util.List;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import joe.aurora.domains.transaction.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionRepository extends R2dbcRepository<Transaction, Long> {
    public Mono<Transaction> save(Transaction transaction);
    public Flux<Transaction> findAllBySourceWalletId(Long walletId);
    public Flux<Transaction> findAllByDestinationWalletId(Long destWalletId);
}
