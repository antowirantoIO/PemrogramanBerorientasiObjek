package javaClassApplication.master.main;

public class Element {
    //Data Members
    private String name;
    private int number;
    private String symbol;
    private double mass;
    private int period;
    private int group;
    //Constructor
    public Element (String elementName, int elementNumber,
                    String elementSymbol, double elementMass,
                    int elementPeriod, int elementGroup) {
        name = elementName;
        number = elementNumber;
        symbol = elementSymbol;
        mass = elementMass;
        period = elementPeriod;
        group  = elementGroup;
    }
    //Returns the element’s name
    public String getName () {
        return name;
    }
    //Returns the element’s atomic number
    public int getNumber () {
        return number;
    }
    //Returns the element’s 1- or 2-letter symbol
    public String getSymbol () {
        return symbol;
    }

    public double getMass () {
        return mass;
    }
    //Returns the element’s period
    public int getPeriod () {
        return period;
    }
    //Returns the element’s group
    public int getGroup () {
        return group;
    }
}
