package UzumHomeWorksJaloliddinMustafoev;

// Фабрика для создания грузового такси
public class TruckTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Trucker();
    }

    @Override
    public Movement createMovement() {
        return new Crawl();
    }
}
