package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    //getter and setter to set and get private field
    //getter
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "customer1";
        account1.email = "example@email.com";
        account1.setPassword("vijay");
        String secret = account1.getPassword();
        System.out.println(secret);
    }
}
