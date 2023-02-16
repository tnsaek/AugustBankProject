package august.bank.app.bankproject.controller;

import august.bank.app.bankproject.dto.TransactionDto;
import august.bank.app.bankproject.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping(value = "/add/transaction")
    public TransactionDto addTransaction(@RequestBody TransactionDto transactionDto){
        return transactionService.addTransaction(transactionDto);
    }

    @GetMapping(value = "/get/transaction/{transactionId}")
    public TransactionDto getTransactionById(@PathVariable Long transactionId){
        return transactionService.getTransactionById(transactionId);
    }

    @GetMapping(value = "get/transactions")
    public List<TransactionDto> getAllTransactions(){
        return transactionService.getAllTransaction();
    }

    @PutMapping(value = "/update/transaction/{transactionId}")
    public TransactionDto updateTransaction(@PathVariable Long transactionId, @RequestBody TransactionDto transactionDto){
        return transactionService.updateTransaction(transactionId, transactionDto);
    }

    @DeleteMapping(value = "delete/transaction/{transactionId}")
    public void deleteTransaction(@PathVariable Long transactionId){
        transactionService.deleteTransactionById(transactionId);
    }
}
