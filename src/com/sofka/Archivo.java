package com.sofka;

import java.io.BufferedReader;
import java.io.FileReader;

public class Archivo {

    public void leerArchivo(String ruta){
        try {
            FileReader r = new FileReader(ruta);
            BufferedReader buffer = new BufferedReader(r);
            String linea= "";

            while (linea != null){
               linea = buffer.readLine();
               if (linea == null)
                   break;

                System.out.println(linea);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
