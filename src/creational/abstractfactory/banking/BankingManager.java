package creational.abstractfactory.banking;

import creational.abstractfactory.ProjectManager;

public class BankingManager implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Banking manager drinks smoothies and smokes iqos");
    }
}
