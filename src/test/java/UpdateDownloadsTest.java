import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdateDownloadsTest {
    public ArrayList<SongInfo> createSongList(int version) {
        SongInfo song1 = new SongInfo("Gila Monster");
        SongInfo song2 = new SongInfo("Breezeblocks");
        SongInfo song3 = new SongInfo("Walcott");
        song3.incrementTimesDownloaded();
        song3.incrementTimesDownloaded();
        SongInfo song4 = new SongInfo("Vampire");
        song4.incrementTimesDownloaded();
        SongInfo song5 = new SongInfo("Yam Yam");
        song5.incrementTimesDownloaded();
        SongInfo song6 = new SongInfo("Pocket Crocodile");
        if (version == 1)
            return new ArrayList<>(Arrays.asList(song1, song2, song3, song4));
        else if (version == 2)
            return new ArrayList<>(Arrays.asList(song2, song4, song6));
        else
            return new ArrayList<>(Arrays.asList(song1, song3, song5));
    }

    @DisplayName("updateDownloads Test 1")
    @Test
    void updateDownloads_Test01() {
        SongList sl = new SongList(createSongList(2));
        sl.updateDownloads(new ArrayList<>(Arrays.asList("Gila Monster", "Vampire", "Gila Monster")));
        int result1 = sl.getDownloadList().get(1).getNumOfDownloads();
        int expected1 = 3;
        int result2 = sl.getDownloadList().get(3).getNumOfDownloads();
        int expected2 = 2;
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }

    @DisplayName("updateDownloads Test 2")
    @Test
    void updateDownloads_Test02() {
        SongList sl = new SongList(createSongList(1));
        sl.updateDownloads(new ArrayList<>(Arrays.asList("Gila Monster", "Gila Monster")));
        int result = sl.getDownloadList().get(0).getNumOfDownloads();
        int expected = 3;
        assertEquals(expected, result);
    }

    @DisplayName("updateDownloads Test 3")
    @Test
    void updateDownloads_Test03() {
        SongList sl = new SongList(createSongList(3));
        sl.updateDownloads(new ArrayList<>(Arrays.asList("Tree Hugger", "Buttercup", "Yam Yam")));
        int result1 = sl.getDownloadList().get(3).getNumOfDownloads();
        int expected1 = 1;
        int result2 = sl.getDownloadList().get(4).getNumOfDownloads();
        int expected2 = 1;
        int result3 = sl.getDownloadList().get(2).getNumOfDownloads();
        int expected3 = 3;
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }

    @DisplayName("updateDownloads Test 4")
    @Test
    void updateDownloads_Test04() {
        SongList sl = new SongList(createSongList(2));
        sl.updateDownloads(new ArrayList<>(Arrays.asList("Gila Monster", "Gila Monster")));
        int result = sl.getDownloadList().get(3).getNumOfDownloads();
        int expected = 2;
        assertEquals(expected, result);
    }

    @DisplayName("updateDownloads Test 5")
    @Test
    void updateDownloads_Test05() {
        SongList sl = new SongList(createSongList(2));
        sl.updateDownloads(new ArrayList<>(Arrays.asList("Yam Yam", "Pretty Girls", "Yam Yam", "Pretty Girls")));
        int result1 = sl.getDownloadList().get(3).getNumOfDownloads();
        int expected1 = 2;
        int result2 = sl.getDownloadList().get(4).getNumOfDownloads();
        int expected2 = 2;
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
}
