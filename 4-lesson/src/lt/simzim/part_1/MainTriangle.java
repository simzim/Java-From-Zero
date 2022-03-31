package lt.simzim.part_1;
import java.util.ArrayList;

public class MainTriangle {

    static void allTriangle(ArrayList<Triangle> listTri) {
        double total = 0;
        int count = 1;
        for (Triangle item : listTri){
            System.out.print(count + ". Triangle area ---> ");
            System.out.println(item.getArea());
            total += item.getArea();
            count++;
        }
        System.out.print(count + ". The sum of the areas of all triangles ---> " + total);
    }

    public static void main(String[] args) {
       Triangle tri1 = new Triangle(15, 14, 12);
       EquilateralTriangle tri2 = new EquilateralTriangle(8);
       RightTriangle tri3 = new RightTriangle( 7, 18);
       ArrayList<Triangle> listTri = new ArrayList<>();
       listTri.add(tri1);
       listTri.add(tri2);
       listTri.add(tri3);
       allTriangle(listTri);
    }
}
