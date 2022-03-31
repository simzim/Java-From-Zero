package lt.simzim.part_1;

import java.util.LinkedList;

abstract class Animal implements Comparable<Animal>{
    private String name;
    private String type;

    public Animal(String _name, String _type){
        this.name = _name;
        this.type = _type;
    }
    public void setName(String _name){
        this.name = _name;
    }
    public void setType(String _type){
        this.type = _type;
    }
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }

    public int compareTo(Animal pet){
        if(this.getType().equals(pet.getType())){
            return this.name.compareTo(pet.name);
        }
        else {
            return this.type.compareTo(pet.type);
        }
    }
}
