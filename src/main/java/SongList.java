import java.util.ArrayList;

/* INSTRUCTIONS
 * A music website keeps track of downloaded music. For each download, the site 
 * uses a SongInfo object to store a song's title and the number of times it has 
 * been downloaded.
 * You will have to implement two methods for the SongList class: getSongInfo
 * and updateDownloads.
 * The getSongInfo method returns a reference to a SongInfo object if an object 
 * with a title that matches the parameter title exists in the downloadList. If 
 * no song in download has a title that matches the parameter title, the method 
 * returns null.
 *
 * EXAMPLE CODE:
 * The variable mySongs is an instance of SongList and the table below represents 
 * the contents of downloadList.
 * Index:           0               1               2
 * SongInfo:    "Little Man"    "Yam Yam"     "Tree Hugger"
 *                  5               2               4
 * 
 * The call mySongs.getSongInfo("Yam Yam") returns a reference to the object in 
 * position 2 of the list.
 * The call mySongs.getSongInfo("Vampire") returns null because there are no 
 * SongInfo objects with that title in the list.
 * 
 * The method updateDownloads takes a list of song titles as a parameter. For 
 * each title in the list, the method updates downloadList,either by incrementing 
 * the download count if a SongInfo object with the same title exists, or by 
 * adding a new SongInfo object with that title and a download count of 1 to 
 * the end of the list. When a new SongInfo object is added to the end of the 
 * list, the order of the already existing entries in downloadList remains 
 * unchanged.
 * 
 * EXAMPLE CODE:
 * The variable mySongs is an instance of SongList and the table below represents 
 * the contents of downloadList.
 * Index:           0               1               2
 * SongInfo:    "Little Man"    "Yam Yam"      "Tree Hugger"
 *                  5               2               4
 * 
 * The variable songTitles has been created with the following entries:
 * {"Hey Jude", "Daria", "Yam Yam", "Russian", "Tree Hugger", "Hey Jude"}
 * 
 * The call mySongs.updateDownloads(songTitles) will have the following result:
 *     0               1               2               3              4               5
 * "Little Man"    "Yam Yam"     "Tree Hugger"     "Hey Jude"      "Daria"        "Russian"
 *     5               3               5               2              1               1
 * 
 * When writing your solution you must use the getSongInfo method.
 */

public class SongList {
    private ArrayList<SongInfo> downloadList;

    public SongList() {
        downloadList = new ArrayList<SongInfo>();
    }

    /* Constructor
     * This constructor is used for testing purposes.
     * Do not change anything.
     */
    public SongList(ArrayList<SongInfo> newList) {
        downloadList = newList;
    }

    /* Accessor
     * This accessor is used for testing purposes.
     * Do not change anything.
     */
    public ArrayList<SongInfo> getDownloadList() {
        return downloadList;
    }

    /* COMPLETE THIS METHOD
     * Returns a reference to the SongInfo object with the requested title if 
     * it exists.
     * @param title the requested title
     * @return a reference to the SongInfo object with the title that matches 
     *          the parameter title if it exists in the list; null otherwise.
     * Postcondition:
     * - No changes were made to downloadList
     */
    public SongInfo getSongInfo(String Title) {
        // Insert your code below

        
        return null;
    }

    /* COMPLETE THIS METHOD
     * Updates downloadList with information from titles.
     * @param titles a list of song titles
     * Postconditions:
     * - there are no duplicate titles in downloadList
     * - no entries were removed from downloadList
     * - all songs in titles are represented in downloadList
     * - for each exisating entry in downloadList, the download count is 
     *   increased by the number of times its title appeared in titles
     * - the order of the existing entries in downloadList is not changed
     * - the first time an object with a title from titles is added to 
     *   downloadList, it is added to the end of the list
     * - new entries in downloadList appear in the same order
     * - for each new entry in downloadList, the download count is equal to 
     *   the number of times its title appeared in titles.
     */
    public void updateDownloads(ArrayList<String> titles) {
        // Insert your code below
        

    }
}