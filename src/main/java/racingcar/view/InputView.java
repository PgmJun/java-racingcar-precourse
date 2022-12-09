package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private final OutputView outputView = new OutputView();
    private final Validator validator = new Validator();

    public List<String> inputCarName() {
        outputView.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        List<String> separatedCarNames = separateCarNames(readCarNames());
        validator.validateCarNames(separatedCarNames);

        return separatedCarNames;
    }

    private String readCarNames() {
        String carNames = Console.readLine();
        validator.validateCarCount(carNames);
        return carNames;
    }

    private List<String> separateCarNames(String carNames) {
        List<String> separatedCarNames = Arrays.stream(carNames.split(","))
                .collect(Collectors.toList());

        return separatedCarNames;
    }

    public int inputTryCount() {
        outputView.println("시도할 회수는 몇회인가요?");
        int tryCount = validator.validateTryCount(Console.readLine());

        return tryCount;
    }
}
