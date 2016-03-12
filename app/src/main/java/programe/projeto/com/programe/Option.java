package programe.projeto.com.programe;

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
        setNameInView();
    }

    //Método de modificação do text na view
    public void setNameInView(){
        TextView view = (TextView) findViewById(R.id.view_welcome);

    }

    /*
    Métodos botões
     */

    public void selectPython(View view){

    }

    public void selectAlgorithm(View view){

    }


}
