package simpleStrategy;

/**
 * Created by Administrator on 2019/3/16.
 * 返现
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
