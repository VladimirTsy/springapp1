package ru.vtsybin.springcourse;

public class ClassicalMusic implements Music {

    public void  doMyInit(){

        System.out.println("Doing my initialisation");

    }
public void doMyDestroy(){

    System.out.println("Do my destruction");
}

    @Override
    public String getSong() {
        return "Hunguraan Rhapsody";
    }
}
