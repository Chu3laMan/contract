package co.chu3la.contract.controller;

import co.chu3la.contract.domain.Transaction;
import co.chu3la.contract.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TransactionControllerIntegrationTest {


    private TransactionService transactionService;

    @BeforeEach
    public void setup() {
        transactionService = Mockito.mock(TransactionService.class);
    }

    @Test
    public void givenTransaction_whenTransaction_ThenReturnTransaction() {
        String accountNumber = "1"; //You can choose whatever you want as an account number
        List<Transaction> transactions = transactionService.getAllTransactions(accountNumber);
        assertEquals(0, transactions.size());
    }

}
