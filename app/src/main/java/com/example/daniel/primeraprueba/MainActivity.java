package com.example.daniel.primeraprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {


   private Button boton,botonant;
    //String[] arr_nums ={"1", "2","3","4","5","6","7","8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String[] arr_nums ={"1", "2","3","4","5","6","7","8"};
        PonO();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void PonO(){
        boton=(Button) findViewById(R.id.button);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button2);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button3);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button4);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button5);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button6);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button7);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button8);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button9);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button10);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button11);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button12);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button13);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button14);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button15);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button16);
        boton.setText("O");
    }


    String conb1="",conb2="",conb3="",conb4="",conb5="",conb6="",conb7="",conb8="",conb9="",conb10="",conb11="",conb12="",conb13="",conb14="",conb15="",conb16="";
    int usoi0=0,usoi1=0,usoi2=0,usoi3=0,usoi4=0,usoi5=0,usoi6=0,usoi7=0;

    public void InitRand(ArrayList<String> arr, Random r){
        int anterior=0;
        while(conb1.equals("")||conb2.equals("")||conb3.equals("")||conb4.equals("")||conb5.equals("")||conb6.equals("")||conb7.equals("")||conb8.equals("")||conb9.equals("")||conb10.equals("")||conb11.equals("")||conb12.equals("")||conb13.equals("")||conb14.equals("")||conb15.equals("")||conb16.equals("")){
            if(conb1.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb1= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb1= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb1= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb1= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb1= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb1= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb1= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb1= arr.get(ra);usoi7++;}  }

        }
            if(conb2.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb2= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb2= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb2= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb2= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb2= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb2= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb2= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb2= arr.get(ra);usoi7++;}  }

            }

            if(conb3.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb3= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb3= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb3= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb3= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb3= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb3= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb3= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb3= arr.get(ra);usoi7++;}  }

            }
            if(conb4.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb4= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb4= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb4= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb4= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb4= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb4= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb4= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb4= arr.get(ra);usoi7++;}  }

            }
            if(conb5.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb5= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb5= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb5= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb5= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb5= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb5= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb5= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb5= arr.get(ra);usoi7++;}  }

            }
            if(conb6.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb6= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb6= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb6= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb6= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb6= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb6= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb6= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb6= arr.get(ra);usoi7++;}  }

            }
            if(conb7.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb7= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb7= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb7= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb7= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb7= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb7= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb7= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb7= arr.get(ra);usoi7++;}  }

            }
            if(conb8.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb8= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb8= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb8= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb8= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb8= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb8= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb8= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb8= arr.get(ra);usoi7++;}  }

            }
            if(conb9.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb9= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb9= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb9= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb9= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb9= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb9= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb9= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb9= arr.get(ra);usoi7++;}  }

            }
            if(conb10.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb10= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb10= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb10= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb10= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb10= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb10= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb10= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb10= arr.get(ra);usoi7++;}  }

            }
            if(conb11.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb11= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb11= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb11= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb11= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb11= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb11= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb11= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb11= arr.get(ra);usoi7++;}  }

            }
            if(conb12.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb12= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb12= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb12= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb12= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb12= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb12= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb12= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb12= arr.get(ra);usoi7++;}  }

            }
            if(conb13.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb13= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb13= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb13= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb13= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb13= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb13= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb13= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb13= arr.get(ra);usoi7++;}  }

            }
            if(conb14.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb14= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb14= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb14= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb14= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb14= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb14= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb14= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb14= arr.get(ra);usoi7++;}  }

            }
            if(conb15.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb15= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb15= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb15= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb15= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb15= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb15= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb15= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb15= arr.get(ra);usoi7++;}  }

            }
            if(conb16.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb16= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb16= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb16= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb16= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb16= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb16= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb16= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb16= arr.get(ra);usoi7++;}  }

            }
     }
    }



    int pareja=0,start=0,rand=0,posant=0,parencontrado=0,bloqueo=0;
    String x="",ant="";
    ArrayList<String> num_list = new ArrayList<String>();
    Random r = new Random();
    Thread t = new Thread();
    android.os.Handler h = new android.os.Handler();
    public void ClickBoton(View view) throws InterruptedException {
        if(start==0){
        num_list.add("1");num_list.add("2");num_list.add("3");num_list.add("4");num_list.add("5");num_list.add("6");num_list.add("7");num_list.add("8");start=1;InitRand(num_list,r);}

       // rand=r.nextInt(num_list.size());

        switch (view.getId()) {
            case R.id.button:
              if(bloqueo==0) {
                  boton = (Button) findViewById(R.id.button);
                  if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                      if (pareja == 0) {
                          boton.setText(conb1);
                          pareja++;
                          ant = conb1;
                          botonant = boton;
                      } else {
                          boton.setText(conb1);

                          if (ant.equals(conb1)) {//encontro pareja
                              if (parencontrado == 8) {
                                  //victoria
                                  boton = (Button) findViewById(R.id.button17);
                                  boton.setText("Victoria!");
                              } else {
                                  //num_list.remove(rand);
                                  parencontrado++;
                                  pareja = 0;
                              }

                          } else {//no encontro pareja
                              bloqueo = 1;
                              h.postDelayed(new Runnable() {
                                  @Override
                                  public void run() {
                                      botonant.setText("O");
                                      boton.setText("O");

                                  }
                              }, 1000);

                              h.postDelayed(new Runnable() {
                                  @Override
                                  public void run() {

                                      bloqueo = 0;
                                      pareja = 0;
                                  }
                              }, 1500);


                          }
                      }
                  }
              }

                break;

            case R.id.button2:
               // rand=r.nextInt(num_list.size()-1); x=Integer.toString(rand);
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button2);
                    if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb2);
                            pareja++;
                            ant = conb2;
                            botonant = boton;
                        } else {
                            boton.setText(conb2);

                            if (ant.equals(conb2)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }
               // boton.setText(x);
                //num_list.remove(0);
                break;

            case R.id.button3:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button3);
                    if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb3);
                            pareja++;
                            ant = conb3;
                            botonant = boton;
                        } else {
                            boton.setText(conb3);

                            if (ant.equals(conb3)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }
                break;

            case R.id.button4:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button4);
                    if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb4);
                            pareja++;
                            ant = conb4;
                            botonant = boton;
                        } else {
                            boton.setText(conb4);

                            if (ant.equals(conb4)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    // num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button5:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button5);
                    if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb5);
                            pareja++;
                            ant = conb5;
                            botonant = boton;
                        } else {
                            boton.setText(conb5);

                            if (ant.equals(conb5)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button6:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button6);
                    if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb6);
                            pareja++;
                            ant = conb6;
                            botonant = boton;
                        } else {
                            boton.setText(conb6);

                            if (ant.equals(conb6)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    // num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button7:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button7);
                    if ( boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb7);
                            pareja++;
                            ant = conb7;
                            botonant = boton;
                        } else {
                            boton.setText(conb7);

                            if (ant.equals(conb7)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button8:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button8);
                    if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb8);
                            pareja++;
                            ant = conb8;
                            botonant = boton;
                        } else {
                            boton.setText(conb8);

                            if (ant.equals(conb8)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button9:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button9);
                    if ( boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb9);
                            pareja++;
                            ant = conb9;
                            botonant = boton;
                        } else {
                            boton.setText(conb9);

                            if (ant.equals(conb9)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button10:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button10);
                    if ( boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb10);
                            pareja++;
                            ant = conb10;
                            botonant = boton;
                        } else {
                            boton.setText(conb10);

                            if (ant.equals(conb10)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    // num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button11:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button11);
                    if ( boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb11);
                            pareja++;
                            ant = conb11;
                            botonant = boton;
                        } else {
                            boton.setText(conb11);

                            if (ant.equals(conb11)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button12:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button12);
                    if ( boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb12);
                            pareja++;
                            ant = conb12;
                            botonant = boton;
                        } else {
                            boton.setText(conb12);

                            if (ant.equals(conb12)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    // num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button13:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button13);
                    if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb13);
                            pareja++;
                            ant = conb13;
                            botonant = boton;
                        } else {
                            boton.setText(conb13);

                            if (ant.equals(conb13)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    // num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button14:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button14);
                    if ( boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb14);
                            pareja++;
                            ant = conb14;
                            botonant = boton;
                        } else {
                            boton.setText(conb14);

                            if (ant.equals(conb14)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button15:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button15);
                    if ( boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb15);
                            pareja++;
                            ant = conb15;
                            botonant = boton;
                        } else {
                            boton.setText(conb15);

                            if (ant.equals(conb15)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

            case R.id.button16:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button16);
                    if (boton.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

                        if (pareja == 0) {
                            boton.setText(conb16);
                            pareja++;
                            ant = conb16;
                            botonant = boton;
                        } else {
                            boton.setText(conb16);

                            if (ant.equals(conb16)) {//encontro pareja
                                if (parencontrado == 8) {
                                    //victoria
                                    boton = (Button) findViewById(R.id.button17);
                                    boton.setText("Victoria!");
                                } else {
                                    //num_list.remove(rand);
                                    parencontrado++;
                                    pareja = 0;
                                }

                            } else {//no encontro pareja
                                bloqueo = 1;
                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        botonant.setText("O");
                                        boton.setText("O");

                                    }
                                }, 1000);

                                h.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        bloqueo = 0;
                                        pareja = 0;
                                    }
                                }, 1500);
                            }
                        }
                    }
                }

                break;

        }
        if (parencontrado==8) {
            //victoria
            boton = (Button) findViewById(R.id.button17);
            boton.setText("Victoria!");
        }
    }
}
