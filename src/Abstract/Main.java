package Abstract;

public class Main extends Powers{
    public static void main(String[] args) {
        Main mainObj = new Main();
        mainObj.fireType();
        System.out.println(mainObj.WaterType());
    }

    @Override
    void fireType() {
        System.out.println("Fire Blast Attack");
    }

    @Override
    String WaterType() {
        return "Water Blast Attack";
    }
}
