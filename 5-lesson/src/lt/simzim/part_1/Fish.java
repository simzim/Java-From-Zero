package lt.simzim.part_1;

public class Fish extends Animal{
    private int finsNum;

    public Fish(String _name){
        super(_name, "Fish");
    }
    public void setFinsNum(int _finsNum){
        this.finsNum = _finsNum;
    }
    public int getFinsNum(){
        return this.finsNum;
    }
    public String toString() {
        return "Vardas: " + getName() + ", Pelekų kiekis: " + this.finsNum;
    }
}
