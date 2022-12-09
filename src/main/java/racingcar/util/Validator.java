package racingcar.util;

import java.util.List;

public class Validator {
    private String ERROR_PREFIX = "[ERROR] ";

    public void validateCarNames(List<String> carNames) {
        for (String carName : carNames) {
            if(carName.length() > 5){
                throw new IllegalArgumentException(ERROR_PREFIX+"이름이 5글자를 초과하였습니다");
            }
        }
    }

}