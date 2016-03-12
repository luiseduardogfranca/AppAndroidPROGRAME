package programe.projeto.com.programe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Botão start para o "curso"
    public void buttomStart(View view){
        Intent nameUser = new Intent(this, NameUser.class);
        startActivity(nameUser);
    }

    //Botão "sobre"
    public void buttomInformation(View view){
        Intent infoApp = new Intent(this, InformationApp.class);
        startActivity(infoApp);


    }
}
