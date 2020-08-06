package solid.dip.violation;
//Класс высокого уровня зависит от класса с реализацией
public class LoginManager {
    Login login = new Login();

    public void login(User user) {
        login.auth(user);
    }
}
