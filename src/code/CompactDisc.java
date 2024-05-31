/**
 * CompactDIsc
 *
 * @author Andres Arevalo & Walter Chu
 * @version 1.0
 */
public class CompactDisc extends MusicMedia
{
    private final int tracksNumber;
    private final String readingMethod;

    private static final String READING_METHOD;
    private static final int MIN_TRACKS;

    static
    {
        READING_METHOD = "laser";
        MIN_TRACKS = 1;
    }

    /**
     * Constructs a CompactDisc object with the specified song title, artist name, number of tracks, and reading method.
     * Validates the number of tracks to ensure it meets the required criteria.
     *
     * @param songTitle     The title of the song.
     * @param artistName    The name of the artist.
     * @param tracksNumber  The number of tracks on the CD.
     * @param readingMethod The reading method used by the CD.
     */
    public CompactDisc(final String songTitle,
                       final String artistName,
                       final int tracksNumber,
                       final String readingMethod)
    {
        super(songTitle,
              artistName);
        validateTracksNumber(tracksNumber);
        this.tracksNumber = tracksNumber;
        this.readingMethod = readingMethod;
    }

    /**
     * Constructs a CompactDisc object with the specified song title, artist name, and number of tracks.
     * Uses the default reading method.
     *
     * @param songTitle    The title of the song.
     * @param artistName   The name of the artist.
     * @param tracksNumber The number of tracks on the CD.
     */
    public CompactDisc(final String songTitle,
                       final String artistName,
                       final int tracksNumber)
    {
        this(songTitle,
             artistName,
             tracksNumber,
             READING_METHOD);
    }

    /**
     * Validates the number of tracks.
     * Ensures the number of tracks is at least the minimum required.
     *
     * @param tracksNumber The number of tracks to be validated.
     * @throws IllegalArgumentException if the number of tracks is invalid.
     */
    private static void validateTracksNumber(final int tracksNumber)
    {
        if(tracksNumber < MIN_TRACKS)
        {
            throw new IllegalArgumentException("Invalid number of tracks");
        }
    }

    /**
     * Returns the number of tracks on the CD.
     *
     * @return The number of tracks.
     */
    public int getTracksNumber()
    {
        return tracksNumber;
    }

    /**
     * Returns a string representation of the CompactDisc object.
     *
     * @return A string containing the reading method, song title, artist name, and number of tracks.
     */
    @Override
    public String toString()
    {
        return String.format("Compact Disc(CD)(%s): ",
                             readingMethod) +
                super.toString() +
                String.format(" and includes %d ",
                              tracksNumber) +
                (tracksNumber == MIN_TRACKS ? "track" : "tracks");
    }

    /**
     * Plays the CD.
     * Displays a message indicating that the CD is being played.
     */
    @Override
    public void play()
    {
        System.out.println("The CD is being played");

    }
}
