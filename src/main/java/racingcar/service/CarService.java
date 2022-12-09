package racingcar.service;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public List<Car> changeNamesToCars(List<String> carNames) {
        List<Car> carList = carNames.stream()
                .map(carName -> new Car(carName))
                .collect(Collectors.toList());

        return carList;
    }

}
