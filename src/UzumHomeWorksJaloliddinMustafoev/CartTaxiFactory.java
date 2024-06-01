package UzumHomeWorksJaloliddinMustafoev;

// Фабрика для создания гужевой повозки
public class CartTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Coachman();
    }

    @Override
    public Movement createMovement() {
        return new Gallop();
    }
}
