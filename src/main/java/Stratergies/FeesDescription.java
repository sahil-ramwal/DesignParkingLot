package Stratergies;

public class FeesDescription {
    /**
     * fees will be stored in db ,this class is for changing fees without affecting the code.
     */
    public int smallcarFees=100;
    public int mediumCarFees=200;

    public void setSmallcarFees(int smallcarFees) {
        this.smallcarFees = smallcarFees;
    }

    public void setMediumCarFees(int mediumCarFees) {
        this.mediumCarFees = mediumCarFees;
    }

    public void setLargeCarFees(int largeCarFees) {
        this.largeCarFees = largeCarFees;
    }

    public void setLuxuryCarFees(int luxuryCarFees) {
        LuxuryCarFees = luxuryCarFees;
    }

    public int largeCarFees=300;

    public int getSmallcarFees() {
        return smallcarFees;
    }

    public int getMediumCarFees() {
        return mediumCarFees;
    }

    public int getLargeCarFees() {
        return largeCarFees;
    }

    public int getLuxuryCarFees() {
        return LuxuryCarFees;
    }

    public int LuxuryCarFees=400;

}
