package disco;

public class Song {
    private String title;
    private int length;
    private Artist artist;

    public Song(String title, int length, Artist artist) {
        this.title = title;
        this.length = length;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
