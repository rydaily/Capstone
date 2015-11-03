package cs.campusquest.dataStructures.quest;

import java.util.LinkedList;

import cs.campusquest.dummy.DummyContent;

public class questList extends LinkedList {

    public questList(){
        super();
        return;
    }

    public questList(boolean useDummy){
        super();
        if (useDummy) {
            for (int x = 0; x < DummyContent.dAvailableQuestsList.size(); x++){
                addQuest(new quest(DummyContent.dAvailableQuestsList.get(x)));
            }
            return;
        }
    }

    public void addQuest(quest hQuest){
        super.push(hQuest);
        return;
    }

    public quest getQuest(int index){
        return (quest)get(index);
    }

    public quest getQuestByID(int id){
         for (int i = 0; i < size(); i++){
             if (getQuest(i).getQuestID() == id){
                 return (quest)get(i);
             }
         }

        throw new IllegalArgumentException();
    }
}
