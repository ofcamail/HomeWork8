public class Main {
    public static void main(String[] args) {
        Author dmitriyPravdin = new Author("Дмитрий", "Правдин");
        Author anatoliBoukreev = new Author("Анатолий", "Букреев");
        Books notesOfTheDistrictSurgeon = new Books("Записки районного хирурга", 2000, dmitriyPravdin);
        Books theClimb = new Books("Восхождение", 1997, anatoliBoukreev);
        notesOfTheDistrictSurgeon.setYearPublication(2002);
        System.out.println(theClimb.toString());
    }
}