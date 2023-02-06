package Radio;

public class Radio {
    private   int currentPositionNumber;

    public  int getCurrentPositionNumber() {
        return currentPositionNumber;
    }

    public void setCurrentPositionNumber(int newCurrentPositionNumber) {
        if(newCurrentPositionNumber < 0) {
            return;
        }
        if(newCurrentPositionNumber > 9) {
            return;
        }
        currentPositionNumber = newCurrentPositionNumber;
    }
    public  void nextPositionNumber() {
        if(currentPositionNumber == 9) {
            currentPositionNumber = 0;
        }else{
            currentPositionNumber++;
        }
    }
    public  void  prevPositionNumber() {
        if(currentPositionNumber == 0) {
            currentPositionNumber = 9;
        }else{
            currentPositionNumber++;
        }
    }
}
