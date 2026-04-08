// Bus class extending Vehicle
public class Bus extends Vehicle {
    @Override
    public void wheel() {
        System.out.println("Bus has 6 wheels");
    }

    @Override
    public void door() {
        System.out.println("Bus has 2 doors");
    }
}
