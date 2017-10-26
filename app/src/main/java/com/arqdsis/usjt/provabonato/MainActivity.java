package com.arqdsis.usjt.provabonato;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/**
 * Autor:
 */
public class MainActivity extends Activity {

    public static final String NUMERO = "com.arqdsis.usjt.provabonato.NUMERO";
    /**
     * Autor:
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Autor:
     */
    public void ligar(View view) {
        Intent intent = new Intent(this,NumberActivity.class);
        String numero =((EditText)findViewById(R.id.edt_number)).getText().toString();
        intent.putExtra(NUMERO,numero);

        startActivity(intent);
    }
}
