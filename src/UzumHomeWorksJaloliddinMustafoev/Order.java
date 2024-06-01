package UzumHomeWorksJaloliddinMustafoev;

// Класс заказа, использующий фабрики для создания объектов
public class Order {
    private Driver driver;
    private Movement movement;

    // Конструктор принимает фабрику такси
    public Order(TaxiFactory factory) {
        this.driver = factory.createDriver();
        this.movement = factory.createMovement();
    }

    // Метод для описания заказа
    public void describeOrder() {
        System.out.println("The order is driven by a " + driver.drive() + " and it will " + movement.move());
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        // Примеры заказов
        TaxiFactory cartFactory = new CartTaxiFactory();
        Order cartOrder = new Order(cartFactory);
        cartOrder.describeOrder();

        TaxiFactory truckFactory = new TruckTaxiFactory();
        Order truckOrder = new Order(truckFactory);
        truckOrder.describeOrder();

        TaxiFactory motorcycleFactory = new MotorcycleTaxiFactory();
        Order motorcycleOrder = new Order(motorcycleFactory);
        motorcycleOrder.describeOrder();

        TaxiFactory carFactory = new CarTaxiFactory();
        Order carOrder = new Order(carFactory);
        carOrder.describeOrder();
    }
}
