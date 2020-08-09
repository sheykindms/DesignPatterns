package creational.abstractfactory.website;

import creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Website PM manages website project");
    }
}
