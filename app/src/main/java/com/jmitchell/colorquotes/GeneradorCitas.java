package com.jmitchell.colorquotes;

import android.graphics.Color;

public class GeneradorCitas {

    private Cita[] citas;
    private int[] colorsArray = {Color.CYAN,Color.RED,Color.BLACK,Color.GRAY,Color.YELLOW,Color.GREEN, Color.MAGENTA};

    public GeneradorCitas(){
        citas = new Cita[5];

        citas[0] = new Cita();
        citas[0].setAutor("Walt Disney");
        citas[0].setTexto("Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir");

        citas[1] = new Cita();
        citas[1].setAutor("Albert Einstein");
        citas[1].setTexto("La imaginación es más importante que el conocimiento");

        citas[2] = new Cita();
        citas[2].setAutor("Steve Jobs");
        citas[2].setTexto("Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona");

        citas[3] = new Cita();
        citas[3].setAutor("Albert Camus");
        citas[3].setTexto("El éxito es fácil de obtener. Lo difícil es merecerlo.");

        citas[4] = new Cita();
        citas[4].setAutor("Irving Berlin");
        citas[4].setTexto("El sabio no dice lo que sabe, y el necio no sabe lo que dice.");

    }

    public Cita obtenerCita(){
        int randomNumber = Utils.getRandomNumber(citas.length);

        int color = colorsArray[Utils.getRandomNumber(citas.length)];

        Cita cita = citas[randomNumber];

        cita.setColor(color);

        return citas[randomNumber];
    }

}
