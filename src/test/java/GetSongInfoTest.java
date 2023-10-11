import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class GetSongInfoTest {
    public ArrayList<SongInfo> createSongList(int version) {
        SongInfo song1 = new SongInfo("Gila Monster");
        SongInfo song2 = new SongInfo("Breezeblocks");
        SongInfo song3 = new SongInfo("Walcott");
        song3.incrementTimesDownloaded();
        song3.incrementTimesDownloaded();
        SongInfo song4 = new SongInfo("Vampire");
        song4.incrementTimesDownloaded();
        SongInfo song5 = new SongInfo("Iamayam");
        song5.incrementTimesDownloaded();
        SongInfo song6 = new SongInfo("Pocket Crocodile");
        if (version == 1)
            return new ArrayList<>(Arrays.asList(song1, song2, song3, song4));
        else if (version == 2)
            return new ArrayList<>(Arrays.asList(song2, song4, song6));
        else
            return new ArrayList<>(Arrays.asList(song1, song3, song5));
    }

    @DisplayName("getSongInfo Test 1")
    @Test
    void getSongInfo_Test01() {
        SongList sl = new SongList(createSongList(1));
        SongInfo song = sl.getSongInfo("Gila Monster");
        String result = song.getTitle() + song.getNumOfDownloads();
        String expected = "Gila Monster1";
        assertEquals(expected, result);        
    }

    @DisplayName("getSongInfo Test 2")
    @Test
    void getSongInfo_Test02() {
        SongList sl = new SongList(createSongList(2));
        SongInfo song = sl.getSongInfo("Vampire");
        String result = song.getTitle() + song.getNumOfDownloads();
        String expected = "Vampire2";
        assertEquals(expected, result);        
    }

    @DisplayName("getSongInfo Test 3")
    @Test
    void getSongInfo_Test03() {
        SongList sl = new SongList(createSongList(1));
        SongInfo song = sl.getSongInfo("Iamayam");
        // String result = song.getTitle() + song.getNumOfDownloads();
        // String expected = "Vampire1";
        assertEquals(null, song);       
    }

    @DisplayName("getSongInfo Test 4")
    @Test
    void getSongInfo_Test04() {
        SongList sl = new SongList(createSongList(3));
        SongInfo song = sl.getSongInfo("Iamayam");
        String result = song.getTitle() + song.getNumOfDownloads();
        String expected = "Iamayam2";
        assertEquals(expected, result);
    }

    @DisplayName("getSongInfo Test 5")
    @Test
    void getSongInfo_Test05() {
        SongList sl = new SongList(createSongList(2));
        SongInfo song = sl.getSongInfo("Breezeblocks");
        String result = song.getTitle() + song.getNumOfDownloads();
        String expected = "Breezeblocks1";
        assertEquals(expected, result);        
    }

    @DisplayName("getSongInfo Test 6")
    @Test
    void getSongInfo_Test06() {
        SongList sl = new SongList(createSongList(3));
        SongInfo song = sl.getSongInfo("Pocket Crocodile");
        // String result = song.getTitle() + song.getNumOfDownloads();
        // String expected = "Vampire1";
        assertEquals(null, song);        
    }
}
