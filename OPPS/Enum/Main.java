package OPPS.Enum;

public class Main {
    enum Week implements A{
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;

        //these are enum constant
        // public static and final
        // type will be week


        Week() {
            System.out.println("Constructor called for + " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello how are u");
        }
        // this is not public or protected , only private or default
        // why ? we don't want to create new objects
        // this is not the enum concept
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Wednesday;

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }

        System.out.println(week.ordinal());
        System.out.println(Week.valueOf("Sunday"));


        week.hello();
    }
}
