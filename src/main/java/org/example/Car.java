package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Car {

    private final Producer producer;
    private final boolean isAutomaticGear;
    private final Market market;
    private final String segment;
    private final List<Dimension> dimensions;

    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, List<Dimension> dimensions) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public String getSegment() {
        return segment;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public static void printCountries(List<Car> cars) {
        Set<String> countriesToPrint = new HashSet<>();
        cars.forEach(car -> {
            for (int i = 0; i < car.getDimensions().size(); i++) {
                if (car.getDimensions().get(i).getTrunkCapacity() > 300 && car.getProducer().getModel().equals("BMW") && car.isAutomaticGear()) {
                    car.getMarket().getCountries().forEach(country -> countriesToPrint.add(country.toString()));
                }
            }
        });
        countriesToPrint.forEach(System.out::println);
    }
}
