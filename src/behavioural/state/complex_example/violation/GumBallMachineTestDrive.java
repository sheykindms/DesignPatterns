package behavioural.state.complex_example.violation;
/*
Код GumBallMachine:
1 - Не соответствует ocp принципу SOLID
2 - Переходы между состояниями неочевидны и спрятаны в множестве условных операторов.
3 - Переменные аспекты архитектуры не инкапсулированы
4 - Дальнейшие изменения в коде с большой вероятностью повлекут ошибки при выполнении программы.
 */
public class GumBallMachineTestDrive {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(5);

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.ejectQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.ejectQuarter();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);
    }
}
