/*
 * This class is used for ReviewCollection.
 * No changes should be made to this file.
 */
public class ProductReview {
    private String name;
    private String review;

    /* Constructor
     * Constructs a ProductReview object and initializes the instance variables
     */
    public ProductReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    /* Accessor
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /* Accessor
     * @return the review of the product
     */
    public String getReview() {
        return review;
    }
}
