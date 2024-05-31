/**
 * FileManager
 *
 * @author Andres Arevalo & Walter Chu
 * @version 1.0
 */
public interface FileManager
{
    /**
     * Saves a file with the specified file name.
     * Implementing classes should define the specific behavior for saving a file.
     *
     * @param fileName The name of the file to be saved.
     */
    void save(final String fileName);

    /**
     * Deletes a file with the specified file name.
     * Implementing classes should define the specific behavior for deleting a file.
     *
     * @param fileName The name of the file to be deleted.
     */
    void delete(final String fileName);

}
