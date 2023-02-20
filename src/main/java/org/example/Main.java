package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country england = new Country("England", 'G');
        Country japan = new Country("Japan", 'J');
        Country ukraine = new Country("Ukraine", 'U');

        Market bus = new Market("bus", List.of(poland, england, ukraine));
        Market taxi = new Market("taxi", List.of(germany, japan, ukraine, england));
        Market cargo = new Market("cargo", List.of(germany, poland, japan));
        Market passengerCar = new Market("passenger car", List.of(germany, japan, ukraine, poland));
        Market businessCar = new Market("business car", List.of(england, poland, ukraine));

        Dimension dimensionOne = new Dimension(130, 150, 350);
        Dimension dimensionTwo = new Dimension(150, 160, 290);
        Dimension dimensionThree = new Dimension(180, 200, 400);
        Dimension dimensionFour = new Dimension(140, 180, 280);
        Dimension dimensionFive = new Dimension(130, 160, 350);
        Dimension dimensionSix = new Dimension(145, 150, 255);
        Dimension dimensionSeven = new Dimension(170, 230, 320);
        Dimension dimensionEight = new Dimension(145, 160, 310);
        Dimension dimensionNine = new Dimension(155, 170, 345);
        Dimension dimensionTen = new Dimension(200, 185, 290);

        Producer producerOne = new Producer("Toyota", "Corolla");
        Producer producerTwo = new Producer("BMW", "i7");
        Producer producerThree = new Producer("BMW", "iX");
        Producer producerFour = new Producer("BMW", "Touring");
        Producer producerFive = new Producer("Ford", "Fiesta");
        Producer producerSix = new Producer("Ford", "Focus");
        Producer producerSeven = new Producer("Audi", "A3");
        Producer producerEight = new Producer("Audi", "A6");
        Producer producerNine = new Producer("Renault", "Kadjar");
        Producer producerTen = new Producer("Volkswagen", "Arteon");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(producerFour, false, bus, "medium", List.of(dimensionFive, dimensionNine)));
        cars.add(new Car(producerFive, true, taxi, "standard", List.of(dimensionEight, dimensionThree, dimensionTwo)));
        cars.add(new Car(producerNine, false, businessCar, "premium", List.of(dimensionSeven)));
        cars.add(new Car(producerSeven, false, cargo, "standard", List.of(dimensionSix, dimensionNine)));
        cars.add(new Car(producerOne, true, businessCar, "medium", List.of(dimensionTen, dimensionTwo, dimensionOne)));
        cars.add(new Car(producerThree, true, passengerCar, "premium", List.of(dimensionFive, dimensionFour)));
        cars.add(new Car(producerEight, false, cargo, "premium", List.of(dimensionFive, dimensionSix)));
        cars.add(new Car(producerSix, true, bus, "standard", List.of(dimensionNine)));
        cars.add(new Car(producerTen, true, taxi, "medium", List.of(dimensionEight, dimensionTen)));
        cars.add(new Car(producerTwo, true, passengerCar, "standard", List.of(dimensionSix, dimensionSeven)));
        cars.add(new Car(producerOne, false, cargo, "medium", List.of(dimensionOne, dimensionThree)));
        cars.add(new Car(producerThree, true, bus, "premium", List.of(dimensionFour, dimensionSeven)));
        cars.add(new Car(producerFive, true, businessCar, "standard", List.of(dimensionEight, dimensionNine)));
        cars.add(new Car(producerSeven, false, taxi, "medium", List.of(dimensionFive)));
        cars.add(new Car(producerNine, false, passengerCar, "premium", List.of(dimensionFive, dimensionNine, dimensionTen)));

        Car.printCountries(cars);
    }

}