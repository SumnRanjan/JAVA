package OPPS.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Engine.price);

//        car.acc();
//        car.start();
//        car.stop();
//        car.brake();
//
//        Media carmedia = new Car();
//        car.start();


        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.musicStart();
        niceCar.upgradeEngine();
        niceCar.start();


    }
}
