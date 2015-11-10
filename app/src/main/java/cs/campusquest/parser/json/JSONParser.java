package cs.campusquest.parser.json;

/**
 * Created by vv on 11/10/2015.
 */
import android.util.Log;

import org.json.*;

public final class JSONParser {
    //in this class, function needs to take a string and return a JSONObject or an array of the key and values of the JSONString TODO decide on implementation
    private JSONParser(){
    }

    public static JSONObject parseString (String _message){
        JSONObject myJObject = new JSONObject();
        try {
            myJObject = new JSONObject(_message);
        } catch (JSONException e){
            Log.v("campusquest", "jobject parse creation problem");
        }

        return myJObject;
    }

    public static String interpret (JSONObject _jobject){
        return "thisiskillingmybrain";
    }
}
