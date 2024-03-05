package _1_introduction.exercise15;

public class Application {

    public static void main(String[] args) {
        printRectangle(2, 3);
    }

    static void printStars(int n){
        char[] starsArr = new char[n];

        for(int i = 0; i < starsArr.length; i++){
            starsArr[i] = '*';
        }
        System.out.println(starsArr);
    }
    
    static void printSquare(int n){
        for(int i = 0; i < n; i++){
            printStars(n);
        }
    }

    static void printRectangle(int height, int width){
        for(int i = 0; i < height; i++){
            printStars(width);
        }
    }
}
