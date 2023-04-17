public class Main {
    public static void main(String[] args) {
        Author authorWarAndPeace = new Author("Л.Н.Толстой");
        Book warAndPeace = new Book("Война и мир", authorWarAndPeace, 1867);
        Author authorOffenceAndPunishment = new Author("Ф.М.Достоевский");
        Book offenceAndPunishment = new Book("Преступление и наказание",authorOffenceAndPunishment,1866);
        System.out.println(warAndPeace.getAuthor() + " " + warAndPeace.getBookName() + " " + warAndPeace.getYear());
        System.out.println(offenceAndPunishment.getAuthor() + " " + offenceAndPunishment.getBookName() + " " + offenceAndPunishment.getYear());
        offenceAndPunishment.setYear(2002);
        System.out.println(offenceAndPunishment.getAuthor() + " " + offenceAndPunishment.getBookName() + " " + offenceAndPunishment.getYear());
        System.out.println(authorWarAndPeace.toString());
        System.out.println(warAndPeace.toString());
    }
}
