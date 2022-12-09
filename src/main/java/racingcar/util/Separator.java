package racingcar.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Separator {

    private static String NAME_SEPARATOR = ",";

    public List<String> carNamesSeparate(String carNames) {
        List<String> separatedCarNames = Arrays.stream(carNames.trim().split(NAME_SEPARATOR))
                .collect(Collectors.toList());

        return separatedCarNames;
    }
}
