package ge.oppaproject.model;

import ge.oppaproject.service.TransactionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class TransactionThread extends Thread{
    @Autowired
    private TransactionDataService transactionDataService;

    private List<Transaction> transactionList;

    private int it = 0;

    @Override
    public void run() {
        for (int i=0;;i++){
            System.out.println("\nTransaction report №" + it++);
            this.transactionList = transactionDataService.getTransactionList();
            Iterator<Transaction> transactionIterator = transactionList.iterator();
            while (transactionIterator.hasNext()){
                System.out.println(transactionIterator.next().toString());
            }
            transactionDataService.setTransactionList(new ArrayList<>());
            try {
                sleep(1800000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
