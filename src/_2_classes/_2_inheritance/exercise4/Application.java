package _2_classes._2_inheritance.exercise4;

public class Application {

    public static void main(String[] args) {
        TacoBox triTacoBox = new TripleTacoBox();
        triTacoBox.eat();
        System.out.println(triTacoBox.tacosRemaining());

        TacoBox cusTacoBox = new CustomTacoBox(50);
        cusTacoBox.eat();
        System.out.println(cusTacoBox.tacosRemaining());
    }
}
