public class Testa {

    public static void main(String[] args) {

    Conta conta = new Conta(true, 1000);

    Transaction transaction = new Transaction("nike", 100, 25062022);
        System.out.println(transaction);
    }
}