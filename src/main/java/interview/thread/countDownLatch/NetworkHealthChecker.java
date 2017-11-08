package interview.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;
/**
 * 这个类继承了BaseHealthChecker，实现了verifyService()方法。
 * @author yujiansong
 *	  @date 2017年11月8日
 */
public class NetworkHealthChecker extends BaseHealthChecker {
    public NetworkHealthChecker(CountDownLatch latch) {
        super("Network Service", latch);
    }

    @Override
    public void verifyService() {
        System.out.println("Checking " + this.getServiceName());
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getServiceName() + " is UP");
    }
}