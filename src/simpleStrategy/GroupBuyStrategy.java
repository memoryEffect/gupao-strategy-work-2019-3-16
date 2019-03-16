package simpleStrategy;

/**
 * Created by Administrator on 2019/3/16.
 * 拼团优惠
 */
public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("拼团，满 20人成团，全团享受团购价");
    }
}
