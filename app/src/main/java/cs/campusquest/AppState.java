package cs.campusquest;
import android.app.Application;
import android.content.Context;
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

    public AppState(){
        this.mContext = this;
    }
}
