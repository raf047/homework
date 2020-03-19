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

//        Person[] personArr = new Person[6];

        System.out.println(p1.getBalance());
        System.out.println(p2.getBalance());
    }
}
