/*
*Задание 1.
Проект Vehicle. Написать следующие тесты с использованием JUnit5:

- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).

- Проверить, что объект Car создается с 4-мя колесами.

- Проверить, что объект Motorcycle создается с 2-мя колесами.

- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
*/

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {

    // Проверить, что экземпляр объекта Car также является экземпляром транспортного
    // средства (используя оператор instanceof).
    @Test
    public void checkCarIsInstanceOfVehicle() {
        Car car = new Car("Gaz", "Ananas", 2007);
        assertTrue(car instanceof Vehicle);
    };

    // Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void checkNumOfWheelsOfCar() {
        Car car = new Car("Gaz", "Ananas", 2007);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void checkNumOfWheelsOfMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Monomaha", 1999);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    // Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
    // (используя метод testDrive()).
    @Test
    public void checkSpeedOfCar() {
        Car car = new Car("Gaz", "Ananas", 2007);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового
    // вождения (используя метод testDrive()).
    @Test
    public void checkSpeedOfMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Monomaha", 1999);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
    // эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void checkSpeedParkingOfCar() {
        Car car = new Car("Gaz", "Ananas", 2007);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
    // эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void checkSpeedParkingOfMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Monomaha", 1999);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
