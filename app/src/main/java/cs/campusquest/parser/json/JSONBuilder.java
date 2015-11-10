package cs.campusquest.parser.json;

import android.util.Log;

import org.json.*;

import java.util.ArrayList;

/**
 * Created by vv on 11/4/2015.
 */
public class JSONBuilder {
    //in this class, each function returns a JSONObject of the function it describes
    //ie requestLogin means it is a JSONObject that contains the necessary fields and components for a login request
    //in use, do requestLogin(un, pw).toString() to get a formatted JSONString to pass into a socket to the server

    public JSONBuilder(){
    }

    public JSONObject requestLogin(String _username, String _password){
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

    public JSONObject requestRegister(String _username, String _email, String _password){
        JSONObject myJObject = new JSONObject();
        try {
            myJObject.put("Request", "Register");
            myJObject.put("Username", _username);
            myJObject.put("Email", _email);
            myJObject.put("Password", _password);
        } catch (JSONException e){
            Log.v("campusquest", "jobject register creation problem");
        }

        return myJObject;
    }

    public JSONObject requestQuestQuery(){
        JSONObject myJObject = new JSONObject();
        try {
            myJObject.put("Request", "QuestQuery");
        } catch (JSONException e){
            Log.v("campusquest", "jobject questquery creation problem");
        }

        return myJObject;
    }

    public JSONObject requestQuest(int _questID){
        JSONObject myJObject = new JSONObject();
        try {
            myJObject.put("Request", "Quest");
            myJObject.put("QuestID", Integer.toString(_questID));
        } catch (JSONException e) {
            Log.v("campusquest", "jobject quest creation problem");
        }

        return myJObject;
    }


}
