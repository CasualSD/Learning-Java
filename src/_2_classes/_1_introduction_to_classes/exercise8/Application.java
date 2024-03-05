package _2_classes._1_introduction_to_classes.exercise8;

public class Application {

    public static void main(String[] args) {
        //Ancestors
        Person jack = new Person("Jack", null, null);
        Person margret = new Person("Margret", null, null);

        Person tom = new Person("Tom", null, null);
        Person pen = new Person("Pen", null, null);

        Person ben = new Person("Ben", null, null);
        Person sophia = new Person("Sophia", null, null);

        Person hank = new Person("Hank", null, null);
        Person violette = new Person("Violette", null, null);

        //Grandparents
        Person danny = new Person("Danny", margret, jack);
        Person fanny = new Person("Fanny", pen, tom);

        Person alex = new Person("Alex", sophia, ben);
        Person tanny = new Person("Tanny", violette, hank);

        //Parents
        Person david = new Person("David", fanny, danny);
        Person sarah = new Person("Sarah", tanny, alex);
        
        //Kids
        Person noah = new Person("Noah", sarah, david);
        Person ian = new Person("Ian", sarah, david);

        System.out.println(noah.isSiblingOf(ian));
        System.out.println(alex.isGrandparentOf(noah));
        System.out.println(ian.isGrandchildOf(alex));
        System.out.println(jack.isAncestorOf(noah));
    }
}
