package javagit;

public class JavaGit {

    public static void main(String[] args) {
        /* 10 fok alatt van hideg,
        ha hideg van viszek kabatot
        egyebkent nem viszek kabatot */
        final int HIDEG_HATAR = 10;
        int fok = 7;
        boolean hidegVan = fok < HIDEG_HATAR;
        String eredmeny = "Nem viszek kabatot";
        if (hidegVan) {
        eredmeny = "Viszek kabatot";
        }
        System.out.println(eredmeny);
    }
    
}
