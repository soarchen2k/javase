package Exception;

public class TryCatchExeption {
    public static void main(String[] args) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();  //Operation
        }
    }
}
