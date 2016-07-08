package betacode.proyectocode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creamos una tarea para ser ejectuada en un tiempo determinado
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                //Abriremos una segunda ventana llamada Login y realizaremos un login falso o una toma de datos.

                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
        };

        // Creamos un timer para asiganarle una tarea que sera ejecutada 3000 milisegundo luego de haber iniciado la Activity
        Timer timer = new Timer();
        timer.schedule(task, 3000);
    }
}
