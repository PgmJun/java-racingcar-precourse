package racingcar.view;

public class OutputView {

    public void printError(Exception error) {
        System.out.println(error.getMessage());
    }

    public void print(String message) {
        System.out.print(message);
    }

    public void println(String message) {
        System.out.println(message);
    }

    public void printEnter() {
        System.out.println();
    }

}

