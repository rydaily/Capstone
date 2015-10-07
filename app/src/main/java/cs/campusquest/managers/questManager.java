package cs.campusquest.managers;

import cs.campusquest.dataStructures.quest.questList;

public class questManager {
    /**
     * Contains reference to a linked list of objects. Each object will contain data relevant
     * to a single quest that has either been loaded from the device's local database, or the
     * server.
     */
    private questList hQuestList;

    public questManager(){
        this.hQuestList = new questList();
        return;
    }

    private void populateQuestList(){

    }

    private void addQuest(){
        
    }
}
