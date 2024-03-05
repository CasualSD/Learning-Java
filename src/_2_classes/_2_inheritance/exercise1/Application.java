package _2_classes._2_inheritance.exercise1;

public class Application {

    public static void main(String[] args) {
        Person p1 = new Person("Noah Maes", "Naamstaat 25, 3000 Leuven");
        System.out.println(p1);

        Teacher t1 = new Teacher("John Smith", "Binkomstraat 1, 3391 Meensel-Kiezegem", 2400);
        System.out.println(t1);
    }

}
