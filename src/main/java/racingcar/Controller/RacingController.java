package racingcar.Controller;

import racingcar.domain.Car;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController extends Controller {

    private final CarService carService;

    public RacingController(InputView inputView, OutputView outputView, CarService carService) {
        super(inputView, outputView);
        this.carService = carService;
    }

    @Override
    public void run() {
        List<Car> cars = getCars();
        int tryCount = readTryCount();

        moveCars(tryCount, cars);

        printWinners(cars);
    }


    private List<Car> getCars() {
        List<String> carNames = repeat(inputView::inputCarName);
        List<Car> cars = carService.changeNamesToCars(carNames);
        return cars;
    }

    private int readTryCount() {
        Integer tryCount = repeat(inputView::inputTryCount);
        outputView.printEnter();

        return tryCount;
    }

    public List<Car> moveCars(int tryCount, List<Car> carList) {
        outputView.println("실행 결과");
        for (int i = 0; i < tryCount; i++) {
            tryMove(carList);
            outputView.printEnter();
        }

        return carList;
    }

    private void printWinners(List<Car> cars) {
        List<String> winners = carService.getWinners(cars);
        outputView.printWinners(winners);
    }


    private void tryMove(List<Car> carList) {
        carList.forEach(car -> {
            move(car);
        });
    }

    private void move(Car car) {
        car.move();
        printNowDistance(car);
    }

    private void printNowDistance(Car car) {
        outputView.println(car.toString());
    }


}
