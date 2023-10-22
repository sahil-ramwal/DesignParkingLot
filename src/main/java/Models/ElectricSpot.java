package Models;

public class ElectricSpot extends Spot {
    private ElectricCharger charger;

    public ElectricSpot(ElectricCharger charger) {
        this.charger = charger;
    }
}
