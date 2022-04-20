public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("jest super!");
        } else {
            System.out.println("jest lipa!");
        }
    }
}
