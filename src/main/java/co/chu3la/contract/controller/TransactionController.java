package co.chu3la.contract.controller;


import co.chu3la.contract.domain.Transaction;
import co.chu3la.contract.exception.TransactionException;
import co.chu3la.contract.response.BaseResponse;
import co.chu3la.contract.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1/api")
@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("/transactions/{accountNumber}")
    public BaseResponse<Transaction> getTransactionsByAccountNumber(@PathVariable String accountNumber) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            List<Transaction> transactions = transactionService.getAllTransactions(accountNumber);
            baseResponse.setJsonData(transactions);
            baseResponse.setStatus(true);
            baseResponse.setStatusCode("200");
        }catch (TransactionException e) {
            baseResponse.setStatus(false);
            baseResponse.setStatusCode("401");
            baseResponse.setMsg(e.getMessage());
        }
        return baseResponse;
    }

}
