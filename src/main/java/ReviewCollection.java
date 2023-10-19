import java.util.ArrayList;

/* INSTRUCTIONS
 * You plan to analyze product reviews found on a website by looking for 
 * keywords in posted reviews. The ProductReview class is used to represent a 
 * single review. A product review consists of a product name and a review of 
 * that product. The ReviewCollection class is used to represent a collection 
 * of reviews to be analyzed.
 * 
 * The method addReview adds a single product review, represented by a 
 * ProductReview object, to the ReviewCollection object. The addReview method 
 * does the following when it adds a product review:
 * - The ProductReview object is added to the reviewList instance variable.
 * - The product name from the ProductReview object is added to the productList 
 *   instance variable if the product name is not already found in productList.
 * 
 * 
 * The method getNumGoodReviews returns the number of good reviews for a given 
 * product name. A review is considered good if it contains the word "best". If 
 * there are no reviews with a matching product name, the method returns 0.
 * 
 * Note: This check should not be case sensitive. That means if the review 
 * contains "BEST" or "Best" the method should be considered good; however, if 
 * the review contains a word like "asbestos" the review should NOT be considered 
 * good. You will not have to worry about punctuations.
 */

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

    public ReviewCollection(ArrayList<ProductReview> revList, ArrayList<String> prodList) {
        reviewList = revList;
        productList = prodList;
    }

    /* Accessor
     * This accessor is used for testing purposes.
     * Do not change anything.
     */
    public ArrayList<ProductReview> getReviewList() {
        return reviewList;
    }

    /* Accessor
     * This accessor is used for testing purposes.
     * Do not change anything.
     */
    public ArrayList<String> getProductList() {
        return productList;
    }

    /* COMPLETE THIS METHOD
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