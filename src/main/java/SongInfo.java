/*
 * This class is used for the SongList class.
 * No changes should be made to this file.
 */
public class SongInfo {
    private String title;
    private int numOfDl;
    
    /* Constructor
     * Creates a new instance with the given unique title and sets 
     * the number of times downloaded to 1.
     * @param title the unique title of the downloaded song
     */
    public SongInfo(String title) {
        this.title = title;
        numOfDl = 1;
    }

    /* Accessor
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /* Accessor
     * @return number of times downloaded
     */
    public int getNumOfDownloads() {
        return numOfDl;
    }

    /* Mutator
     * Increment the number of times downloaded by 1
     */
    public void incrementTimesDownloaded() {
        numOfDl++;
    }
}
