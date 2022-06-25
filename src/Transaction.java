import jdk.jfr.DataAmount;

import java.time.LocalDateTime;

public class Transaction {

    String merchant;
    String amount;
    LocalDateTime time;

    public Transaction(String nike, int i, int i1) {
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "merchant='" + merchant + '\'' +
                ", amount='" + amount + '\'' +
                ", time=" + time +
                '}';
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant() {
        this.merchant = merchant;

    }

    public String getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount = amount;
    }

    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(){
        this.time = time;
    }
}