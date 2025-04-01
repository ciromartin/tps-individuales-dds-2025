package main.macowin.domain;

public enum Type {
    SACO("Saco"),
    PANTALON("Pantalon"),
    CAMISA("Camisa");

    private String description;

    Type(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
