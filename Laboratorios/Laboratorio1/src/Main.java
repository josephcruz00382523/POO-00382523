import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0,num2=0,valor =0;
        int opcion=0;


        do {
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //ingreso de datos
                    System.out.println("ingrese el primer numero: ");
                    num1= sc.nextDouble();
                    System.out.println("ingrese el segundo numero: ");
                    num2 = sc.nextDouble();

                    valor = calcular.add(num1,num2);//llamando funcion de clase

                    System.out.println("el total es = " + valor );
                    System.out.println("======================");
                    break;
                case 2:
                    System.out.println("ingrese el primer numero: ");
                    num1= sc.nextDouble();
                    System.out.println("ingrese el segundo numero: ");
                    num2 = sc.nextDouble();

                    valor = calcular.substract(num1,num2);//llamanado funcion de clase

                    System.out.println("el total es = " + valor );
                    System.out.println("======================");
                    break;
                case 3:

                    System.out.println("ingrese el primer numero: ");
                    num1= sc.nextDouble();
                    System.out.println("ingrese el segundo numero: ");
                    num2 = sc.nextDouble();

                    valor = calcular.multiply(num1,num2);//llamando funcion de clase

                    System.out.println("el total es = " + valor );
                    System.out.println("======================");
                    break;
                case 4 :
                    System.out.println("ingrese el primer numero: ");
                    num1= sc.nextDouble();
                    System.out.println("ingrese el segundo numero: ");
                    num2 = sc.nextDouble();

                    valor= calcular.devide(num1,num2);//llamando funcion de clase

                    System.out.println("el total es = " + valor );
                    System.out.println("======================");
                    break;
                case 5:
                    System.out.println("saliendo....");
                    break;
                default:
                    System.out.println("porfavor ingresar una opcion valida");
                    break;

            }
        }while (opcion !=5);



    }


}

