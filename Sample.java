package singleton;

class Singleton {
    private static Singleton obj;
    String s;
    private Singleton(){
        s="smallletters";
    }

    public static Singleton getObject(){
        if(obj==null) {
            obj = new Singleton();

        }
        return obj;
    }
}
public class exampleSingleton{
    public static void main(String[] args) {
            Singleton one,two,three;

            one=Singleton.getObject();
            two=Singleton.getObject();
            three=Singleton.getObject();

            System.out.println("Before Changing :::::: ");
            System.out.println("String S for One : "+one.s);
            System.out.println("String S for Two : "+two.s);
            System.out.println("String S for Three : "+three.s);
            one.s=one.s.toUpperCase();

            System.out.println("\nAfter Changing Only Object of One:::::: ");
            System.out.println("String S for One : "+one.s);
            System.out.println("String S for Two : "+two.s);
            System.out.println("String S for Three : "+three.s);
    }
}
