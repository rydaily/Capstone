package cs.campusquest.parser.json;

import android.util.Log;

import org.json.*;

import java.util.ArrayList;

/**
 * Created by vv on 11/4/2015.
 */
public class JSONHandler {

    public JSONHandler(){
    }

    public JSONObject buildLogin(String _username, String _password){
        //build a jsonobject for login
        //
        JSONObject myJObject = new JSONObject();
        try {
            myJObject.put("Request", "Login");
            myJObject.put("Username", _username);
            myJObject.put("Password", _password);
        } catch (JSONException e) {
            Log.w("campusquest", "jobject login creation problem");
        }

        return myJObject;
    }
}
