package august.bank.app.bankproject.service.Impl;

import august.bank.app.bankproject.dto.TransactionDto;
import august.bank.app.bankproject.entity.Transaction;
import august.bank.app.bankproject.repository.TransactionRepository;
import august.bank.app.bankproject.service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TransactionDto addTransaction(TransactionDto transactionDto) {
        Transaction transaction = modelMapper.map(transactionDto, Transaction.class);
        return transactionDto;
    }

    @Override
    public TransactionDto getTransactionById(Long transactionId) {
        try{
            Transaction transaction = transactionRepository.findById(transactionId).orElse(null);
            return modelMapper.map(transaction, TransactionDto.class);
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<TransactionDto> getAllTransaction() {
        try{
            List<Transaction> transactions = transactionRepository.findAll();
            return transactions.stream().map(transaction -> modelMapper.map(transaction, TransactionDto.class)).toList();
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public TransactionDto updateTransaction(Long transactionId, TransactionDto transactionDto) {
        try{
            Transaction transaction = modelMapper.map(transactionDto, Transaction.class);
            transaction.setId(transactionId);
            return modelMapper.map(transaction, TransactionDto.class);
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void deleteTransactionById(Long transactionId) {
        try{
            transactionRepository.deleteById(transactionId);
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
