package javagit;

public class JavaGit {

    public static void main(String[] args) {
        /* 10 fok alatt van hideg,
        ha hideg van viszek kabatot
        egyebkent nem viszek kabatot */
        final int HIDEG_HATAR = 10;
        int fok = 7;
        boolean hidegVan = fok < HIDEG_HATAR;
        String viszek = "viszek kabatot";
        String nemViszek = "nem viszek kabatot";
        String eredmeny = hidegVan ? viszek : nemViszek;
        System.out.println(eredmeny);
    }
    
}
