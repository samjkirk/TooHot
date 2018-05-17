public class TooHot extends tooHotMain {

     public boolean tooHotTest(int temp, boolean summer) {
        if (summer) {
            if ((temp>=60)&&(temp<=100)){
                return true;
            } else {
                return false;
            }
        } else {
            if ((temp>=60)&&(temp<=90)){
                return true;
            } else {
                return false;
            }
        }
    }
}
