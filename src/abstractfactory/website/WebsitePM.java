package abstractfactory.website;

import abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Website PM manages website project");
    }
}
