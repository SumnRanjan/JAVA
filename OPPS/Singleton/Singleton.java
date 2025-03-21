package OPPS.Singleton;

import OPPS.Access.A;

public class Singleton {

    private Singleton(){

    }

    private  static  Singleton instance;

    public static Singleton getInstance(){
        //check whether one ojb is created or not
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
