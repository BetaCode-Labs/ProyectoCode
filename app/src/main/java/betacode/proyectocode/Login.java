package betacode.proyectocode;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {


    LinearLayout Ingresar;
    EditText EdUsuario, EdPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Ingresar = (LinearLayout) findViewById(R.id.Ingresar);
        EdUsuario = (EditText) findViewById(R.id.Usuario);

        SharedPreferences Datos = getSharedPreferences("DATOS", Context.MODE_PRIVATE);
        final SharedPreferences.Editor EDatos = Datos.edit();

        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EDatos.putString("USUARIO", EdUsuario.getText().toString().trim());
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(500);

                Intent i = new Intent(Login.this, Maps.class);
                startActivity(i);

            }
        });


    }
}
