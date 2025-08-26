package Aug_26_2025.OOP_Basic_1;

public class carMain
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.brand = "Mini Cooper";
        car.color = "green";
        car.price = Integer.parseInt("450000");

        car.display();

    }
}
