package rewriteStrategy;

import simpleStrategy.CashbackStrategy;
import simpleStrategy.EmptyStrategy;
import simpleStrategy.GroupBuyStrategy;
import simpleStrategy.PromotionStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/16.
 * 工厂类
 */
public class PromotionStrategyFactory  {
    private static Map<String, PromotionStrategy> PROMOTION_STARTEGY_MAP = new HashMap<String,PromotionStrategy>();

    static {
        PROMOTION_STARTEGY_MAP.put(PromotionKey.COUPON, new CashbackStrategy());
        PROMOTION_STARTEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTION_STARTEGY_MAP.put(PromotionKey.CASHBACK, new GroupBuyStrategy());
    }
    private static final  PromotionStrategy NON_PROMOTION=new EmptyStrategy();
    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = (PromotionStrategy) PROMOTION_STARTEGY_MAP.get(promotionKey);
        return promotionStrategy==null?NON_PROMOTION:promotionStrategy;
    }


    private interface PromotionKey{
        String COUPON ="COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
