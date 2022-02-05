package pl.edu.wszib.interfaces.lab15;

public class VinylPlayer extends MusicPlayer{

    public VinylPlayer(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("Vinyl odtwarza" + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("Vinyl pauza");
    }

    @Override
    public void stop() {
        System.out.println("Vinyl stop");
    }
}
