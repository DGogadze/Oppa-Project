package ge.oppaproject.service;

import ge.oppaproject.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionDataService {
    private List<Transaction> transactionList = new ArrayList<Transaction>();

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void addTransaction(Transaction transaction){
        transactionList.add(transaction);
    }
}
