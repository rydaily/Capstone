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

    public AppState(){
        hQuestData = null;
        this.mContext = this;
        this.selectedQuestID = -1;
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
        this.selectedQuestID = _selectedQuestID;
    }

    public int getSelectedQuestID(){ return this.selectedQuestID;}
}
