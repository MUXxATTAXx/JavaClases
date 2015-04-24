/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareajava;
import java.util.*;
/**
 *
 * @author C-01
 */
public class TareaJava {
  
    private String exists;
    public static void main(String[] args) 
    {
        String[] VALUES = new String[] {"User"};
        String[] PASS = new String[] {"User"};
        String[] Userios = new String[] {"0"};
        Scanner Teclado = new Scanner(System.in);
        int log = 0;
        int n = 0;
        while(log < 3)
        {
            System.out.println("1)Ingresar o 2)crear cuenta 3)Salir");
            log = Teclado.nextInt();
            switch(log)
            {
            case 1:
                if(name(VALUES,PASS)==true)
                {
                    while ( n < 5 )
                        {
                            System.out.println("Sus ordenes señor");
                            System.out.println("1)Nombre cuenta 2)Cuenta salario 3)Ingresar $ 4)Sacar $"); 
                            n = Teclado.nextInt();
                            switch(n)
                            {
                                case 1:
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                                case 4:
                                break;
                                case 5:
                                break;
                                default:
                                n = 0;
                                break;
                            }
                        }
                }
                else
                {
                      System.out.println("Suelten a los perros");   
                }
            break;
            case 2:
            
            break;
            default:
                System.out.println("Adios guapo!");   
            break;
             
            }
        }
    }
     public static boolean name(String[] usuario,String[] passw)
    {
        Scanner Teclado = new Scanner(System.in);
        String namae;
        String pass;
        boolean yes;
        int Alex = 0, Alex2 = 0;
        System.out.println("Nombre de usuario");
        namae = Teclado.nextLine();
        System.out.println("Su contraseña");
        pass = Teclado.nextLine();
        for(String s: usuario){
		if(s.equals(namae))
                {
                     System.out.println("Su Usuario es real");
                     Alex = 1;
                }    
	}
        for(String s: passw){
		if(s.equals(pass))
                {
                     System.out.println("Su contraseña es real");
                     Alex2 = 2;
                }    
	}
        if(Alex == 1 && Alex == 2)
        {
            return true;
        }
	else
        {
            return false;
        }
        
    }
    
}
