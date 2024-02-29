package main;

import classes.*;

import java.util.HashMap;

public class Main {

    public enum FeedType {
        OMNIVORE,
        HERBIVORE,
        CARNIVORE
    }

    public static void main(String[] args) {

        ZooKeeper zooKeeper = new ZooKeeper("John");
        Zoo zoo = new Zoo("ZOO", zooKeeper, new HashMap<>());
        Animal anotherAnimal = new Zebra("Marty", 15);
        Animal anotherAnimal_2 = new Lion("Simba", 5);
        zoo.addAnimal(anotherAnimal, "grass");
        zoo.addAnimal(anotherAnimal_2, "Meat");
        zoo.addAnimal(new Cat("Maya", 2), "Fish");

        zoo.feedAllAnimals();

        FeedType feedType = FeedType.OMNIVORE;

    }
}
