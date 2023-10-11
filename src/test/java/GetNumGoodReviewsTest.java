import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class GetNumGoodReviewsTest {
    
    private ReviewCollection createReviewCollection() {
        ArrayList<ProductReview> rl = new ArrayList<>(Arrays.asList(
            new ProductReview("HUE Lights", "Best lights out there"),
            new ProductReview("Thousand Helmet", "Kept my head safe, best purchase ever"),
            new ProductReview("HUE Lights", "Dumbest app ever"),
            new ProductReview("Mythos Book", "This book has a horrible bestiary collection"),
            new ProductReview("Dyson v12", "This was the best vacuum"),
            new ProductReview("Thousand Helmet", "Kept my head safe"),
            new ProductReview("Dyson v12", "Great purchase. Beats the rest"),
            new ProductReview("Dyson v12", "Has a great asbestos filter"),
            new ProductReview("YONEX Racquet", "This is the best"),
            new ProductReview("HUE Lights", "These light are the best for a smart house"),
            new ProductReview("YONEX Racquet", "BEST racquet but overpriced"),
            new ProductReview("YONEX Birdies", "Worth the price"),
            new ProductReview("YONEX Racquet", "It's so-so")));
        ArrayList<String> pl = new ArrayList<>(Arrays.asList("HUE Lights", "Thousand Helmet", "SAMSUNG TV", "Dyson v12", "YONEX Racquet", "YONEX Birdies"));
        
        return new ReviewCollection(rl, pl);
    }

    @DisplayName("getNumGoodReviews Test 1")
    @Test
    void getNumGoodReviews_Test01() {
        ReviewCollection rc = createReviewCollection();
        int result = rc.getNumGoodReviews("HUE Lights");
        int expected = 2;
        assertEquals(expected, result);
    }

    @DisplayName("getNumGoodReviews Test 2")
    @Test
    void getNumGoodReviews_Test02() {
        ReviewCollection rc = createReviewCollection();
        int result = rc.getNumGoodReviews("Thousand Helmet");
        int expected = 1;
        assertEquals(expected, result);
    }

    @DisplayName("getNumGoodReviews Test 3")
    @Test
    void getNumGoodReviews_Test03() {
        ReviewCollection rc = createReviewCollection();
        int result = rc.getNumGoodReviews("Mythos Book");
        int expected = 0;
        assertEquals(expected, result);
    }

    @DisplayName("getNumGoodReviews Test 4")
    @Test
    void getNumGoodReviews_Test04() {
        ReviewCollection rc = createReviewCollection();
        int result = rc.getNumGoodReviews("Dyson v12");
        int expected = 1;
        assertEquals(expected, result);
    }

    @DisplayName("getNumGoodReviews Test 5")
    @Test
    void getNumGoodReviews_Test05() {
        ReviewCollection rc = createReviewCollection();
        int result = rc.getNumGoodReviews("YONEX Racquet");
        int expected = 2;
        assertEquals(expected, result);
    }

    @DisplayName("getNumGoodReviews Test 6")
    @Test
    void getNumGoodReviews_Test06() {
        ReviewCollection rc = createReviewCollection();
        int result = rc.getNumGoodReviews("YONEX Birdies");
        int expected = 0;
        assertEquals(expected, result);
    }
}
