package joe.aurora.repositories;

import java.util.Optional;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import joe.aurora.domains.wallet.Wallet;

public interface WalletRepository extends R2dbcRepository<Wallet, Long> {
    public Optional<Long> findById();
    public Wallet save();
}
