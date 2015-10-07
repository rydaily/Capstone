package cs.campusquest.managers;

public class loginManager {
    private String sUsername;
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
}
