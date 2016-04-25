package icesi.i2t.ciclodevidaa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView salida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skin);

        salida = (TextView) findViewById(R.id.salida);
        //Aqui se instancias todas las vistas o variable que intervienen en el programa
        salida.append("\nOn Create!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        salida.append("\nOn Start!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        salida.append("\nOn Resume!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        salida.append("\nOn Stop!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        salida.append("\nOn Restart!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MiDebug","La app fue destruida");
    }

    public void accionDelBoton(View view) {
        Button boton = (Button) view;
        boton.setText("Click!");
        Toast.makeText(this, "Ha dado click en el botón", Toast.LENGTH_LONG).show();
    }

    public void abrirOtraActividad(View view) {
        Intent i = new Intent(this, Otra.class);
        startActivity(i);

    }
}
