package Models;

import Models.Enums.BillPaidStatus;

import java.util.Date;

public class Bill extends BaseEntity {
    private Ticket ticket;
    private Date exitTime;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public BillPaidStatus getBillPaidStatus() {
        return billPaidStatus;
    }

    public void setBillPaidStatus(BillPaidStatus billPaidStatus) {
        this.billPaidStatus = billPaidStatus;
    }

    private double amount;
    private String operator;
    private BillPaidStatus billPaidStatus;

}
