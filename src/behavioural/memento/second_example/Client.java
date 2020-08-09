package behavioural.memento.second_example;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo git = new GitHubRepo();

        System.out.println("Creating new project v1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github");
        git.setSave(project.save());

        System.out.println("Updating project to v1.1");

        System.out.println("Writing poor code here...");
        Thread.sleep(5000);

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong");

        System.out.println("Rolling back to v1.0");
        project.load(git.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);
    }
}
