package abstractfactory.banking;

import abstractfactory.ProjectManager;

public class BankingManager implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Banking manager drinks smoothies and smokes iqos");
    }
}
