package racingcar.util;

import java.util.List;

public class Validator {
    private String ERROR_PREFIX = "[ERROR] ";

    public void validateCarNames(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException(ERROR_PREFIX + "이름이 5글자를 초과하였습니다");
            }
        }
    }

    public void validateCarCount(String carNames) {
        if (carNames.equals("")) {
            throw new IllegalArgumentException(ERROR_PREFIX + "차의 이름이 입력되지 않았습니다.");
        }
    }

    public int validateTryCount(String tryCount) {
        try {
            return Integer.parseInt(tryCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_PREFIX + "시도할 횟수는 정수 값이어야 합니다.");
        }
    }

}
