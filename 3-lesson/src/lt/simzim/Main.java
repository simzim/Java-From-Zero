package lt.simzim;

public class Main {

    public static void main(String[] args) {
        int f = 1;
        int i = 2;
        while (++i < 5){
            System.out.println("i " + i);
            f*=i;
        }
            f*=i;
        System.out.println(f);
    }
}
