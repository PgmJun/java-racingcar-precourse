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
        List<String> carNames = seperateCarNames(Console.readLine());
        validator.validateCarNames(carNames);

        return carNames;
    }

    private List<String> seperateCarNames(String carNames) {
        return Arrays.stream(carNames.split(","))
                .collect(Collectors.toList());
    }
}
