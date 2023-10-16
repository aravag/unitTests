package task2;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTest {
    @Test
    public void checkCarClass() {
        Car car = new Car("Audi", "A8", 2023);

        assertThat(car, instanceOf(Vehicle.class));
    }

    @Test
    public void checkCarWHeels() {
        Car car = new Car("Mercedes-Benz", "S-Class", 2023);

        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void checkMotorcycleWHeels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2020);

        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void checkCarDriveSpeed() {
        Car car = new Car("Lamborghini", "Huracán", 2023);
        car.testDrive();

        assertEquals(60, car.getSpeed());
    }

    @Test
    public void checkMotorcycleDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "Monster", 2020);
        motorcycle.testDrive();

        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void checkCarPark() {
        Car car = new Car("Porsche", "911", 2023);
        car.testDrive();
        car.park();

        assertEquals(0, car.getSpeed());
    }

    @Test
    public void checkMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2020);
        motorcycle.testDrive();
        motorcycle.park();

        assertEquals(0, motorcycle.getSpeed());
    }

}