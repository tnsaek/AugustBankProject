package august.bank.app.bankproject.service;

import august.bank.app.bankproject.dto.TransactionDto;
import august.bank.app.bankproject.entity.Transaction;

import java.util.List;

public interface TransactionService {

    public TransactionDto addTransaction(TransactionDto transactionDto);
    public TransactionDto getTransactionById(Long transactionId);
    public List<TransactionDto> getAllTransaction();
    public TransactionDto updateTransaction(Long transactionId, TransactionDto transaction);
    public void deleteTransactionById(Long transactionId);
}
