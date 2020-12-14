package ge.oppaproject.model;

public class Transaction {
    private long id;
    private TransactionType transactionType;
    private String privateId;
    private String phoneNumber;
    private String amount;
    private String bankAccount;

    public void mobileTransaction(String phoneNumber,
                                  String amount){
        this.id = (long) (Math.random()*1000);
        this.transactionType = TransactionType.mobile;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
    }

    public void charityTransaction(String privateId,
                                   String phoneNumber,
                                   String amount){
        this.id = (long) (Math.random()*1000);
        this.transactionType = TransactionType.charity;
        this.phoneNumber = phoneNumber;
        this.privateId = privateId;
        this.amount = amount;
    }

    public void financialServiceTransaction(String privateId,
                                            String bankAccount,
                                            String amount,
                                            String phoneNumber){
        this.id = (long) (Math.random()*1000);
        this.transactionType = TransactionType.financialServices;
        this.privateId = privateId;
        this.bankAccount = bankAccount;
        this.amount = amount;
        this.phoneNumber = phoneNumber;
    }

    public void utilityTransaction(String privateId,
                                   String phoneNumber,
                                   String amount){
        this.id = (long) (Math.random()*1000);
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionType=" + transactionType +
                ", privateId='" + privateId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }
}