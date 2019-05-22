package lesson15;

public class Challenge {
    private static final String[] secret = {
            "t$rcyja&g6aeibnn",
            "seozp$rna(scttenroiiaq.ydver/",
            "javaismylove",
            "welovejava"
    };

    public static void main(String[] args) {
        String url = "";
        String[] barrier = secret[1].split("");
        int i;

        for (i =0; i < barrier.length; i++) {
            if (i%2 == 0) {
                url += barrier[i];
            }
        }
        url += secret[3];
        System.out.println("Go to: " + url);
    }
}
