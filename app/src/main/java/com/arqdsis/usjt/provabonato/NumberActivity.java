package com.arqdsis.usjt.provabonato;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Autor:
 */
public class NumberActivity extends Activity {

    /**
     * Autor:
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        Intent intent = getIntent();

        String retorno = intent.getStringExtra(MainActivity.NUMERO);
        TextView view = (TextView)findViewById(R.id.lbl_Number);

        view.setText(GetNumberFromPhoneWords(retorno));
    }
    /**
     * Autor:
     */
    public String GetNumberFromPhoneWords(String phoneWords)
    {
        //ABC = 2; DEF = 3; GHI = 4; JKL = 5; MNO = 6; PQRS = 7; TUV = 8; WXYZ = 9.
        String numero="";
        for (int i = 0; i < phoneWords.length();i++){
            char n = phoneWords.toUpperCase().charAt(i);
            switch (phoneWords.toUpperCase().charAt(i)){
                case 'A':case 'B':case 'C':
                    n = '2';
                break;
                case 'D':case 'E':case 'F':
                    n = '3';
                    break;
                case 'G':case 'H':case 'I':
                    n = '4';
                    break;
                case 'J':case 'K':case 'L':
                    n = '5';
                    break;
                case 'M':case 'N':case 'O':
                    n = '6';
                    break;
                case 'P':case 'Q':case 'R':case 'S':
                    n = '7';
                    break;
                case 'T':case 'U':case 'V':
                    n = '8';
                    break;
                case 'W':case 'X':case 'Y':case 'Z':
                    n = '9';
                    break;
            }

            numero += n;
        }

        return numero;
    }
}
