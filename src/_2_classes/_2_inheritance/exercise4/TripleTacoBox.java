package _2_classes._2_inheritance.exercise4;

public class TripleTacoBox implements TacoBox{
    private int tacos;

    public TripleTacoBox(){
        this.tacos = 3;
    }

    public int tacosRemaining(){
        return tacos;
    }

    public void eat(){
        tacos -= 1;
    }
}
