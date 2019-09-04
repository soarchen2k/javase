package oprator.src.ca.monor.for_while;

/**
 * break  return  continue
 * <p>
 * break : 跳出本层循环
 * return : 跳出所有循环
 * continue : 终止一次条件达到时的循环体，然后继续循环，直到再次达到条件
 */
public class L05_BreakReturnContinue_01 {
    public static void main(String[] args) {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                if (i == 2) {
                    break;
                }
                System.out.println("Hello World ! j:" + j + ", i:" + i);
            }
        }


    }
}
