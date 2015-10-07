package cs.campusquest.dataStructures.quest;

import java.util.LinkedList;

public class questList extends LinkedList {

    public questList(){
        super();
        return;
    }

    public void addQuest(quest hQuest){
        super.push(hQuest);
        return;
    }
}
