package OPPS.Static;

public class Main {
    public static void main(String[] args) {
//        Human Suman = new Human(12 , "Smi" , 450000 , false);
//        Human Ram = new Human(34 , "Rama" , 45000 , true);
//
//      System.out.println(Suman.population);
//        System.out.println(Ram.population);

        //this is the correct way
//        System.out.println(Human.population);

        Human.message();

        fun();
    }

    static void  fun(){
//         i can not use this because it required instance but function you are using it is not depended on instances
//        greeting();

        //we can not use non static stuff without referencing  their instance in a static context

        Main obj = new Main();
        obj.greeting();
    }


    //we know something which is not static , belongs to obj
    void greeting(){
//          fun(); we can do that
        System.out.println("Hello Bhai");
    }
}
