package _2_classes._2_inheritance.exercise4;

public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }

    public int tacosRemaining(){
        return tacos;
    }

    public void eat(){
        tacos -= 1;
    }
}
