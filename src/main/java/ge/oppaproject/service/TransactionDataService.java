package ge.oppaproject.service;

import ge.oppaproject.model.Transaction;
import ge.oppaproject.model.TransactionThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionDataService {
    private List<Transaction> transactionList = new ArrayList<>();
    @Autowired
    TransactionThread transactionThread;

    boolean threadFlag = false;

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void addTransaction(Transaction transaction){
        transactionList.add(transaction);
        if (!threadFlag){
            threadFlag = true;
            transactionThread.start();
        }
    }
}
