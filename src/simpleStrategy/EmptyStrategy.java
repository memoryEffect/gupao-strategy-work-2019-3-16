package simpleStrategy;

/**
 * Created by Administrator on 2019/3/16.
 * 无优惠
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("无促销活动");
    }
}
