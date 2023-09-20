package org.example.builder;

public class Director {
    public void buildBugatti(Builder builder){
        builder.brand("Bugatti")
                .color("Blue")
                .nbrDoors(2);
    }
}
