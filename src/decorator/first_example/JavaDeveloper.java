package decorator.first_example;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java code. ";
    }
}
