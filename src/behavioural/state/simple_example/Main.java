package behavioural.state.simple_example;

public class Main {
    public static void main(String[] args) {
        Canvas canvas1 = new Canvas();
        canvas1.setCurrentTool(new SelectionTool());
        canvas1.mouseDown();
        canvas1.mouseUp();

        Canvas canvas2 = new Canvas();
        canvas2.setCurrentTool(new EraserTool());
        canvas2.mouseDown();
        canvas2.mouseUp();
    }
}
