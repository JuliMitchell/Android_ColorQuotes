package com.jmitchell.colorquotes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private static final String CITA = "cita";
    private static final String AUTOR = "autor";
    private static final String COLOR = "color";

    private TextView citaTextView;
    private TextView autorTextView;
    private Button nuevaCitaButton;

    private String autores[];
    private String citas[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citaTextView = findViewById(R.id.citaTextView);
        autorTextView = findViewById(R.id.autorTextView);
        nuevaCitaButton = findViewById(R.id.nuevaCitaButton);

        /*
        if(savedInstanceState != null){
            int color = savedInstanceState.getInt(COLOR);
            citaTextView.setTextColor(color);
            autorTextView.setTextColor(color);
            nuevaCitaButton.setBackgroundColor(color);

            citaTextView.setText(savedInstanceState.getString(CITA));
            autorTextView.setText(savedInstanceState.getString(AUTOR));
        }
        */

        /*
        nuevaCitaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Ouch, me tocaste!!!");
            }
        });


        autores = new String[5];
        citas = new String[5];

        autores[0] = "Walt Disney";
        citas[0] = "Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir";

        autores[1] = "Albert Einstein";
        citas[1] = "La imaginación es más importante que el conocimiento";


        autores[2] = "Steve Jobs";
        citas[2] = "Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona";

        autores[3] = "Albert Camus";
        citas[3] = "El éxito es fácil de obtener. Lo difícil es merecerlo.";

        autores[4] = "Irving Berlin";
        citas[4] = "El sabio no dice lo que sabe, y el necio no sabe lo que dice.";

        */

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        int color = savedInstanceState.getInt(COLOR);
        citaTextView.setTextColor(color);
        autorTextView.setTextColor(color);
        nuevaCitaButton.setBackgroundColor(color);

        citaTextView.setText(savedInstanceState.getString(CITA));
        autorTextView.setText(savedInstanceState.getString(AUTOR));

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(CITA, citaTextView.getText().toString());

        outState.putString(AUTOR, autorTextView.getText().toString());

        outState.putInt(COLOR, citaTextView.getCurrentTextColor());
    }


    public void clickNuevaCita(View view){

        GeneradorCitas generadorCitas = new GeneradorCitas();
        Cita cita = generadorCitas.obtenerCita();

        citaTextView.setText(cita.getTexto());
        citaTextView.setTextColor(cita.getColor());

        autorTextView.setText(cita.getAutor());
        autorTextView.setTextColor(cita.getColor());

        nuevaCitaButton.setBackgroundColor(cita.getColor());
    }

}
