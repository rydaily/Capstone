package cs.campusquest.dataStructures.quest;

import cs.campusquest.dummy.DummyContent;

public class quest {
    private int     iQuestID;
    private String  sQuestName;
    private String  sQuestDescription;
    private boolean bIsActive;
    private boolean bIsComplete;

    public quest(){
        this(-1, null, null,false, false);
        return;
    }

    public quest(int _iQuestID, String _sQuestName, String _sQuestDescription, boolean _bIsActive, boolean _bIsComplete){
        setQuestID(_iQuestID);
        setQuestName(_sQuestName);
        setQuestDescription(_sQuestDescription);
        setActiveFlag(_bIsActive);
        setCompletionFlag(_bIsComplete);
    }

    public quest(DummyContent.DummyQuest _dQuest){
        setQuestID(_dQuest.qId);
        setQuestName(_dQuest.qTitle);
        setQuestDescription(_dQuest.qDescription);
        setActiveFlag(_dQuest.qIsActive);
        setCompletionFlag(_dQuest.qIsComplete);
    }

    public void setQuestID(int _iQuestID){
        this.iQuestID = _iQuestID;
        return;
    }

    public void setQuestName(String _sQuestName){
        this.sQuestName = _sQuestName;
        return;
    }

    public void setQuestDescription(String _sQuestDescription){
        this.sQuestDescription = _sQuestDescription;
        return;
    }

    public void setActiveFlag(boolean _bIsActive){
        this.bIsActive = _bIsActive;
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

    public int getQuestID(){
        return this.iQuestID;
    }
    public String getQuestName(){
        return this.sQuestName;
    }

    public String getQuestDescription(){
        return this.sQuestDescription;
    }
}
