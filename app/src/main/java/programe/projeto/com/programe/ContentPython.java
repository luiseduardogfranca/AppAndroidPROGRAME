package programe.projeto.com.programe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentPython extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_python);
        buttomIntro(view);
    }



    //Introducao
    public void buttomIntro(View view){

        //Instâncias TextView
        TextView titleIntro = (TextView) findViewById(R.id.title_content_python);
        TextView subtitleIntro = (TextView) findViewById(R.id.subtitle_content_python);
        TextView expli1 = (TextView) findViewById(R.id.explicacao1_content_python);
        TextView expli2 = (TextView) findViewById(R.id.explicacao2_content_python);
        TextView expli3 = (TextView) findViewById(R.id.explicacao3_content_python);
        TextView expli4 = (TextView) findViewById(R.id.explicacao4_content_python);
        TextView expli5 = (TextView) findViewById(R.id.explicacao5_content_python);


        //Título
        titleIntro.setText(R.string.button_intro);
        subtitleIntro.setText(R.string.subtitle_intro);

        //Explicações
        expli1.setText(R.string.explicacao_variavel_e_tipo);
        expli2.setText(R.string.explicacao_operador_atribuicao);
        expli3.setText(R.string.explicacao_operadores_aritmeticos);
        expli4.setText(R.string.explicacao_operadores_comparacao);
        expli5.setText(R.string.explicacao_operadores_logicos);

        //Instâncias ImageView
        ImageView figura1 = (ImageView) findViewById(R.id.figura1_content_view);
        ImageView figura2 = (ImageView) findViewById(R.id.figura2_content_view);
        ImageView figura3 = (ImageView) findViewById(R.id.figura3_content_view);
        ImageView figura4 = (ImageView) findViewById(R.id.figura4_content_view);
        ImageView figura5 = (ImageView) findViewById(R.id.figura5_content_view);


        //Definição src imagens
        figura1.setImageResource(R.drawable.variavel);
        figura2.setImageResource(R.drawable.atribuicao);
        figura3.setImageResource(R.drawable.aritmetico);
        figura4.setImageResource(R.drawable.comparacao);
        figura5.setImageResource(R.drawable.logico);


    }

    //Saida
    public void buttomPrint(View view){

        //Instâncias TextView
        TextView titleIntro = (TextView) findViewById(R.id.title_content_python);
        TextView subtitleIntro = (TextView) findViewById(R.id.subtitle_content_python);
        TextView expli1 = (TextView) findViewById(R.id.explicacao1_content_python);
        TextView expli2 = (TextView) findViewById(R.id.explicacao2_content_python);
        TextView expli3 = (TextView) findViewById(R.id.explicacao3_content_python);
        TextView expli4 = (TextView) findViewById(R.id.explicacao4_content_python);
        TextView expli5 = (TextView) findViewById(R.id.explicacao5_content_python);


        //Título
        titleIntro.setText(R.string.button_saida);
        subtitleIntro.setText(R.string.subtitle_saida);

        //Explicações
        expli1.setText(R.string.entrada_saida);
        expli2.setText(R.string.print_marcador);
        expli3.setText(R.string.uso_end);
        expli4.setText(R.string.explicacao_operadores_comparacao);
        expli5.setText(R.string.explicacao_operadores_logicos);

        //Instâncias ImageView
        ImageView figura1 = (ImageView) findViewById(R.id.figura1_content_view);
        ImageView figura2 = (ImageView) findViewById(R.id.figura2_content_view);
        ImageView figura3 = (ImageView) findViewById(R.id.figura3_content_view);
        ImageView figura4 = (ImageView) findViewById(R.id.figura4_content_view);
        ImageView figura5 = (ImageView) findViewById(R.id.figura5_content_view);


        //Definição src imagens
        figura1.setImageResource(R.drawable.saida_entrada);
        figura2.setImageResource(R.drawable.marcador_e_virgula);
        figura3.setImageResource(R.drawable.end);
        figura4.setImageResource(R.drawable.barra_n);
        figura5.setImageResource(R.drawable.conversao);


    }

    //Condicap
    public void buttomCondicao(View view){

        //Instâncias TextView
        TextView titleIntro = (TextView) findViewById(R.id.title_content_python);
        TextView subtitleIntro = (TextView) findViewById(R.id.subtitle_content_python);
        TextView expli1 = (TextView) findViewById(R.id.explicacao1_content_python);
        TextView expli2 = (TextView) findViewById(R.id.explicacao2_content_python);
        TextView expli3 = (TextView) findViewById(R.id.explicacao3_content_python);
        TextView expli4 = (TextView) findViewById(R.id.explicacao4_content_python);
        TextView expli5 = (TextView) findViewById(R.id.explicacao5_content_python);


        //Título
        titleIntro.setText(R.string.button_condicao);
        subtitleIntro.setText(R.string.subtitle_condicao);

        //Explicações
        expli1.setText(R.string.uso_condicao);
        expli2.setText(R.string.uso_if_else);
        expli3.setText(R.string.uso_elif);
        expli4.setText(R.string.uso_elif2);
        expli5.setText("");

        //Instâncias ImageView
        ImageView figura1 = (ImageView) findViewById(R.id.figura1_content_view);
        ImageView figura2 = (ImageView) findViewById(R.id.figura2_content_view);
        ImageView figura3 = (ImageView) findViewById(R.id.figura3_content_view);
        ImageView figura4 = (ImageView) findViewById(R.id.figura4_content_view);
        ImageView figura5 = (ImageView) findViewById(R.id.figura5_content_view);


        //Definição src imagens
        figura1.setImageResource(R.drawable.if_else_intro);
        figura2.setImageResource(R.drawable.sintaxe_if_else);
        figura3.setImageResource(R.drawable.elif);
        figura4.setImageResource(R.color.transparent);
        figura5.setImageResource(R.color.transparent);


    }

    //Repeticao
    public void buttomRepeticao(View view){

        //Instâncias TextView
        TextView titleIntro = (TextView) findViewById(R.id.title_content_python);
        TextView subtitleIntro = (TextView) findViewById(R.id.subtitle_content_python);
        TextView expli1 = (TextView) findViewById(R.id.explicacao1_content_python);
        TextView expli2 = (TextView) findViewById(R.id.explicacao2_content_python);
        TextView expli3 = (TextView) findViewById(R.id.explicacao3_content_python);
        TextView expli4 = (TextView) findViewById(R.id.explicacao4_content_python);
        TextView expli5 = (TextView) findViewById(R.id.explicacao5_content_python);


        //Título
        titleIntro.setText(R.string.button_repeticao);
        subtitleIntro.setText(R.string.subtitle_repeticao);

        //Explicações
        expli1.setText(R.string.uso_condicao);
        expli2.setText(R.string.uso_if_else);
        expli3.setText(R.string.uso_elif);
        expli4.setText(R.string.uso_elif2);
        expli5.setText("");

        //Instâncias ImageView
        ImageView figura1 = (ImageView) findViewById(R.id.figura1_content_view);
        ImageView figura2 = (ImageView) findViewById(R.id.figura2_content_view);
        ImageView figura3 = (ImageView) findViewById(R.id.figura3_content_view);
        ImageView figura4 = (ImageView) findViewById(R.id.figura4_content_view);
        ImageView figura5 = (ImageView) findViewById(R.id.figura5_content_view);


        //Definição src imagens
        figura1.setImageResource(R.drawable.if_else_intro);
        figura2.setImageResource(R.drawable.sintaxe_if_else);
        figura3.setImageResource(R.drawable.elif);
        figura4.setImageResource(R.color.transparent);
        figura5.setImageResource(R.color.transparent);


    }

    //Lista
    public void buttomLista(View view){

        //Instâncias TextView
        TextView titleIntro = (TextView) findViewById(R.id.title_content_python);
        TextView subtitleIntro = (TextView) findViewById(R.id.subtitle_content_python);
        TextView expli1 = (TextView) findViewById(R.id.explicacao1_content_python);
        TextView expli2 = (TextView) findViewById(R.id.explicacao2_content_python);
        TextView expli3 = (TextView) findViewById(R.id.explicacao3_content_python);
        TextView expli4 = (TextView) findViewById(R.id.explicacao4_content_python);
        TextView expli5 = (TextView) findViewById(R.id.explicacao5_content_python);


        //Título
        titleIntro.setText(R.string.button_lista);
        subtitleIntro.setText(R.string.subtitle_lista);

        //Explicações
        expli1.setText(R.string.uso_condicao);
        expli2.setText(R.string.uso_if_else);
        expli3.setText(R.string.uso_elif);
        expli4.setText(R.string.uso_elif2);
        expli5.setText("");

        //Instâncias ImageView
        ImageView figura1 = (ImageView) findViewById(R.id.figura1_content_view);
        ImageView figura2 = (ImageView) findViewById(R.id.figura2_content_view);
        ImageView figura3 = (ImageView) findViewById(R.id.figura3_content_view);
        ImageView figura4 = (ImageView) findViewById(R.id.figura4_content_view);
        ImageView figura5 = (ImageView) findViewById(R.id.figura5_content_view);


        //Definição src imagens
        figura1.setImageResource(R.drawable.if_else_intro);
        figura2.setImageResource(R.drawable.sintaxe_if_else);
        figura3.setImageResource(R.drawable.elif);
        figura4.setImageResource(R.color.transparent);
        figura5.setImageResource(R.color.transparent);


    }



}


