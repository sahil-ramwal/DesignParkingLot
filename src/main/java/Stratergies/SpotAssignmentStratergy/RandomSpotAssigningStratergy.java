package Stratergies.SpotAssignmentStratergy;

import Exceptions.SpotNotAvailableException;
import Models.Enums.SpotStatus;
import Models.Enums.SpotType;
import Models.Floor;
import Models.ParkingLot;
import Models.Spot;

public class RandomSpotAssigningStratergy implements SpotAssigningStratergy {

    @Override
    public Spot getSpot(ParkingLot parkingLot, SpotType spotType) throws SpotNotAvailableException {
        for (Floor floor : parkingLot.getFloorlist()) {
            for (Spot spot : floor.getSpots()) {
                if (spot.getSpotType().equals(spotType) && spot.getStatus().equals(SpotStatus.AVAILABLE)) {
                    spot.setStatus(SpotStatus.BOOKED);
                    return spot;
                }
            }
        }
        throw  new SpotNotAvailableException();
    }
}
