package builder;

import java.time.LocalDate;

public class BuilderTest {
    public static void main(String[] args) {
        Car lada = new Car.CarBuilder()
                .setId(1L)
                .setName("lada")
                .build();
        Car tesla  = new Car.CarBuilder()
                .setId(2L)
                .setName("Tesla")
                .setCreated(LocalDate.now())
                .setWhatever("whatever")
                .build();
        System.out.println(lada);
        System.out.println(tesla);
    }
}
