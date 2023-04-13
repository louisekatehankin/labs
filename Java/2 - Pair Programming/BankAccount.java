public class BankAccount {
    private String acc_holder;
    private static int acc_counter = 0;
    private int acc_number;
    private float balance;
    Scanner sc = new Scanner(System.in);

    public BankAccount(String acc_holder, float init_balance) {
        this.acc_holder = acc_holder;
        this.acc_number = 1000 + acc_counter;
        acc_counter++;
        this.balance = init_balance;
    }


}

