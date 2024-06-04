/**
 * VinylRecord
 *
 * @author Andres Arevalo & Walter Chu
 * @version 1.0
 */
public class VinylRecord extends MusicMedia
{
    private final int tracksNumber;
    private final int sizeInches;
    private final int weightGrams;

    private static final int VALID_SIZE_INCHES_LARGE;
    private static final int VALID_SIZE_INCHES_MEDIUM;
    private static final int VALID_SIZE_INCHES_SMALL;

    private static final int VALID_WEIGHT_SMALL_SIZE_LARGE;
    private static final int VALID_WEIGHT_MEDIUM_SIZE_LARGE;
    private static final int VALID_WEIGHT_LARGE_SIZE_LARGE;

    private static final int VALID_WEIGHT_SIZE_MEDIUM;

    private static final int VALID_WEIGHT_SIZE_SMALL;

    private static final int MIN_TRACKS;

    static
    {
        MIN_TRACKS = 1;

        VALID_SIZE_INCHES_LARGE = 12;
        VALID_SIZE_INCHES_MEDIUM = 10;
        VALID_SIZE_INCHES_SMALL = 7;

        VALID_WEIGHT_SMALL_SIZE_LARGE = 140;
        VALID_WEIGHT_MEDIUM_SIZE_LARGE = 180;
        VALID_WEIGHT_LARGE_SIZE_LARGE = 200;

        VALID_WEIGHT_SIZE_MEDIUM = 100;

        VALID_WEIGHT_SIZE_SMALL = 40;
    }

    /**
     * Constructs a VinylRecord object with the specified song title, artist name, number of tracks, size in inches, and weight in grams.
     * Validates the number of tracks, size in inches, and weight in grams to ensure they meet the required criteria.
     *
     * @param songTitle    The title of the song.
     * @param artistName   The name of the artist.
     * @param tracksNumber The number of tracks on the vinyl record.
     * @param sizeInches   The size of the vinyl record in inches.
     * @param weightGrams  The weight of the vinyl record in grams.
     */
    public VinylRecord(final String songTitle,
                       final String artistName,
                       final int tracksNumber,
                       final int sizeInches,
                       final int weightGrams)
    {
        super(songTitle,
              artistName);

        validateTracksNumber(tracksNumber);
        validateSizeInches(sizeInches);
        validateWeightGrams(weightGrams,
                            sizeInches);

        this.tracksNumber = tracksNumber;
        this.sizeInches = sizeInches;
        this.weightGrams = weightGrams;
    }

    /**
     * Validates the weight in grams based on the size in inches of the vinyl record.
     * Ensures the weight is within valid ranges for different sizes.
     *
     * @param weightGrams The weight in grams to be validated.
     * @param sizeInches  The size in inches of the vinyl record.
     * @throws IllegalArgumentException if the weight is invalid for the given size.
     */
    private static void validateWeightGrams(final int weightGrams,
                                            final int sizeInches)
    {
        validateSizeInches(sizeInches);
        if(sizeInches == VALID_SIZE_INCHES_LARGE)
        {
            if(weightGrams != VALID_WEIGHT_SMALL_SIZE_LARGE || weightGrams != VALID_WEIGHT_MEDIUM_SIZE_LARGE || weightGrams != VALID_WEIGHT_LARGE_SIZE_LARGE)
            {
                throw new IllegalArgumentException(
                        String.format("Invalid Weight. For the given size %d\" the valid weights in grams are: %d, %d or %d.",
                                      VALID_SIZE_INCHES_LARGE,
                                      VALID_WEIGHT_SMALL_SIZE_LARGE,
                                      VALID_WEIGHT_MEDIUM_SIZE_LARGE,
                                      VALID_WEIGHT_LARGE_SIZE_LARGE));
            }
        }
        else if(sizeInches == VALID_SIZE_INCHES_MEDIUM)
        {
            if(weightGrams != VALID_WEIGHT_SIZE_MEDIUM)
            {
                throw new IllegalArgumentException(
                        String.format("Invalid Weight. For the given size %d\" the valid weight in grams is: %d.",
                                      VALID_SIZE_INCHES_MEDIUM,
                                      VALID_WEIGHT_SIZE_MEDIUM));
            }
        }
        else if(sizeInches == VALID_SIZE_INCHES_SMALL)
        {
            if(weightGrams != VALID_WEIGHT_SIZE_SMALL)
            {
                throw new IllegalArgumentException(
                        String.format("Invalid Weight. For the given size %d\" the valid weight in grams is: %d.",
                                      VALID_SIZE_INCHES_SMALL,
                                      VALID_WEIGHT_SIZE_SMALL));
            }
        }
    }

    /**
     * Validates the size in inches of the vinyl record.
     * Ensures the size is one of the valid sizes.
     *
     * @param sizeInches The size in inches to be validated.
     * @throws IllegalArgumentException if the size is invalid.
     */
    private static void validateSizeInches(final int sizeInches)
    {
        if(!(sizeInches == VALID_SIZE_INCHES_LARGE ||
                sizeInches == VALID_SIZE_INCHES_MEDIUM ||
                sizeInches == VALID_SIZE_INCHES_SMALL))
        {
            throw new IllegalArgumentException(
                    String.format("Invalid size %d. It should be %d or %d or %d.",
                                  sizeInches,
                                  VALID_SIZE_INCHES_LARGE,
                                  VALID_SIZE_INCHES_MEDIUM,
                                  VALID_SIZE_INCHES_SMALL));
        }
    }

    /**
     * Validates the number of tracks on the vinyl record.
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
     * Returns the number of tracks on the vinyl record.
     *
     * @return The number of tracks.
     */
    public int getTracksNumber()
    {
        return tracksNumber;
    }

    /**
     * Returns the size of the vinyl record in inches.
     *
     * @return The size in inches.
     */
    public int getSizeInches()
    {
        return sizeInches;
    }

    /**
     * Returns the weight of the vinyl record in grams.
     *
     * @return The weight in grams.
     */
    public int getWeightGrams()
    {
        return weightGrams;
    }

    /**
     * Returns a string representation of the VinylRecord object.
     *
     * @return A string containing the song title, artist name, size in inches, weight in grams, and number of tracks.
     */
    @Override
    public String toString()
    {
        return "Vinyl Record: " +
                super.toString() +
                String.format(" is stored in a Vinyl record with size %d\", weight %dgr and it has %d tracks.",
                              sizeInches,
                              weightGrams,
                              tracksNumber);
    }

    /**
     * Plays the vinyl record.
     * Displays a message indicating that the vinyl record is being played.
     */
    @Override
    public void play()
    {
        System.out.println("A vinyl record is being played.");
    }
}
