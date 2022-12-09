package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car implements Comparable<Car> {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= 4) {
            position += 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " : " + getCarPosition();
    }

    @Override
    public int compareTo(Car car) {
        return car.position - this.position;
    }


    private String getCarPosition() {
        String carPosition = "";
        for (int i = 0; i < position; i++) {
            carPosition += "-";
        }

        return carPosition;
    }


}
