/**
 * MusicMedia
 *
 * @author Andres Arevalo & Walter Chu
 * @version 1.0
 */
public abstract class MusicMedia
{
    private final String songTitle;
    private final String artistName;

    private static final int MIN_SONG_TITLE_LENGTH = 2;
    private static final int MIN_ARTIST_LENGTH = 3;

    /**
     * Constructs a MusicMedia object with the specified song title and artist name.
     * Validates the input parameters to ensure they meet the required criteria.
     *
     * @param songTitle   The title of the song.
     * @param artistName  The name of the artist.
     */
    public MusicMedia(final String songTitle,
                      final String artistName)
    {
        validateSongTitle(songTitle);
        validateArtistName(artistName);
        this.songTitle = songTitle;
        this.artistName = artistName;
    }

    /**
     * Validates the song title.
     * Ensures the song title is not null, not blank, and has a minimum length.
     *
     * @param songTitle The title of the song to be validated.
     * @throws IllegalArgumentException if the song title is invalid.
     */
    private static void validateSongTitle(final String songTitle)
    {
        if(songTitle == null || songTitle.isBlank() || songTitle.length() < MIN_SONG_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid song title");
        }
    }

    /**
     * Validates the artist name.
     * Ensures the artist name is not null, not blank, and has a minimum length.
     *
     * @param artistName The name of the artist to be validated.
     * @throws IllegalArgumentException if the artist name is invalid.
     */
    private static void validateArtistName(final String artistName)
    {
        if(artistName == null || artistName.isBlank() || artistName.length() < MIN_ARTIST_LENGTH)
        {
            throw new IllegalArgumentException("Invalid song title");
        }
    }

    /**
     * Returns the title of the song.
     *
     * @return The song title.
     */
    public String getSongTitle()
    {
        return songTitle;
    }

    /**
     * Returns the name of the artist.
     *
     * @return The artist name.
     */
    public String getArtistName()
    {
        return artistName;
    }

    /**
     * Returns a string representation of the MusicMedia object.
     *
     * @return A string containing the song title and artist name.
     */
    @Override
    public String toString()
    {
        return String.format("The song %s was created for %s",
                                 songTitle,
                                 artistName);
    }

    /**
     * Abstract method to play the music media.
     * Must be implemented by subclasses to define specific behavior for playing the media.
     */
    public abstract void play();
}