package Annotation;

public class Mainclass {
    public static void main(String[] args) {

        Gmail gm = new Gmail();
        gm.compose();

        Gmail g= new GmailVersion2();
        g.compose();
    }
}
