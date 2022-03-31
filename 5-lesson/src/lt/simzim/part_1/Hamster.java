package lt.simzim.part_1;

public class Hamster extends Animal{
    private int tail;
    private String color;

    public Hamster(String _name){
        super( _name, "Hamster");
    }

    public void setTail(int _tail){
        this.tail= _tail;
    }
    public int getTail(){
        return this.tail;
    }
    public void setColor(String _color){
        this.color= _color;
    }
    public String getColor(){
        return this.color;
    }
    public String toString() {
        return "Vardas: " + getName() + ", Uodegos ilgis: " + this.tail + ", Spalva: " + this.color;
    }
}
