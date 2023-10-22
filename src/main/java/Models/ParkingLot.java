package Models;

import java.util.List;

public class ParkingLot extends BaseEntity {
    private List<Floor> floorlist;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;
    private String Address;
}
