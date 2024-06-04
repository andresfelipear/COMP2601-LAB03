/**
 * @author Andres Arevalo
 * @author Walter Chu
 * @version 1.0
 */
public class Driver
{
    public static void main(String[] args)
    {
        final MusicMedia compactDisc1;
        final MusicMedia audioFile1;
        final MusicMedia vinylRecord1;

        {
            compactDisc1 = new CompactDisc("cdsong1", "cdartist1", 11);
            audioFile1   = new AudioFile("audiofilesong1", "audiofileartist1", "audiofilename1", 111);
            vinylRecord1 = new VinylRecord("vinylrecordsong1", "vinylrecordartist1", 22, "12\"", "140g");
        }

        System.out.println("------------------------------");
        System.out.println("Compact disc info and methods:");
        System.out.println(compactDisc1);
        compactDisc1.play();

        System.out.println("------------------------------");
        System.out.println("Audio file info and methods:");
        System.out.println(audioFile1);
        audioFile1.play();
        ((AudioFile) audioFile1).save("whatever");
        ((AudioFile) audioFile1).delete("whatever");


        System.out.println("------------------------------");
        System.out.println("Vinyl record info and methods:");
        System.out.println(vinylRecord1);
        vinylRecord1.play();
    }
}
