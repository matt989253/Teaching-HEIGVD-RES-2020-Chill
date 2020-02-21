package ch.heigvd.res.chill.domain.sinyks;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public abstract class BFM implements IProduct{
    public final static String NAME = "BFM";
    public final static BigDecimal PRICE = new BigDecimal(3.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}
