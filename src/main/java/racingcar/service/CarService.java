package racingcar.service;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public List<Car> changeNamesToCars(List<String> carNames) {
        List<Car> carList = carNames.stream()
                .map(carName -> new Car(carName))
                .collect(Collectors.toList());

        return carList;
    }

    public List<String> getWinners(List<Car> cars) {
        Collections.sort(cars);
        return findWinners(cars);
    }


    private List<String> findWinners(List<Car> cars) {
        List<String> maxPositionCarNames = new ArrayList<>();
        int maxPosition = getMaxPosition(cars);

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                maxPositionCarNames.add(car.getName());
            }
        }

        return maxPositionCarNames;
    }

    private int getMaxPosition(List<Car> cars) {
        int maxPosition = cars.get(0).getPosition();
        return maxPosition;
    }

}
