public class HolaMundo1 {

   
    public static void main(String[] args) {
	
	System.out.println("Hola mundo");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre =scanner.nextLine();
        
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        
        System.out.println("\nDatos ingrejoelsados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Bienvenido " );
    }
    
}
