package OPPS.Interfaces;

public class NiceCar {
    private Engine engine;
    private final Media player = new CdPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void musicStart(){
        player.start();
    }

    public void musicStop(){
        player.stop();
    }

    public void upgradeEngine(){
        engine = new ElectricEngine();
    }
}
