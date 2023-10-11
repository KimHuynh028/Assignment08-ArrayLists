import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AddReviewTest {

    @DisplayName("addReview Test 1")
    @Test
    void addReview_Test01() {
        ReviewCollection rc = new ReviewCollection();
        rc.addReview(new ProductReview("HUE Lights", "Best lights out there"));
        rc.addReview(new ProductReview("Thousand Helmet", "Kept my head safe"));
        rc.addReview(new ProductReview("HUE Lights", "Worst app ever"));
        rc.addReview(new ProductReview("SAMSUNG TV", "Overpriced pos"));
        
        String pl0 = rc.getProductList().get(0);
        String pl1 = rc.getProductList().get(1);
        String pl2 = rc.getProductList().get(2);

        String expected0 = "HUE Lights";
        String expected1 = "Thousand Helmet";
        String expected2 = "SAMSUNG TV";
        assertEquals(expected0, pl0);
        assertEquals(expected1, pl1);
        assertEquals(expected2, pl2);
    }

    @DisplayName("addReview Test 2")
    @Test
    void addReview_Test02() {
        ReviewCollection rc = new ReviewCollection();
        rc.addReview(new ProductReview("HUE Lights", "Best lights out there"));
        rc.addReview(new ProductReview("Thousand Helmet", "Kept my head safe"));
        rc.addReview(new ProductReview("HUE Lights", "Worst app ever"));
        rc.addReview(new ProductReview("SAMSUNG TV", "Overpriced pos"));
        
        String rl0 = rc.getReviewList().get(1).getReview();
        String rl1 = rc.getReviewList().get(2).getReview();
        String rl2 = rc.getReviewList().get(3).getReview();

        String expected0 = "Kept my head safe";
        String expected1 = "Worst app ever";
        String expected2 = "Over priced pos";
        assertEquals(expected0, rl0);
        assertEquals(expected1, rl1);
        assertEquals(expected2, rl2);
    }

    @DisplayName("addReview Test 3")
    @Test
    void addReview_Test03() {
        ReviewCollection rc = new ReviewCollection();
        rc.addReview(new ProductReview("YONEX Racquet", "This is the best racquet"));
        rc.addReview(new ProductReview("YONEX Racquet", "Great racquet but overpriced"));
        rc.addReview(new ProductReview("YONEX Birdies", "Worth the price"));
        rc.addReview(new ProductReview("YONEX Racquet", "It's so-so"));
        
        
        String pl0 = rc.getProductList().get(0);
        String pl1 = rc.getProductList().get(1);

        String expected0 = "YONEX Racquet";
        String expected1 = "YONEX Birdies";
        assertEquals(expected0, pl0);
        assertEquals(expected1, pl1);
    }

    @DisplayName("addReview Test 4")
    @Test
    void addReview_Test04() {
        ReviewCollection rc = new ReviewCollection();
        rc.addReview(new ProductReview("YONEX Racquet", "This is the best racquet"));
        rc.addReview(new ProductReview("YONEX Racquet", "Great racquet but overpriced"));
        rc.addReview(new ProductReview("YONEX Birdies", "Worth the price"));
        rc.addReview(new ProductReview("YONEX Racquet", "It's so-so"));
        
        String rl0 = rc.getReviewList().get(0).getReview();
        String rl1 = rc.getReviewList().get(1).getReview();
        String rl2 = rc.getReviewList().get(2).getReview();

        String expected0 = "This is the best racquet";
        String expected1 = "Great racquet but overpriced";
        String expected2 = "Worth the price";
        assertEquals(expected0, rl0);
        assertEquals(expected1, rl1);
        assertEquals(expected2, rl2);
    }
}
