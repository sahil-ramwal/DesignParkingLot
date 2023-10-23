package Stratergies.SpotAssignmentStratergy;

import Exceptions.SpotNotAvailableException;
import Models.Enums.SpotType;
import Models.ParkingLot;
import Models.Spot;

public interface SpotAssigningStratergy {
    Spot getSpot(ParkingLot parkingLot, SpotType spotType) throws SpotNotAvailableException;
}
