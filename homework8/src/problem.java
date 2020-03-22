public class problem {
    public static void main(String[] args) {
        Company A = new Company("a");
        Company B = new Company("b");
        Person p1 = new Person("Karen", 47000, A);
        Person p2 = new Person("Vardan", 47000, A);
        Person p3 = new Person("Aram", 47000, A);
        Person p4 = new Person("Vahe", 47000, B);
        Person p5 = new Person("Garo", 47000, B);
        Person p6 = new Person("Fred", 47000, B);


        p1.sendMoney(p2, 2000);
        p3.sendMoney(p4, 2000);
        p5.sendMoney(p6, 2000);
        p3.sendMoney(p5, 2000);
        p5.sendMoney(p1, 2000);
        p6.sendMoney(p2, 2000);

        Person[] personArr = new Person[6];
        personArr[0] = p1;
        personArr[1] = p2;
        personArr[2] = p3;
        personArr[3] = p4;
        personArr[4] = p5;
        personArr[5] = p6;

        Company[] companyArr = new Company[2];
        companyArr[0] = A;
        companyArr[1] = B;

        System.out.println(p1.getCompany().getName());

        int balanceA = 0;
        int balanceB = 0;
        double max = personArr[0].getBalance();
        int k = 0;
        for (int i = 0; i < 6; i++) {
            if (max < personArr[i].getBalance()){
                max = personArr[i].getBalance();
                k = i + 1;
            }
            if (personArr[i].getCompany().getName() == "a"){
                balanceA += personArr[i].getBalance();
            }
            if (personArr[i].getCompany().getName() == "b"){
                balanceB += personArr[i].getBalance();
            }
        }

        System.out.println("max value have " + k + "th person : " + max);
        if (balanceA > balanceB){
            System.out.println("A company has highest value : " + balanceA);
        }else {
            System.out.println("B company has highest value : " + balanceB);
        }
        System.out.println(p1.getBalance());
        System.out.println(p2.getBalance());
    }
}
