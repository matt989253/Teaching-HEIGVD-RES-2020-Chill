package ch.heigvd.res.chill.domain.Naludrag;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpriteTest {

    @Test
    void thePriceAndNameForSpriteShouldBeCorrect() {
        Sprite sprite = new Sprite();
        assertEquals(sprite.getName(), Sprite.NAME);
        assertEquals(sprite.getPrice(), Sprite.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSprite() {
        Bartender jane = new Bartender();
<<<<<<< HEAD
        String productName = "ch.heigvd.res.chill.domain.Naludrag.Sprite";
=======
        String productName = "ch.heigvd.res.chill.domain.wasadigi.Sprite";
>>>>>>> e07076c158f7afe2133e042be4ee51553106ca79
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Sprite.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}