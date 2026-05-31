package joe.aurora.repositories;

import java.util.List;

import joe.aurora.domains.transaction.Transaction;

public interface TransactionRepository {
    public Transaction save(Transaction transaction);
    public List<Transaction> findAllBySourceWalletId(Long walletId);
}
