package lt.simzim.part_1;

public class RightTriangle extends Triangle{

    public RightTriangle(double _a,double _b) {
       super(_a, _b, Math.sqrt(_a * _a + _b * _b));
    }
}
