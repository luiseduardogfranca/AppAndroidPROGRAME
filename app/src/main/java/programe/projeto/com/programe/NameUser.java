package programe.projeto.com.programe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NameUser extends AppCompatActivity {
    private String nameUser;
    private String emailUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_user);
    }


    //definition get email and name of user
    public void setNomeUser(View view){
        EditText name = (EditText) findViewById(R.id.name_view_edit);
        nameUser = String.valueOf(name.getText());
    }

    public void setEmailUser(View view){
        EditText email = (EditText) findViewById(R.id.email_view_edit);
        emailUser = String.valueOf(email.getText());

    }

    /*
    Próxima activity
     */

    public void activityOption(View view){
        Intent activity = new Intent(this, Option.class);
        startActivity(activity);
    }

    //buttom confirm
    public void buttomConfirm(View view){
        setNomeUser(view);
        setEmailUser(view);
        activityOption(view);

    }

    //Retorno do nome
    public String getName(){
        return nameUser;
    }

}
