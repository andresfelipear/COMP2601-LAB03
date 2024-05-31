/**
 * MusicMedia
 *
 * @author Andres Arevalo & Walter Cho
 * @version 1.0
 */
public abstract class MusicMedia
{
    private final String songTitle;
    private final String artistName;

    private static final int MIN_SONG_TITLE_LENGTH = 2;
    private static final int MIN_ARTIST_LENGTH = 3;

    public MusicMedia(final String songTitle,
                      final String artistName)
    {
        validateSongTitle(songTitle);
        validateArtistName(artistName);
        this.songTitle = songTitle;
        this.artistName = artistName;
    }

    private static void validateSongTitle(final String songTitle)
    {
        if(songTitle == null || songTitle.isBlank() || songTitle.length() < MIN_SONG_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid song title");
        }
    }

    private static void validateArtistName(final String artistName)
    {
        if(artistName == null || artistName.isBlank() || artistName.length() < MIN_ARTIST_LENGTH)
        {
            throw new IllegalArgumentException("Invalid song title");
        }
    }

    public String getSongTitle()
    {
        return songTitle;
    }

    public String getArtistName()
    {
        return artistName;
    }

    @Override
    public String toString()
    {
        return String.format("The song %s was created for %s",
                                 songTitle,
                                 artistName);
    }

    public abstract void play();
}