package org.example.prototype;

public class Bus extends Vehicle{
    public int doors;
    protected Bus(){};
    protected Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
