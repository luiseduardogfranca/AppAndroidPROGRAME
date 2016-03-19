package programe.projeto.com.programe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }


    /*
    Métodos botões
     */

    public void selectPython(View view){

        Intent buttomPython = new Intent(this, InformationPython.class);
        startActivity(buttomPython);
    }

    public void selectAlgorithm(View view){

        Intent buttomAlgoritimo = new Intent(this, InformationAlgoritimo.class);
        startActivity(buttomAlgoritimo);
    }


}
