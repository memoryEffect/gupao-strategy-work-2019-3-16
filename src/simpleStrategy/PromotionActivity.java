package simpleStrategy;

/**
 * Created by Administrator on 2019/3/16.
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
            this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        promotionStrategy.promotion();
    }
}
