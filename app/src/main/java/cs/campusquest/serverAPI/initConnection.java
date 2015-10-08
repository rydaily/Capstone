package cs.campusquest.serverAPI;

public class initConnection {
    private String sServerIP;
    private int    iServerPort;

    public initConnection(){
        this(null, -1);
        return;
    }
    
    public initConnection(String _sServerIP, int _iServerPort){
        setServerIP(_sServerIP);
        setServerPort(_iServerPort);
        return;
    }

    public void setServerIP(String _sServerIP){
        this.sServerIP =  _sServerIP;
        return;
    }

    public void setServerPort(int _iServerPort){
        this.iServerPort = _iServerPort;
        return;
    }
}
