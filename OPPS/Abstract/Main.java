package OPPS.Abstract;

public class Main {
    public static void main(String[] args) {
         Son son = new Son(20);
         son.career();

         Parent daughter = new Daughter(19);
         daughter.career();

         Parent.hello();
         son.normal();

        System.out.println(son.VALUE);

//         Parent mom = new Parent(); // we can not create object of abstract class
    }
}
