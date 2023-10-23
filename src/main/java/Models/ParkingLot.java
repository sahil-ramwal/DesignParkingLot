package Models;

import java.util.List;

public class ParkingLot extends BaseEntity {
    private List<Floor> floorlist;
    private List<EntryGate> entryGates;

    public List<Floor> getFloorlist() {
        return floorlist;
    }

    public void setFloorlist(List<Floor> floorlist) {
        this.floorlist = floorlist;
    }

    public List<EntryGate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<EntryGate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<ExitGate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<ExitGate> exitGates) {
        this.exitGates = exitGates;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    private List<ExitGate> exitGates;
    private String Address;
}
