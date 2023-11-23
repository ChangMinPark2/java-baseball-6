package baseball.domain;

import java.util.List;

public class Computer {
    private final List<Integer> computerNumbers;

    public Computer(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    public int get(int index){
        return computerNumbers.get(index);
    }

    public boolean contains(int index){
        return computerNumbers.contains(index);
    }

    public int size(){
        return computerNumbers.size();
    }
}
