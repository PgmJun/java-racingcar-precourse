package racingcar.domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    @Override
    public String toString() {
        return name + " : " + getCarPosition();
    }

    private String getCarPosition() {
        String carPosition = "";
        for(int i = 0; i < position; i++) {
            carPosition += "-";
        }

        return carPosition;
    }

    public void move(int whetherToMove) {
        position += whetherToMove;
    }


}
