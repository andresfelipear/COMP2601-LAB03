/**
 * AudioFile
 *
 * @author Andres Arevalo & Walter Cho
 * @version 1.0
 */
public class AudioFile extends MusicMedia implements FileManager
{
    private final String name;
    private final int sizeBps;

    private static final int MIN_NAME_LENGTH;
    private static final int MIN_SIZE_BPS;

    static
    {
        MIN_NAME_LENGTH = 2;
        MIN_SIZE_BPS = 320;
    }
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

    private static  void validateSizeBps(final int sizeBps)
    {
        if(sizeBps < MIN_SIZE_BPS)
        {
            throw new IllegalArgumentException("Invalid file size");
        }
    }

    private static void validateName(final String name)
    {
        if(name == null || name.isBlank() || name.length() < MIN_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Invalid file name");
        }
    }

    public String getName()
    {
        return name;
    }

    public int getSizeBps()
    {
        return sizeBps;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                String.format(" is stored in a file with name %s and size %d ",
                              name,
                              sizeBps);
    }

    @Override
    public void play()
    {
        System.out.println("An audio file is being played");
    }

    @Override
    public void save(final String fileName)
    {
        System.out.println("The audio file has been saved.");
    }

    @Override
    public void delete(final String fileName)
    {
        System.out.println("The audio file has been deleted.");
    }
}
