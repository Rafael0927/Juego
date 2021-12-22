/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;


public class Juego {

    
    public static void main(String[] args) {
        //SE CREAN LAS VARIABLES
        int ValorPregunta = 8;
        int Puntaje = 0;

        //PRIMERA PREGUNTA
        String Pregunta1 = "¿Creador de PHP es Bill gates o Rasmus Lerdorf?";
        String Respuesta1="Bill Gates";
        String Respuesta2="Steve Jobs";
        String Respuesta3="Rasmus Lerdorf";
        
        //SEGUNDA PREGUNTA
        String Pregunta2 = "NetBeans es un lenguaje de programacion\n Responda: Verdadero o Falso";
        String Respuesta4="Verdadero";
        String Respuesta5="Falso";
        
        //TERCERA PREGUNTA
        String Pregunta3 = " jQuery  es un lenguaje de programacion\n Responda: Verdadero o Falso";
        String Respuesta6="Verdadero";
        String Respuesta7="Falso";
        
        //CUARTA PREGUNTA
        String Pregunta4 = "HTML es un lenguaje de programacion: \n Responda: Verdadero o Falso";
        String Respuesta8="Verdadero";
        String Respuesta9="Falso";
        
        //QUINTA PREGUNTA
        String Pregunta5 = "Lenguaje de programación más fácil de aprender: \n Responda una:Python, Java o JavaScript";
        String Respuesta10="Python";
        String Respuesta11="Java";
        String Respuesta12="JavaScript";
        
        //SEXTA PREGUNTA
        String Pregunta6 = "¿Qué tecnología se utiliza para hacer posibles las llamadas telefónicas a través de Internet? \n Responda: VoIP o Ethernet";
        String Respuesta13="Ethernet";
        String Respuesta14="VoIP";
        
        //SEPTIMA PREGUNTA
        String Pregunta7 = "¿Qué lenguaje informático es el más utilizado?  \n Responda: Java o C";
        String Respuesta15="Java";
        String Respuesta16="C";
        
        //OCTAVA PREGUNTA
        String Pregunta8 = " ¿Cuál es la red social más usada del mundo? \n Responda: Instagram o Facebook ";
        String Respuesta17="Instagram";
        String Respuesta18="Facebook";
        
        
        
        Scanner preguntas = new Scanner(System.in);
        System.out.println("¡QUE COMIENCE EL JUEGO!");
        
        System.out.println("1. Primera pregunta: " +Pregunta1);       
        String rl=preguntas.nextLine();        
        //r1 CONTIENE EL VALOR QUE HEMOS AGREGADO 
        if(rl.equalsIgnoreCase(Respuesta3)){
            Puntaje=Puntaje+1;
            System.out.println("La respuesta es correcta");
      
        }else{
            System.out.println("Respuesta es incorrecta, la respuesta correcta es:" +Respuesta3 );
                  
        }
        
        System.out.println("2. Segunda pregunta: " + Pregunta2);
        String r2=preguntas.nextLine();
        if(r2.equalsIgnoreCase(Respuesta5)){
            Puntaje=Puntaje+2;
            System.out.println("Respuesta correcta!");
                   
        }else{
            System.out.println("Respuesta incorrecta, la respuesta es:" + Respuesta5);
        }
        
        System.out.println("3. Tercera pregunta: " + Pregunta3);
        String r3=preguntas.nextLine();
        if(r3.equalsIgnoreCase(Respuesta7)){
            Puntaje=Puntaje+3;
            System.out.println("Respuesta correcta!");
                   
        }else{
            System.out.println("Respuesta incorrecta, la respuesta es:" + Respuesta7);
        }
        
        System.out.println("4. Cuarta pregunta:" + Pregunta4);
        String r4=preguntas.nextLine();
        if(r4.equalsIgnoreCase(Respuesta9)){
            Puntaje=Puntaje+4;
            System.out.println("Respuesta correcta!");
                   
        }else{
            System.out.println("Respuesta incorrecta, la respuesta es:" + Respuesta9);
        }
        
        System.out.println("5. Quinta pregunta:" + Pregunta5);
        String r5=preguntas.nextLine();
        if(r5.equalsIgnoreCase(Respuesta10)){
            Puntaje=Puntaje+5;
            System.out.println("Respuesta correcta!");
                   
        }else{
            System.out.println("Respuesta incorrecta, la respuesta es:" + Respuesta10);
        }
        
        System.out.println("6. sexta pregunta:" + Pregunta6);
        String r6=preguntas.nextLine();
        if(r6.equalsIgnoreCase(Respuesta14)){
            Puntaje=Puntaje+6;
            System.out.println("Respuesta correcta!");
                   
        }else{
            System.out.println("Respuesta incorrecta, la respuesta es:" + Respuesta14);
        }
        
        System.out.println("7. Septima pregunta:" + Pregunta7);
        String r7=preguntas.nextLine();
        if(r7.equalsIgnoreCase(Respuesta15)){
            Puntaje=Puntaje+7;
            System.out.println("Respuesta correcta!");
                   
        }else{
            System.out.println("Respuesta incorrecta, la respuesta es:" + Respuesta15);
        }
        
        System.out.println("8. Octava pregunta:" + Pregunta8);
        String r8=preguntas.nextLine();
        if(r4.equalsIgnoreCase(Respuesta18)){
            Puntaje=Puntaje+8;
            System.out.println("Respuesta correcta!");
                   
        }else{
            System.out.println("Respuesta incorrecta, la respuesta es:" + Respuesta18);
        }
        System.out.println("Tú puntaje fue: "+ ValorPregunta);
        
        
    }

}
