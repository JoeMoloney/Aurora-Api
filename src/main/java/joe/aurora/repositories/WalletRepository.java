package joe.aurora.repositories;

import java.util.Optional;

import joe.aurora.domains.wallet.Wallet;

public interface WalletRepository {
    public Optional findById();
    public Wallet save();
}
