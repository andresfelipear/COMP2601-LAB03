/**
 * Driver
 *
 * @author Andres Arevalo & Walter Cho
 * @version 1.0
 */
public class Driver
{
    public static void main(String[] args)
    {
        final MusicMedia cd;

        cd = new CompactDisc("In the Shadows", "The Rasmus", 1);

        System.out.println(cd);

        cd.play();
    }
}
