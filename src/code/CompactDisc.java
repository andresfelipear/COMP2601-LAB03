/**
 * CompactDIsc
 *
 * @author user
 * @version 1.0
 */
public class CompactDisc extends MusicMedia
{
    private int tracksNumber;

    public static final String READING_METHOD;
    private static final int MIN_TRACKS;

    static
    {
        READING_METHOD = "laser";
        MIN_TRACKS = 1;
    }

    public CompactDisc(final String songTitle,
                       final String artistName,
                       final int tracksNumber)
    {
        super(songTitle,
              artistName);
        validateTracksNumber(tracksNumber);
        this.tracksNumber = tracksNumber;
    }

    private static void validateTracksNumber(final int tracksNumber)
    {
        if(tracksNumber < MIN_TRACKS)
        {
            throw new IllegalArgumentException("Invalid number of tracks");
        }
    }

    public int getTracksNumber()
    {
        return tracksNumber;
    }

    public void setTracksNumber(final int tracksNumber)
    {
        this.tracksNumber = tracksNumber;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                String.format(" and includes %d ",
                              tracksNumber) +
                (tracksNumber == MIN_TRACKS ? "track": "tracks");
    }

    @Override
    public void play()
    {
        System.out.println("The CD is being played");

    }
}
