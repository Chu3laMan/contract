package co.chu3la.contract.service;


import co.chu3la.contract.repository.TransactionRepository;
import co.chu3la.contract.domain.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {


    @Autowired(required = true)
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions(String accountNumber) {
        return transactionRepository.findAllByAccountNumber(accountNumber);
    }


}
