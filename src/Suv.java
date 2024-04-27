import java.util.ArrayList;

public class Suv extends Car{


    public Suv(Car car) {
        super(car.getCarModel(),car.getYear(),car.getCarColor(),car.getYear());
    }

    public void viewCar(){
        super.viewCar();
    }



}