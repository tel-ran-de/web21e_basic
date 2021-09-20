package disco;

public class Discoteca {
    public static void main(String[] args) {
        Artist art1 = new Artist("Piero", "pop");
        Artist art2 = new Artist("Buratino", "rock");
        Artist art3 = new Artist("Karabas Barabas", "blues");
        Artist art4 = new Artist("Malvina", "romance");

        Song song1 = new Song("Pop 1", 120, art1);
        Song song2 = new Song("Pop 2", 120, art1);
        Song song3 = new Song("Rock 1", 120, art2);
        Song song4 = new Song("Rock 2", 120, art2);
        Song song5 = new Song("Blues 1", 120, art3);
        Song song6 = new Song("Blues 2", 120, art3);
        Song song7 = new Song("Oy ne vecher", 120, art4);
        Song song8 = new Song("Ya vam spoyu", 120, art4);

        Album childs = new Album("Child in our timer", 2021, 6);
        Album dedy = new Album("The old bluesman", 1999, 2);
        childs.addSong(song1);
        childs.addSong(song2);
        childs.addSong(song3);
        childs.addSong(song4);
        childs.addSong(song7);
        childs.addSong(song8);

        dedy.addSong(song5);
        dedy.addSong(song6);

        System.out.println(childs.getStringSongs());
    }
}
