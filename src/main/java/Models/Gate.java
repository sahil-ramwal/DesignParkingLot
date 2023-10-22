package Models;

import Models.Enums.GateStatus;
import Models.Enums.GateType;

public abstract class Gate {
    private Integer number;
    private  String operator;
    private GateType gateType;
    private GateStatus gateStatus;

}
