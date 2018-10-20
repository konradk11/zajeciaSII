package dzień_2;


interface Car {
    int maxSpeed();
}

class Mercedes implements Car {
    int price;
    String color;
    int maxSpeed;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }

}

class Audi implements Car {
    int price;
    String color;
    int maxSpeed;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int maxSpeed() {
        return 200;
    }

//    public Audi(int price, String colour) {
//        this.price = price;
//        this.colour = colour;
//    }
}

class BMW implements Car {

    int price;
    String color;
    int maxSpeed;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int maxSpeed() {
        return 300;
    }
}

class CarsFactory {
    public static Car chooseCar(int maxSpeed, int price, String colour) {
        Car car = null;

        switch (maxSpeed) {
            case 200:
                car = new Audi();
                break;
            case 250:
                car = new Mercedes();
                break;
            case 300:
                car = new BMW();
                break;
            default:
                System.out.println("Have no idea.");
        }
        return car;
    }
}


public class zadanieWzorzecFabryki {
    public static void main(String[] args) {
        Car first = CarsFactory.chooseCar(200, 100, "blue");
        Car scnd = CarsFactory.chooseCar(250, 100, "red");
        Car thrd = CarsFactory.chooseCar(300, 100, "black");

        System.out.println(first.getClass().toString());
        System.out.println(scnd.getClass().toString());
        System.out.println(thrd.getClass().toString());

    }

}
