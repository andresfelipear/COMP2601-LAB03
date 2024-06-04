/**
 * AudioFile
 *
 * @author Andres Arevalo & Walter Chu
 * @version 1.0
 */
public class AudioFile extends MusicMedia implements FileManager
{
    private final String name;
    private final int sizeBps;

    private static final int MIN_NAME_LENGTH;
    private static final int MIN_SIZE_BPS;
    private static final int MAX_SIZE_BPS;

    static
    {
        MIN_NAME_LENGTH = 2;
        MIN_SIZE_BPS = 8000;
        MAX_SIZE_BPS = 320000;
    }

    /**
     * Constructs an AudioFile object with the specified song title, artist name, file name, and file size.
     * Validates the file name and size to ensure they meet the required criteria.
     *
     * @param songTitle  The title of the song.
     * @param artistName The name of the artist.
     * @param name       The name of the audio file.
     * @param sizeBps    The size of the audio file in bits per second.
     */
    public AudioFile(final String songTitle,
                     final String artistName,
                     final String name,
                     final int sizeBps)
    {
        super(songTitle,
              artistName);
        validateName(name);
        validateSizeBps(sizeBps);
        this.name = name;
        this.sizeBps = sizeBps;
    }

    /**
     * Validates the file size.
     * Ensures the file size is at least the minimum required.
     *
     * @param sizeBps The file size to be validated.
     * @throws IllegalArgumentException if the file size is invalid.
     */
    private static  void validateSizeBps(final int sizeBps)
    {
        if(sizeBps < MIN_SIZE_BPS || sizeBps > MAX_SIZE_BPS)
        {
            throw new IllegalArgumentException(
                    String.format("Invalid file size. It should be between %d and %d",
                                  MIN_SIZE_BPS,
                                  MAX_SIZE_BPS));
        }
    }

    /**
     * Validates the file name.
     * Ensures the file name is not null, not blank, and meets the minimum length requirement.
     *
     * @param name The file name to be validated.
     * @throws IllegalArgumentException if the file name is invalid.
     */
    private static void validateName(final String name)
    {
        if(name == null || name.isBlank() || name.length() < MIN_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Invalid file name");
        }
    }

    /**
     * Returns the name of the audio file.
     *
     * @return The file name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the size of the audio file in bits per second.
     *
     * @return The file size in bps.
     */
    public int getSizeBps()
    {
        return sizeBps;
    }

    /**
     * Returns a string representation of the AudioFile object.
     *
     * @return A string containing the song title, artist name, file name, and file size in bps.
     */
    @Override
    public String toString()
    {
        return "AudioFile: " +
                super.toString() +
                String.format(" is stored in a file with name %s and size %d bps ",
                              name,
                              sizeBps);
    }

    /**
     * Plays the audio file.
     * Displays a message indicating that the audio file is being played.
     */
    @Override
    public void play()
    {
        System.out.println("An audio file is being played");
    }

    /**
     * Saves the audio file.
     * Displays a message indicating that the audio file has been saved.
     *
     * @param fileName The name of the file to be saved.
     */
    @Override
    public void save(final String fileName)
    {
        System.out.println("The audio file has been saved.");
    }

    /**
     * Deletes the audio file.
     * Displays a message indicating that the audio file has been deleted.
     *
     * @param fileName The name of the file to be deleted.
     */
    @Override
    public void delete(final String fileName)
    {
        System.out.println("The audio file has been deleted.");
    }
}
