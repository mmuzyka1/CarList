package org.example;

public class Producer {

    private final String model;
    private final String type;

    public Producer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }
}
