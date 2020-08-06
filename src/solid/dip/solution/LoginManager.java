package solid.dip.solution;

//Ввели абстракцию от интерфейса, а не напрямую
public class LoginManager {
    Authenticator authenticator;

    public LoginManager(Authenticator authenticate) {
        this.authenticator = authenticate;
    }

    public void login(User user) {
        authenticator.auth(user);
    }
}
