package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import  java.util.Random;
import java.util.Date;
import java.lang.Double;

public class Main {

    private static String Add(String nombre)
    {
        return nombre;
    }

    private static int Add(int nit)
    {
        return nit;
    }

    private static int Random()
    {
        Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        return n*10207896;
    }

    private static Double Add(Double precio)
    {
        return precio;
    }

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        Scanner scan= new Scanner(System.in);
        File file = new File("/Users/AlejandraLemus/Documents/Sorpresa.txt");
        try {
            file.mkdirs();
            file.createNewFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("SUPERMERCADO \nDE ANALUCIA, S.A. \nCIF A-41398645 \nAlbert Einstein, 2 \n41092 - SEVILLA");
            pw.println("\nITV I1710 \nFACTURA SIMPLIFICADA \nRecibo no."+Random()+"\nFecha:"+dateFormat.format(date));
            System.out.print("Nombre y Apellido: ");
            pw.println("Cliente: "+Add(scan.next())+" "+Add(scan.next()));
            System.out.print("NIT:");
            pw.println("NIT: "+Add(scan.nextInt())+"\n");

            int articulos=0;
            Double suma=0.00;
            System.out.print("Selecione el artículo: \n1.Leche \n2.Huevos \n3.Harina \n4.Pan \n5.Mantequilla \n6.Azúcar \n7.Aceite \n8.Salir\n");
            while (articulos!=8)
            {
                articulos=scan.nextInt();
                switch (articulos)
                {
                    case 1:
                        suma=suma+3.95;
                        pw.println(Add("Leche")+"           €"+Add(3.95));
                        break;

                    case 2:
                        suma=suma+5.76;
                        pw.println(Add("Huevos")+"          €"+Add(5.76));
                        break;
                    case 3:
                        suma=suma+2.99;
                        pw.println(Add("Harina")+"          €"+Add(2.99));
                        break;
                    case 4:
                        suma=suma+1.46;
                        pw.println(Add("Pan")+"             €"+Add(1.46));
                        break;
                    case 5:
                        suma=suma+2.40;
                        pw.println(Add("Mantequilla")+"     €"+Add(2.40));
                        break;
                    case 6:
                        suma=suma+5.80;
                        pw.println(Add("Azúcar")+"          €"+Add(5.80));
                        break;
                    case 7:
                        suma=suma+7.99;
                        pw.println(Add("Aceite")+"          €"+Add(7.99));
                        break;

                    case 8:
                        articulos=8;
                        break;
                }
            }
            pw.println("\nTotal: €"+suma);
            pw.println("\nGRACIAS POR PREFERIRNOS \nSUPERMERCADOS DE ANDALUCÍA");
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}