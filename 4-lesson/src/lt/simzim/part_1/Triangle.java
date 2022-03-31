package lt.simzim.part_1;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {}
    public Triangle(double _a, double _b, double _c) {
        this.a = _a;
        this.b = _b;
        this.c = _c;
    }
        public void setSideA(double _a){
            this.a = _a;
        }
        public void setSideB(double _b){
            this.b = _b;
        }
        public void setSideC(double _c){
            this.c = _c;
        }


        public double getArea(){
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                double p = (a + b + c) / 2.0;
                double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                return result;
            } else {
                System.out.println("Triangle invalid");
                return 0.0;
            }
        }
    }

