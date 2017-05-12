package com.example.vcalazas.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Jogador_vs_Jogador extends AppCompatActivity implements View.OnClickListener{


    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;

    String flash_btn_1 = "-";
    String flash_btn_2 = "-";
    String flash_btn_3 = "-";
    String flash_btn_4 = "-";
    String flash_btn_5 = "-";
    String flash_btn_6 = "-";
    String flash_btn_7 = "-";
    String flash_btn_8 = "-";
    String flash_btn_9 = "-";



    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;
    LinearLayout lgS;
    TextView     vez;
    TextView     jogador_1;
    TextView     jogador_2;


    String  Vez = "X";
    Integer contador_click = 0;
    Integer pontuacao_1 = 0;
    Integer pontuacao_2 = 0;

    /* Para " Clique 2 vezes para voltar " */
    private Toast toast;
    private long lastBackPressTime = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogador_vs__jogador);

        instanciar_elementos();
        PlayGame();

    }


    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:
                if(btn_1.getText().toString().equals("O") || btn_1.getText().toString().equals("X")){
                    Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
                }else{
                    btn_1.setText(Vez);
                    flash_btn_1 = Vez;
                }
                break;
            case R.id.button2:
                if(btn_2.getText().toString().equals("O") || btn_2.getText().toString().equals("X")){
                    Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
                }else{
                    btn_2.setText(Vez);
                    flash_btn_2 = Vez;
                }
                break;
           case R.id.button3:
               if(btn_3.getText().toString().equals("O") || btn_3.getText().toString().equals("X")){
                   Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
               }else{
                   btn_3.setText(Vez);
                   flash_btn_3 = Vez;
               }
                break;
            case R.id.button4:
                if(btn_4.getText().toString().equals("O") || btn_4.getText().toString().equals("X")){
                    Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
                }else{
                    btn_4.setText(Vez);
                    flash_btn_4 = Vez;
                }
                break;
            case R.id.button5:
                if(btn_5.getText().toString().equals("O") || btn_5.getText().toString().equals("X")){
                    Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
                }else{
                    btn_5.setText(Vez);
                    flash_btn_5 = Vez;
                }
                break;
            case R.id.button6:
                if(btn_6.getText().toString().equals("O") || btn_6.getText().toString().equals("X")){
                    Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
                }else{
                    btn_6.setText(Vez);
                    flash_btn_6 = Vez;
                }
                break;
            case R.id.button7:
                if(btn_7.getText().toString().equals("O") || btn_7.getText().toString().equals("X")){
                    Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
                }else{
                    btn_7.setText(Vez);
                    flash_btn_7 = Vez;
                }
                break;
            case R.id.button8:
                if(btn_8.getText().toString().equals("O") || btn_8.getText().toString().equals("X")){
                    Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
                }else{
                    btn_8.setText(Vez);
                    flash_btn_8 = Vez;
                }
                break;
            case R.id.button9:
                if(btn_9.getText().toString().equals("O") || btn_9.getText().toString().equals("X")){
                    Toast.makeText(this, "Não é possivel escolher essa opção", Toast.LENGTH_SHORT).show();
                }else{
                    btn_9.setText(Vez);
                    flash_btn_9 = Vez;
                }
                break;
        }
        if(Vez.equals("X")){
            Vez = "O";
        }else{
            Vez = "X";
        }
        vez.setText("Vez do jogador: "+Vez);

        if(contador_click >= 4){
            verificar_jogada(v);
        } else {

        }

        contador_click++;
    }


    /*----------------------------------------------------------------------------------------*/

    private void verificar_jogada(View v){
        if(flash_btn_1.equals(flash_btn_2)
        && flash_btn_2.equals(flash_btn_3)
        && flash_btn_1.equals(flash_btn_3)
        && flash_btn_1.equals("X")
        && flash_btn_2.equals("X")
        && flash_btn_3.equals("X")
        || flash_btn_1.equals("O")
        && flash_btn_2.equals("O")
        && flash_btn_3.equals("O")

                ){

            if(flash_btn_1.equals("X")){
                pontuacao_1++;
                jogador_1.setText(pontuacao_1+"");
            } else {
                pontuacao_2++;
                jogador_2.setText(pontuacao_2+"");
            }
            recomecar();
            /*X X X
            * O O O
            * O O O */
        } else if(
                flash_btn_4.equals(flash_btn_5)
                && flash_btn_5.equals(flash_btn_6)
                && flash_btn_4.equals(flash_btn_6)
                && flash_btn_4.equals("X")
                && flash_btn_5.equals("X")
                && flash_btn_6.equals("X")
                || flash_btn_4.equals("O")
                && flash_btn_5.equals("O")
                && flash_btn_6.equals("O")

                ){

            if(flash_btn_4.equals("X")){
                pontuacao_1++;
                jogador_1.setText(pontuacao_1+"");
            } else {
                pontuacao_2++;
                jogador_2.setText(pontuacao_2+"");
            }
            recomecar();
            /*O O O
            * X X X
            * O O O */
        } else if(
                   flash_btn_7.equals(flash_btn_8)
                && flash_btn_8.equals(flash_btn_9)
                && flash_btn_7.equals(flash_btn_9)
                && flash_btn_7.equals("X")
                && flash_btn_8.equals("X")
                && flash_btn_9.equals("X")
                || flash_btn_7.equals("O")
                && flash_btn_8.equals("O")
                && flash_btn_9.equals("O")

                ) {

            if(flash_btn_7.equals("X")){
                pontuacao_1++;
                jogador_1.setText(pontuacao_1+"");
            } else {
                pontuacao_2++;
                jogador_2.setText(pontuacao_2+"");
            }
            recomecar();
            /*O O O
            * O O O
            * X X X */
        } else if(
                   flash_btn_1.equals(flash_btn_4)
                && flash_btn_4.equals(flash_btn_7)
                && flash_btn_1.equals(flash_btn_7)
                && flash_btn_1.equals("X")
                && flash_btn_4.equals("X")
                && flash_btn_7.equals("X")
                || flash_btn_1.equals("O")
                && flash_btn_4.equals("O")
                && flash_btn_7.equals("O")
                ){

            if(flash_btn_1.equals("X")){
                pontuacao_1++;
                jogador_1.setText(pontuacao_1+"");
            } else {
                pontuacao_2++;
                jogador_2.setText(pontuacao_2+"");
            }
            recomecar();
            /*X O O
            * X O O
            * X O O */
        } else if(
                flash_btn_2.equals(flash_btn_5)
                && flash_btn_5.equals(flash_btn_8)
                && flash_btn_2.equals(flash_btn_8)
                && flash_btn_2.equals("X")
                && flash_btn_5.equals("X")
                && flash_btn_8.equals("X")
                || flash_btn_2.equals("O")
                && flash_btn_5.equals("O")
                && flash_btn_5.equals("O")
                ){

            if(flash_btn_2.equals("X")){
                pontuacao_1++;
                jogador_1.setText(pontuacao_1+"");
            } else {
                pontuacao_2++;
                jogador_2.setText(pontuacao_2+"");
            }
            recomecar();
            /*O X O
            * O X O
            * O X O */
        } else if(
                flash_btn_3.equals(flash_btn_6)
                && flash_btn_6.equals(flash_btn_9)
                && flash_btn_3.equals(flash_btn_9)
                && flash_btn_3.equals("X")
                && flash_btn_6.equals("X")
                && flash_btn_9.equals("X")
                || flash_btn_3.equals("O")
                && flash_btn_6.equals("O")
                && flash_btn_9.equals("O")
                ){

            if(flash_btn_3.equals("X")){
                pontuacao_1++;
                jogador_1.setText(pontuacao_1+"");
            } else {
                pontuacao_2++;
                jogador_2.setText(pontuacao_2+"");
            }
            recomecar();
            /*O O X
            * O O X
            * O O X */
        }else if(
                flash_btn_1.equals(flash_btn_5)
                && flash_btn_5.equals(flash_btn_9)
                && flash_btn_1.equals(flash_btn_9)
                && flash_btn_1.equals("X")
                && flash_btn_5.equals("X")
                && flash_btn_9.equals("X")
                || flash_btn_1.equals("O")
                && flash_btn_5.equals("O")
                && flash_btn_9.equals("O")
                ){

            if(flash_btn_1.equals("X")){
                pontuacao_1++;
                jogador_1.setText(pontuacao_1+"");
            } else {
                pontuacao_2++;
                jogador_2.setText(pontuacao_2+"");
            }
            recomecar();
            /*X O O
            * O X O
            * O O X */
        } else if(
                flash_btn_3.equals(flash_btn_5)
                && flash_btn_5.equals(flash_btn_7)
                && flash_btn_3.equals(flash_btn_7)
                && flash_btn_3.equals("X")
                && flash_btn_5.equals("X")
                && flash_btn_7.equals("X")
                || flash_btn_3.equals("O")
                && flash_btn_5.equals("O")
                && flash_btn_7.equals("O")

                ){

            if(flash_btn_3.equals("X")){
                pontuacao_1++;
                jogador_1.setText(pontuacao_1+"");
            } else {
                pontuacao_2++;
                jogador_2.setText(pontuacao_2+"");
            }
            recomecar();
            /*O O X
            * O X O
            * X O O  */
        } else {

        }
    }

    private void recomecar(){

        btn_1.setText("-");
        btn_2.setText("-");
        btn_3.setText("-");
        btn_4.setText("-");
        btn_5.setText("-");
        btn_6.setText("-");
        btn_7.setText("-");
        btn_8.setText("-");
        btn_9.setText("-");

        flash_btn_1 = "-";
        flash_btn_2 = "-";
        flash_btn_3 = "-";
        flash_btn_4 = "-";
        flash_btn_5 = "-";
        flash_btn_6 = "-";
        flash_btn_7 = "-";
        flash_btn_8 = "-";
        flash_btn_9 = "-";

        Vez = "X";
        contador_click = 0;
    }

    private void instanciar_elementos(){

        l1    = (LinearLayout) findViewById(R.id.linha1);
        l2    = (LinearLayout) findViewById(R.id.linha2);
        l3    = (LinearLayout) findViewById(R.id.linha3);
        lgS   = (LinearLayout) findViewById(R.id.gameState);

        btn_1 = (Button) findViewById(R.id.button1);
        btn_2 = (Button) findViewById(R.id.button2);
        btn_3 = (Button) findViewById(R.id.button3);
        btn_4 = (Button) findViewById(R.id.button4);
        btn_5 = (Button) findViewById(R.id.button5);
        btn_6 = (Button) findViewById(R.id.button6);
        btn_7 = (Button) findViewById(R.id.button7);
        btn_8 = (Button) findViewById(R.id.button8);
        btn_9 = (Button) findViewById(R.id.button9);

        btn_1.setText("-");
        btn_2.setText("-");
        btn_3.setText("-");
        btn_4.setText("-");
        btn_5.setText("-");
        btn_6.setText("-");
        btn_7.setText("-");
        btn_8.setText("-");
        btn_9.setText("-");

        flash_btn_1 = "-";
        flash_btn_2 = "-";
        flash_btn_3 = "-";
        flash_btn_4 = "-";
        flash_btn_5 = "-";
        flash_btn_6 = "-";
        flash_btn_7 = "-";
        flash_btn_8 = "-";
        flash_btn_9 = "-";

        vez       = (TextView) findViewById(R.id.textView);
        jogador_1 = (TextView) findViewById(R.id.textView2);
        jogador_2 = (TextView) findViewById(R.id.textView3);

    }

    private void PlayGame(){
        l1.setVisibility(View.VISIBLE);
        l2.setVisibility(View.VISIBLE);
        l3.setVisibility(View.VISIBLE);
        lgS.setVisibility(View.VISIBLE);
        vez.setText("Vez de: "+Vez);
    }

    public void onBackPressed() {
        if (this.lastBackPressTime < System.currentTimeMillis() - 4000) {
            toast = Toast.makeText(this, "Pressione o Botão Voltar novamente para fechar o Aplicativo.", Toast.LENGTH_LONG);
            toast.show();
            this.lastBackPressTime = System.currentTimeMillis();
        } else {
            if (toast != null) {
                toast.cancel();
            }
            super.onBackPressed();
        }
    }
}
