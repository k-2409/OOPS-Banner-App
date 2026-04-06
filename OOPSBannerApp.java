/**
 * OOPSBannerApp UC3 – Banner Display using String.join()
 *
 * This class prints the word "OOPS" in banner format using
 * String.join() for better memory efficiency and readability.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each println represents one row (7 rows total)

        System.out.println(String.join(" ",
                "  *****   ",
                "  *****   ",
                "  ******  ",
                "  *****   "
        ));

        System.out.println(String.join(" ",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  "
        ));

        System.out.println(String.join(" ",
                "*       * ",
                "*       * ",
                "*     *   ",
                "*         "
        ));

        System.out.println(String.join(" ",
                "*       * ",
                "*       * ",
                "******    ",
                "  *****   "
        ));

        System.out.println(String.join(" ",
                "*       * ",
                "*       * ",
                "*         ",
                "       *  "
        ));

        System.out.println(String.join(" ",
                " *     *  ",
                " *     *  ",
                "*         ",
                " *     *  "
        ));

        System.out.println(String.join(" ",
                "  *****   ",
                "  *****   ",
                "*         ",
                "  *****   "
        ));
    }
}