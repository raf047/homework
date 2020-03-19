public class Person {
    private String name;
    private double balance;
    private Company company;

    public Person(String name, double balance, Company company){
        this.name = name;
        this.balance = balance;
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMoney(Person otherPerson, double amount){
        balance -= amount;
        otherPerson.balance += amount;
    }
}
