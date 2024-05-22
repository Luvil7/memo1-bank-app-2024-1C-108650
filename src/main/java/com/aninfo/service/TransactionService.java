package com.aninfo.service;

import com.aninfo.exceptions.DepositNegativeSumException;
import com.aninfo.exceptions.InsufficientFundsException;
import com.aninfo.model.Account;
import com.aninfo.model.Transaction;
import com.aninfo.repository.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;

    public Transaction createTransaction(Transaction transaction) {return transactionRepo.save(transaction);}

    public Transaction findById(Long id) {return transactionRepo.findById(id).orElse(null);}

    public List<Transaction> getTransactionsByCbu(Long cbu) {return transactionRepo.findTransactionByCbu(cbu);}

}



