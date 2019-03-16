package simpleStrategy;

/**
 * Created by Administrator on 2019/3/16.
 * 优惠券
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
