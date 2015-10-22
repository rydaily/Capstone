package cs.campusquest.managers;

import cs.campusquest.dataStructures.quest.questList;
import cs.campusquest.dummy.DummyContent;

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

    public questManager(boolean useDummy){
        if (useDummy){
            this.hQuestList = new questList(true);
        }

    }

    private void populateQuestList(){
        loadQuestsFromDatabase();
        loadQuestsFromServer();
        return;
    }

    /**
     * Loads quests currently saved in the local database and populates hQuestList by pushing them
     * into it
     */
    private void loadQuestsFromDatabase(){

    }

    /**
     * Loads quests currently on the server and populates hQuestList by pushing them into it
     */
    private void loadQuestsFromServer(){

    }

    private void addQuest(){
        
    }
}
