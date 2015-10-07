package cs.campusquest.Structures.Conditions.Types;

import cs.campusquest.Structures.Conditions.winCondition;

public class qrWinCondition extends winCondition {
    String sRequiredValue;

    public qrWinCondition(String _sRequiredValue){
        this.sRequiredValue = _sRequiredValue;
        return;
    }
}
