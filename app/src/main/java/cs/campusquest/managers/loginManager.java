package cs.campusquest.managers;

public class loginManager {
    /**
     * The user's login ID
     */
    private String sUsername;
    /**
     * The user's password.
     */
    private String sPassword;

    public loginManager(){
        this(null, null);
        return;
    }

    public loginManager(String _sUsername, String _sPassword){
        this.setUsername(_sUsername);
        this.setPassword(_sPassword);
        return;
    }

    public void setUsername(String _sUsername){
        this.sUsername = _sUsername;
        return;
    }

    public void setPassword(String _sPassword){
        this.sPassword = _sPassword;
        return;
    }

    /**
     * Call the serverAPI library to verify whether or not the login credentials provided are
     * identical to those found on the server.
     * @return True if the password and username are found on the server. False otherwise
     */
    public boolean verifyPassword(){
        return(false);
    }
}
