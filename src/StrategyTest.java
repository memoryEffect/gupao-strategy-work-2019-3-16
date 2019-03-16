import rewriteStrategy.PromotionStrategyFactory;
import simpleStrategy.CashbackStrategy;
import simpleStrategy.CouponStrategy;
import simpleStrategy.PromotionActivity;

/**
 * Created by Administrator on 2019/3/16.
 */
public class StrategyTest {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = "COUPON";
//        if(StringUtils.equals(promotionKey,"COUPON")){
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        }else if(StringUtils.equals(promotionKey,"CASHBACK")){
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        }//......
//        promotionActivity.execute();

        String promotionKey="COUPON";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
    }
}
