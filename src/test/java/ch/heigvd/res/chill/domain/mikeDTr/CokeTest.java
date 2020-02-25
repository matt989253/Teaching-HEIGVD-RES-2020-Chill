package ch.heigvd.res.chill.domain.mikeDTr;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CokeTest {
    @Test
    void thePriceAndNameForCokeShouldBeCorrect() {
        Coke soft = new Coke();
        assertEquals(soft.getName(), Coke.NAME);
        assertEquals(soft.getPrice(), Coke.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCoke() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.Coke";
        OrderRequest request = new OrderRequest(6, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Coke.PRICE.multiply(new BigDecimal(6));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}