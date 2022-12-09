package racingcar.Controller;

import racingcar.domain.Car;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController extends Controller{

    private final CarService carService;

    public RacingController(InputView inputView, OutputView outputView, CarService carService) {
        super(inputView, outputView);
        this.carService = carService;
    }

    @Override
    public void run() {
        List<Car> cars = carService.changeNamesToCars(repeat(inputView::inputCarName));
        cars = carService.tryMove(repeat(inputView::inputTryCount), cars);

    }
}
