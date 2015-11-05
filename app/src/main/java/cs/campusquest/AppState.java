package cs.campusquest;
import android.app.Application;
import android.content.Context;
import cs.campusquest.managers.*;
/**
 * by extending Application I can store objects/variables in it
 * which can then be accessed by activities using:
 * Application application = (Application)AppState.getContext(); //used for non activities
 * AppState myState = (AppState)application; //^
 *
 * or
 *
 * Appstate myState = (AppState) getApplicationContext(); //used for activities
 */
public class AppState extends Application{

    private static Context mContext;
    private questManager hQuestData;
    private int selectedQuestID;
    private int sessionID;

    public AppState(){
        hQuestData = null;
        this.mContext = this;
        this.selectedQuestID = -1;
    }

    public static void setmContext(Context mContext) {
        AppState.mContext = mContext;
    }

    public int getSessionID() {
        return sessionID;
    }
    public static Context getContext(){
        return mContext;
    }

     public questManager getQuestData(){
         return this.hQuestData;
     }

    public void setQuestData(questManager _hQuestData){

        hQuestData = _hQuestData;
    }

    public void setDummyData() {
        this.hQuestData = new questManager(true);
    }

    public void setSelectedQuestID(int _selectedQuestID){
        //any time setSelectedQuestID is called needs to be in a try catch statement
        boolean isValid = false;
        for (int i = 0; i < this.hQuestData.getQuestList().size(); i++){
            if (this.hQuestData.getQuestList().getQuest(i).getQuestID() == _selectedQuestID){
                isValid = true;
            }
        }

        if (isValid) {
            this.selectedQuestID = _selectedQuestID;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setSelectedQuestActive(){
        hQuestData.getQuestList().getQuestByID(this.selectedQuestID).setActiveFlag(true);
    }

    public int getSelectedQuestID(){ return this.selectedQuestID;}
}
