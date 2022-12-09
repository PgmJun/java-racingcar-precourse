package racingcar.view;

import java.util.List;
import java.util.StringJoiner;

public class OutputView {
    private final static String WINNER_NAME_SEPARATOR = ", ";
    public void printWinners(List<String> winners) {
        print("최종 우승자 : ");
        StringJoiner winnerJoiner = new StringJoiner(WINNER_NAME_SEPARATOR);
        winners.forEach(winner -> winnerJoiner.add(winner));

        println(winnerJoiner.toString());
    }

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

