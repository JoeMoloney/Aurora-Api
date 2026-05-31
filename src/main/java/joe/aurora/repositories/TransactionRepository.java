package joe.aurora.repositories;

import java.util.List;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import joe.aurora.domains.transaction.Transaction;

public interface TransactionRepository extends R2dbcRepository<Transaction, Long> {
    public Transaction save(Transaction transaction);
    public List<Transaction> findAllBySourceWalletId(Long walletId);
}
