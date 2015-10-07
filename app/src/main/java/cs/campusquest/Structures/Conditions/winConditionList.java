package cs.campusquest.Structures.Conditions;

import java.util.LinkedList;

public class winConditionList extends LinkedList {
    public winConditionList(){
        super();
        return;
    }

    public void addCondition(winCondition _hCondition){
        super.push(_hCondition);
        return;
    }

    public winCondition getCondition(int iIndex){
        winCondition hCondition = (winCondition) super.get(iIndex);
        return hCondition;
    }
}
