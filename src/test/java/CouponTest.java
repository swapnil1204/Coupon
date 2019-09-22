import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CouponTest {
    @Test
    void givenGenerateZeroCoupon_whenGenerate_ThenItShouldReturnZeroCoupon() {
        Coupon coupon = new Coupon(0);
        Assertions.assertEquals(0, coupon.generate());
    }
}
