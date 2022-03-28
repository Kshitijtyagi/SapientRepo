
class Animal{
    private String name;
    Animal(){
        System.out.println("Inside Animal Constructor");
        this.name="Animal";
    }
    public void Walk(){
        System.out.println("Animal Walking");
    }

    public void getAnimalName(){
        System.out.println("Name : "+this.name);
    }
}
class Dog extends Animal{
    private String name="Dog";
    Dog(){
        //super();
        System.out.println("Inside Dog Constructor");
        this.name="Dog";
    }
    @Override
    public void Walk(){
        super.Walk();
        System.out.println("Dog Walking");
    }

    @Override
    public void getAnimalName(){
        super.getAnimalName();
        System.out.println("Name : "+this.name);
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.Walk();
        d1.getAnimalName();

    }
}
