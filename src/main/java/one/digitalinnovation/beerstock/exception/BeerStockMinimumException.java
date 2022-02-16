package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockMinimumException extends Exception {

    public BeerStockMinimumException(Long id, int quantityToDecrement) {
            super(String.format("Beers with %s ID to decrement informed it's below the minimum stock allowed: %s", id, quantityToDecrement));
    }

}
