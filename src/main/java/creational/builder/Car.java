package creational.builder;

import java.time.LocalDate;

public class Car {
    private Long id;
    private String name;
    private LocalDate created;
    private String whatever;

    private Car(CarBuilder carBuilder){
        this.id = carBuilder.id;
        this.name = carBuilder.name;
        this.created = carBuilder.created;
        this.whatever = carBuilder.whatever;
    }

    static class CarBuilder {
        private Long id;
        private String name;
        private LocalDate created;
        private String whatever;

        public CarBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        public CarBuilder setWhatever(String whatever) {
            this.whatever = whatever;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", whatever='" + whatever + '\'' +
                '}';
    }
}
