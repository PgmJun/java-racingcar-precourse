package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final OutputView outputView = new OutputView();

    public List<Car> changeNamesToCars(List<String> carNames) {
        List<Car> carList = carNames.stream()
                .map(carName -> new Car(carName))
                .collect(Collectors.toList());

        return carList;
    }

    public List<Car> tryMove(int tryCount, List<Car> carList) {
        outputView.println("실행 결과");
        for(int i = 0;i < tryCount; i++) {
            moveCar(carList);
            outputView.printEnter();
        }

        return carList;
    }

    private void moveCar(List<Car> carList) {
        carList.forEach(car -> {
            car.move(getMoveDistance());
            printNowDistance(car);
        });
    }

    private void printNowDistance(Car car) {
        outputView.println(car.toString());
    }


    private int getMoveDistance() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if(randomNumber >= 4) {
            return 1;
        }
        return 0;
    }

}
