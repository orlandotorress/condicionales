import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("dijite el nombre: ");
        String nombre = scanner.nextLine();
        
        
        System.out.print("dijite el apellido: ");
        String apellido = scanner.nextLine();
        
        
        System.out.print("dijite la edad: ");
        int edad = scanner.nextInt();
        
      
        scanner.nextLine();  
        
        
        System.out.print("dijite el sexo (Masculino/Femenino): ");
        String sexo = scanner.nextLine();
        
        
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
        
        
        if (sexo.equalsIgnoreCase("Masculino")) {
            System.out.println("Es un Hombre.");
        } else if (sexo.equalsIgnoreCase("Femenino")) {
            System.out.println("Es una Mujer.");
        } else {
            System.out.println("Sexo no reconocido.");
        }
        
        
        
    }
}

    

