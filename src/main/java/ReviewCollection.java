package main.java;

import java.util.ArrayList;

public class ReviewCollection {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    /*
     * Constructs a ReviewCollector object and initializes the instance variables.
     */
    public ReviewCollection() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    /*
     * Adds a new review to the collection of reviews.
     */
    public void addReview(ProductReview prodReview) {
        // Insert your code below


    }

    /* COMPLETE THIS METHOD
     * Returns the number of good reviews for a given product name.
     * @param prodName the product name to check for good reviews
     * @return the number of good reviews
     */
    public int getNumGoodReviews(String prodName) {
        // Insert your code below

        return 0;
    }
}