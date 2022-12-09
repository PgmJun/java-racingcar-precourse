package racingcar.domain;

public class Car implements Comparable<Car> {
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

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }


    @Override
    public int compareTo(Car car) {
        return car.position - this.position;
    }
}
