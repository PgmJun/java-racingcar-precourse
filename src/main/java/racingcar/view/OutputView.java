package racingcar.view;

import java.util.List;

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

    public void printWinners(List<String> winners) {
        print("최종 우승자 : ");
        for(int i =0;i<winners.size();i++) {
            if(i != winners.size()-1) {
                print(winners.get(i) + ", ");
                continue;
            }
            println(winners.get(i));
        }
    }

}

