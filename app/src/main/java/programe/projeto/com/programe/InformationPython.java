package programe.projeto.com.programe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InformationPython extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_python);
    }

    //Método botão para start activity
    public void buttomProx(View view){
        Intent prox = new Intent(this, ContentPython.class);
        startActivity(prox);
    }
}
