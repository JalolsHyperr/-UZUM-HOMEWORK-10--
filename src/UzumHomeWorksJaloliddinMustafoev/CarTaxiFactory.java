package UzumHomeWorksJaloliddinMustafoev;

// Фабрика для создания легкового автомобиля
public class CarTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Racer();
    }

    @Override
    public Movement createMovement() {
        return new Drive();
    }
}
