package ge.oppaproject.model;

public class Transaction {
    private TransactionType transactionType;
    private String privateId;
    private String phoneNumber;
    private String amount;
    private String bankAccount;

    public void mobileTransaction(String phoneNumber,
                                  String amount){
        this.transactionType = TransactionType.mobile;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
    }

    public void charityTransaction(String privateId,
                                   String phoneNumber,
                                   String amount){
        this.transactionType = TransactionType.charity;
        this.phoneNumber = phoneNumber;
        this.privateId = privateId;
        this.amount = amount;
    }

    public void financialServiceTransaction(String privateId,
                                            String bankAccount,
                                            String amount,
                                            String phoneNumber){
        this.transactionType = TransactionType.financialServices;
        this.privateId = privateId;
        this.bankAccount = bankAccount;
        this.amount = amount;
        this.phoneNumber = phoneNumber;
    }

    public void utilityTransaction(String privateId,
                                   String phoneNumber,
                                   String amount){
        this.transactionType = TransactionType.utility;
        this.privateId = privateId;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public String getPrivateId() {
        return privateId;
    }

    public void setPrivateId(String privateId) {
        this.privateId = privateId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}