package solid.dip.solution;

public class Login implements Authenticator{
    public boolean auth(User user) {
        //Logic w DB
        return true;
    }
}
