package joe.aurora.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import joe.aurora.dtos.TransferRequestDTO;
import joe.aurora.services.WalletService;

@RestController
public class WalletController {
    private WalletService walletService;

    public ResponseEntity transfer(TransferRequestDTO request) {
        walletService.executeTransfer(request.getSourceWalletId(), request.getDestinationWalletId(), request.getAmount());
        
        return new ResponseEntity<>(HttpStatusCode.valueOf(418));
    }
}
