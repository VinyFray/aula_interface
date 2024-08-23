public class App {
    public static void main(String[] args) {
        try {
            AppSystem.runSystem();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}