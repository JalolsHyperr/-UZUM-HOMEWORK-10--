package UzumHomeWorksJaloliddinMustafoev;

// Фабрика для создания мотоцикла
public class MotorcycleTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Biker();
    }

    @Override
    public Movement createMovement() {
        return new Speed();
    }
}
