public class Main {
    public static void main(String[] args) {
byte whiteClass = 2;
        byte brownClass = 4;
        int colorClass = whiteClass + brownClass;
        System.out.println(colorClass);
        int colorSchool = 120;
        int classRooms = colorSchool / colorClass;
        System.out.println(classRooms);
        int whiteSchool = whiteClass * classRooms;
        int brownSchool = brownClass * classRooms;
        System.out.println("В школе, где " + classRooms + " классов, нужно " + whiteSchool + " банок белой краски и " + brownSchool + " банок коричневой краски");
    }
}