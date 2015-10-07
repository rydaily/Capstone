package cs.campusquest.dataStructures.quest;

public class quest {
    private int     iQuestID;
    private String  sQuestName;
    private String  sQuestDescription;
    private boolean bIsComplete;

    public quest(){
        this(-1, null, null, false);
        return;
    }

    public quest(int _iQuestID, String _sQuestName, String _sQuestDescription, boolean _bIsComplete){
        setQuestID(_iQuestID);
        setQuestName(_sQuestName);
        setsQuestDescription(_sQuestDescription);
        setCompletionFlag(_bIsComplete);
    }

    public void setQuestID(int _iQuestID){
        this.iQuestID = _iQuestID;
        return;
    }

    public void setQuestName(String _sQuestName){
        this.sQuestName = _sQuestName;
        return;
    }

    public void setsQuestDescription(String _sQuestDescription){
        this.sQuestDescription = _sQuestDescription;
        return;
    }

    public void setCompletionFlag(boolean _bIsComplete){
        this.bIsComplete = _bIsComplete;
        return;
    }

    /**
     * Flags a quest as complete when called
     */
    public void setComplete(){
        this.bIsComplete = true;
        return;
    }

    /**
     * Checks the quest's boolean flag to determine whether this quest has been flagged as completed
     * or not.
     * @return True if the quest has been flagged as complete, and false otherwise.
     */
    public boolean isComplete(){
        return(this.bIsComplete);
    }
}
