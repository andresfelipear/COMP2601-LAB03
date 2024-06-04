/**
 * Driver
 *
 * @author Andres Arevalo & Walter Chu
 * @version 1.0
 */
public class Driver
{
    public static void main(String[] args)
    {
        final MusicMedia cd;
        final MusicMedia audioFile;
        final MusicMedia vinylRecord;

        cd = new CompactDisc("In the Shadows", "The Rasmus", 1);
        audioFile = new AudioFile("Billie Jean", "Michael Jackson", "billie.mp3", 12500);
        vinylRecord = new VinylRecord("Si pudiera", "Manuel Medrano", 1, 7, 40);

        System.out.println(cd);
        System.out.println(audioFile);
        System.out.println(vinylRecord);

        System.out.println();

        cd.play();
        audioFile.play();
        vinylRecord.play();

        System.out.println();

        ((AudioFile) audioFile).save("In the Shadows");
        ((AudioFile) audioFile).delete("In the Shadows");
    }
}
