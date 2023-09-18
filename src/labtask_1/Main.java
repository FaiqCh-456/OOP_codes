package labtask_1;

public class Main {
    public static void main(String[] args) {
        Music m1 = new Music("Nahi milta","2:45","sufi",new Date(1,4,2021),new Singer("bayan","male","Pakistani",new Date(13,2,2008)));
        System.out.println(m1);

        Music m2 = new Music("Mil jata hae","2:45","pqr",new Date(1,4,2021),new Singer("xyz","male","Indian",new Date(13,2,2003)));
        System.out.println(m2);

        System.out.println(m1.equals(m2));

    }

}
