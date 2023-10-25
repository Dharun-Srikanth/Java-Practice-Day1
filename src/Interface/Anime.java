package Interface;

public class Anime implements Naruto{

    @Override
    public void kakashi() {
        System.out.println("Kakashi the copy Ninja");
    }

    @Override
    public String naruto() {
        return "Rasengan";
    }

    @Override
    public int tsunade() {
        return 106;
    }
}
