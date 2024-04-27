public class Sedan extends Car{

    public Sedan(Car car){
        super(car.getCarModel(),car.getYear(),car.getCarColor(),car.getYear());

    }

    public void viewCar(){
        super.viewCar();
    }

}