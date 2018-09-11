public class Main {
    public static void main(String[] args) {
        try {
            Car car = new Car(12, 3);
            System.out.println(car.toString());
        }
        catch(ErrorException error){
            error.printStackTrace();
        }
    }
}
