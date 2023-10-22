package Models;

import Models.Enums.SpotStatus;
import Models.Enums.SpotType;

public abstract class  Spot extends BaseEntity {
    private int spotNo;
    private SpotType spotType;
    private SpotStatus status;

    public int getSpotNo() {
        return spotNo;
    }

    public void setSpotNo(int spotNo) {
        this.spotNo = spotNo;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    private Floor floor;
}
