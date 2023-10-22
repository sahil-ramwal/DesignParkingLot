package Models;

import Models.Enums.SpotType;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoard {
    private Map<SpotType,Integer> availableSpots=new HashMap<>();

    public Map<SpotType, Integer> getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(Map<SpotType, Integer> availableSpots) {
        this.availableSpots = availableSpots;
    }
}
