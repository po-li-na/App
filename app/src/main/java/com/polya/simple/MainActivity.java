package com.polya.simple;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.ArrayList;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
//import android.os.Debug;
import android.view.View;
//import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
//import android.widget.ImageView;
//import android.widget.Toast;
import android.os.Handler;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
      private ImageButton btn ;
      private ImageButton[][] arr;
      private AlertDialog.Builder alertBuild;
      private AlertDialog ale;
      private Boolean winTf=false;
      private Drawable me;
      private Drawable it;
      private  Boolean setTf;
      private Boolean iGo=true;

      private Boolean bol=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(Menu.vibor){
        me=(Drawable)getResources().getDrawable(android.R.drawable.presence_online);
        it=(Drawable)getResources().getDrawable(android.R.drawable.ic_delete);
        }else {
            it=(Drawable)getResources().getDrawable(android.R.drawable.presence_online);
            me=(Drawable)getResources().getDrawable(android.R.drawable.ic_delete);
        }
        Aler();
        onClose();
    }
   private void onClose(){
       ImageButton cl=(ImageButton) findViewById(R.id.close);

       cl.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       diafragma df=new diafragma();
                       df.setCancelable(false);
                       df.show(getSupportFragmentManager(),"my_dialog");

                   }
               }
       );
   }


    public  void onClick(View view){

     btn=(ImageButton) view.findViewWithTag("go");

    if(btn.getDrawable()==null) {

                 if(!Menu.swTf){
                     if(bol){
                         btn.setImageDrawable(me);
                         WinOrNot(me, "Победил 1 игрок");
                         bol=false;
                     }else{
                         btn.setImageDrawable(it);
                         WinOrNot(it, "Победил 2 игрок");
                         bol=true;
                     }
                 }else{
                     if(iGo) {
                         iGo = false;
                         btn.setImageDrawable(me);
                         WinOrNot(me, "Победа");
                         if (!winTf) {
                             Handler handler = new Handler();
                             handler.postDelayed(new Runnable() {
                                 public void run() {
                                     iGo = true;
                                     aiDo();
                                     WinOrNot(it, "Проигрыш");
                                 }
                             }, 500);

                         }
                     }
                 }

     }

    }

   private void WinOrNot( Drawable the, String tit) {


       arr = new ImageButton[][]{{(ImageButton) findViewById(R.id.imageButton1), (ImageButton) findViewById(R.id.imageButton2), (ImageButton) findViewById(R.id.imageButton3), (ImageButton) findViewById(R.id.imageButton4), (ImageButton) findViewById(R.id.imageButton5), (ImageButton) findViewById(R.id.imageButton6), (ImageButton) findViewById(R.id.imageButton7), (ImageButton) findViewById(R.id.imageButton8), (ImageButton) findViewById(R.id.imageButton9), (ImageButton) findViewById(R.id.imageButton10)},
               {(ImageButton) findViewById(R.id.imageButton11), (ImageButton) findViewById(R.id.imageButton12), (ImageButton) findViewById(R.id.imageButton13), (ImageButton) findViewById(R.id.imageButton14), (ImageButton) findViewById(R.id.imageButton15), (ImageButton) findViewById(R.id.imageButton16), (ImageButton) findViewById(R.id.imageButton17), (ImageButton) findViewById(R.id.imageButton18), (ImageButton) findViewById(R.id.imageButton19), (ImageButton) findViewById(R.id.imageButton20)},
               {(ImageButton) findViewById(R.id.imageButton21), (ImageButton) findViewById(R.id.imageButton22), (ImageButton) findViewById(R.id.imageButton23), (ImageButton) findViewById(R.id.imageButton24), (ImageButton) findViewById(R.id.imageButton25), (ImageButton) findViewById(R.id.imageButton26), (ImageButton) findViewById(R.id.imageButton27), (ImageButton) findViewById(R.id.imageButton28), (ImageButton) findViewById(R.id.imageButton29), (ImageButton) findViewById(R.id.imageButton30)},
               {(ImageButton) findViewById(R.id.imageButton31), (ImageButton) findViewById(R.id.imageButton32), (ImageButton) findViewById(R.id.imageButton33), (ImageButton) findViewById(R.id.imageButton34), (ImageButton) findViewById(R.id.imageButton35), (ImageButton) findViewById(R.id.imageButton36), (ImageButton) findViewById(R.id.imageButton37), (ImageButton) findViewById(R.id.imageButton38), (ImageButton) findViewById(R.id.imageButton39), (ImageButton) findViewById(R.id.imageButton40)},
               {(ImageButton) findViewById(R.id.imageButton41), (ImageButton) findViewById(R.id.imageButton42), (ImageButton) findViewById(R.id.imageButton43), (ImageButton) findViewById(R.id.imageButton44), (ImageButton) findViewById(R.id.imageButton45), (ImageButton) findViewById(R.id.imageButton46), (ImageButton) findViewById(R.id.imageButton47), (ImageButton) findViewById(R.id.imageButton48), (ImageButton) findViewById(R.id.imageButton49), (ImageButton) findViewById(R.id.imageButton50)},
               {(ImageButton) findViewById(R.id.imageButton51), (ImageButton) findViewById(R.id.imageButton52), (ImageButton) findViewById(R.id.imageButton53), (ImageButton) findViewById(R.id.imageButton54), (ImageButton) findViewById(R.id.imageButton55), (ImageButton) findViewById(R.id.imageButton56), (ImageButton) findViewById(R.id.imageButton57), (ImageButton) findViewById(R.id.imageButton58), (ImageButton) findViewById(R.id.imageButton59), (ImageButton) findViewById(R.id.imageButton60)},
               {(ImageButton) findViewById(R.id.imageButton61), (ImageButton) findViewById(R.id.imageButton62), (ImageButton) findViewById(R.id.imageButton63), (ImageButton) findViewById(R.id.imageButton64), (ImageButton) findViewById(R.id.imageButton65), (ImageButton) findViewById(R.id.imageButton66), (ImageButton) findViewById(R.id.imageButton67), (ImageButton) findViewById(R.id.imageButton68), (ImageButton) findViewById(R.id.imageButton69), (ImageButton) findViewById(R.id.imageButton70)},
               {(ImageButton) findViewById(R.id.imageButton71), (ImageButton) findViewById(R.id.imageButton72), (ImageButton) findViewById(R.id.imageButton73), (ImageButton) findViewById(R.id.imageButton74), (ImageButton) findViewById(R.id.imageButton75), (ImageButton) findViewById(R.id.imageButton76), (ImageButton) findViewById(R.id.imageButton77), (ImageButton) findViewById(R.id.imageButton78), (ImageButton) findViewById(R.id.imageButton79), (ImageButton) findViewById(R.id.imageButton80)},
               {(ImageButton) findViewById(R.id.imageButton81), (ImageButton) findViewById(R.id.imageButton82), (ImageButton) findViewById(R.id.imageButton83), (ImageButton) findViewById(R.id.imageButton84), (ImageButton) findViewById(R.id.imageButton85), (ImageButton) findViewById(R.id.imageButton86), (ImageButton) findViewById(R.id.imageButton87), (ImageButton) findViewById(R.id.imageButton88), (ImageButton) findViewById(R.id.imageButton89), (ImageButton) findViewById(R.id.imageButton90)},
               {(ImageButton) findViewById(R.id.imageButton91), (ImageButton) findViewById(R.id.imageButton92), (ImageButton) findViewById(R.id.imageButton93), (ImageButton) findViewById(R.id.imageButton94), (ImageButton) findViewById(R.id.imageButton95), (ImageButton) findViewById(R.id.imageButton96), (ImageButton) findViewById(R.id.imageButton97), (ImageButton) findViewById(R.id.imageButton98), (ImageButton) findViewById(R.id.imageButton99), (ImageButton) findViewById(R.id.imageButton100)}

       };

       int five=0;
       int five2=0;
       for (int str = 0; str < 10; str++) {
           for (int stl = 0; stl < 10; stl++) {
               ImageButton butFive = arr[str][stl];
               if (butFive.getDrawable() ==the) {
                   five++;
                    if(five==5){
                        winTf=true;
                        ale.setTitle(tit);
                        ale.show();
                    }
               } else{five=0;}
               ImageButton butFive2 = arr[stl][str];
               if (butFive2.getDrawable() ==the) {
                   five2++;
                   if(five2==5){
                       winTf=true;
                       ale.setTitle(tit);
                       ale.show();
                   }
               } else{five2=0;}
               if (stl==9){
                   five=0;
                   five2=0;

               }

           }
       }



       int fiveDi=0;
       int fiveDi2=0;
       for (int str = 0; str < 10; str++) {
           for (int stl = 0; stl < 10; stl++) {
               int o = 0;
               for (int i = 0; i < 10; i++) {
                   int r = str + o;
                   int l = stl + o;

                   if (l < 10 && r < 10) {
                       ImageButton butDi = arr[r][l];
                       //System.out.println(r + " " + l);
                      if (butDi.getDrawable() == the) {
                           fiveDi++;
                           if (fiveDi == 5) {
                               winTf = true;
                               ale.setTitle(tit);
                               ale.show();
                           }
                       } else {
                           fiveDi = 0;
                       }
                       if (l==9 ||r==9 ){
                           fiveDi=0;
                       }


                       o++;
                   }

               }


               int x = 0;
               int y = 0;
               for (int i2 = 0; i2 < 10; i2++) {
                   int r2 = str + x;
                   int l2 = stl + y;

                   if ( r2 < 10 && l2>-1) {
                       ImageButton butDi2 = arr[r2][l2];
                      // System.out.println(r2 + " " + l2);
                       if (butDi2.getDrawable() == the) {
                           fiveDi2++;
                           if (fiveDi2 == 5) {
                               winTf = true;
                               ale.setTitle(tit);
                               ale.show();
                           }
                       } else {
                           fiveDi2 = 0;
                       }
                       if (l2==0 ||r2==9 ){
                           fiveDi2=0;
                       }



                   }
                   x++;
                   y--;

               }
           }
       }


    }



    private void aiDo() {

        setTf = false;
        Random random = new Random();
        findIt(4, it, me, 5);
        findIt(4, me, it, 5);
        findIt(3, it, me, 5);
        findIt(3, me, it, 4);
        findIt(2, it, me, 5);

        // делает ход
        if (!setTf) {

            Boolean tf = false;
            Boolean findTf = false;

            Boolean yetTf = false;
            while (!tf) {
            int one=random.nextInt(10);
            int two=random.nextInt(10);
                ImageButton ai = arr[one][two];
                if (ai.getDrawable() == null) {

                    for (int str = 0; str < 10; str++) {
                        for (int stl = 0; stl < 10; stl++) {
                            ImageButton findBut = arr[str][stl];
                            if (findBut.getDrawable() == it) {
                                yetTf = true;
                               if(str<one+5 && str>one-5 && stl<two+5 && stl>two-5 ){
                                for (int any = 0; any < 10; any++) {

                                    if (ai == arr[any][stl] || ai == arr[str][any]) {

                                        ai.setImageDrawable(it);
                                        tf = true;
                                    } else if (str + any < 10 && stl + any < 10) {
                                        if (ai == arr[str + any][stl + any]) {
                                            ai.setImageDrawable(it);
                                            tf = true;
                                        } else if (str + any < 10 && stl - any > -1) {
                                            if (ai == arr[str + any][stl - any]) {
                                                ai.setImageDrawable(it);
                                                tf = true;
                                            }
                                        }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if (!yetTf) {
                        ai.setImageDrawable(it);
                        tf = true;
                    }
                }  // заполнены ли все клетки
                for (int str = 0; str < 10; str++) {
                    for (int stl = 0; stl < 10; stl++) {
                        ImageButton finBut = arr[str][stl];
                        if (finBut.getDrawable() == null) {
                            findTf = true;
                        }
                    }
                }
                if (!findTf) {
                    if(!winTf){
                    // значит все клетки заполнены
                    //Toast.makeText(MainActivity.this, "НИЧЬЯЯЯЯЯ", Toast.LENGTH_LONG).show();
                    tf = true;
                    ale.setTitle("Ничья");
                    ale.show();
                    }
                }
            }
        }
    }
    private void Aler(){
        alertBuild= new AlertDialog.Builder(MainActivity.this);
        alertBuild.setMessage("Начать заново?").setCancelable(false).setPositiveButton("Выйти", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        }).setNegativeButton("Да", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                recreate();
            }
        });
        ale=alertBuild.create();
    }
    private void findIt(int valueIt, Drawable the, Drawable my, int f){
        ImageButton setBut;
       // setTf = false;
        Random random = new Random();

        for(int str=0; str<10;str++){
            int fintTwo=0;
            for(int stl=0; stl<10;stl++){
                ImageButton findBut= arr[str][stl];
                if(findBut.getDrawable()==the){
                    fintTwo++;
                    if(fintTwo==valueIt) {

                        int five22=0;

                        ArrayList<Integer> al = new ArrayList<Integer>();
                        for (int a = 0; a < 10; a++) {

                            setBut = arr[str][a];

                            if (setBut.getDrawable() != my) {
                                five22++;
                                al.add(a);
                                if (five22 >= f) {
                                    int ft = 0;
                                    Boolean vse=false;
                                    for (int b = 0; b < f; b++) {
                                        ImageButton fBut = arr[str][al.get(b)];

                                        if (fBut.getDrawable() == the) {
                                            ft++;
                                            if (ft == f) {
                                                vse=true;
                                            }
                                        }
                                    }
                                    if(!vse){
                                        ft=0;
                                    for (int b = 0; b < f; b++) {
                                        ImageButton fBut = arr[str][al.get(b)];

                                        if (fBut.getDrawable() == the) {
                                            ft++;

                                            if (ft == valueIt) {
                                                while (!setTf) {
                                                    int rand = random.nextInt(10);
                                                    for (int c = 0; c < f; c++) {
                                                        if (al.get(c) == rand) {
                                                            ImageButton setTochno = arr[str][rand];
                                                            if (setTochno.getDrawable() == null) {
                                                                if (!setTf) {
                                                                    setTochno.setImageDrawable(it);
                                                                    setTf = true;
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                    }al.remove(0);

                                }

                            } else {
                                five22 = 0;
                                al=new ArrayList<Integer>();
                            }


                        }


                    }
                }
            }
        }

        for(int str=0; str<10;str++){
            int fintTwo=0;
            for(int stl=0; stl<10;stl++){
                ImageButton findBut= arr[stl][str];
                if(findBut.getDrawable()==the){
                    fintTwo++;
                    if(fintTwo==valueIt) {

                        int five22=0;

                        ArrayList<Integer> al = new ArrayList<Integer>();
                        for (int a = 0; a < 10; a++) {

                            setBut = arr[a][str];

                            if (setBut.getDrawable() != my) {
                                five22++;
                                al.add(a);
                                if (five22 >= f) {
                                    int ft = 0;
                                    Boolean vse=false;
                                    for (int b = 0; b < f; b++) {
                                        ImageButton fBut = arr[al.get(b)][str];

                                        if (fBut.getDrawable() == the) {
                                            ft++;
                                            if (ft == f) {
                                                vse=true;
                                            }
                                        }
                                    }
                                    if(!vse){
                                    ft=0;
                                    for (int b = 0; b < f; b++) {
                                        ImageButton fBut = arr[al.get(b)][str];

                                        if (fBut.getDrawable() == the) {
                                            ft++;

                                            if (ft == valueIt) {
                                                while (!setTf) {
                                                    int rand = random.nextInt(10);
                                                    for (int c = 0; c < f; c++) {
                                                        if (al.get(c) == rand) {
                                                            ImageButton setTochno = arr[rand][str];
                                                            if (setTochno.getDrawable() == null) {
                                                                if (!setTf) {
                                                                    setTochno.setImageDrawable(it);
                                                                    setTf = true;
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }al.remove(0);

                                }

                            } else {
                                five22 = 0;
                                al=new ArrayList<Integer>();
                            }


                        }


                    }
                }
            }
        }
        for(int str=0; str<10;str++) {
            for (int stl = 0; stl < 10; stl++) {
                int fintTwo = 0;
                for (int any = 0; any < 10; any++) {
                    if (str + any < 10 && stl + any < 10) {
                    ImageButton findBut = arr[str + any ][stl + any ];
                    if (findBut.getDrawable() == the) {
                        fintTwo++;
                        if (fintTwo == valueIt) {

                            int five22 = 0;

                            ArrayList<Integer> al = new ArrayList<Integer>();
                            for (int a = 0; a < 10; a++) {
                                  if (str + a < 10 && stl + a < 10) {
                                setBut = arr[str + a][stl + a];

                                if (setBut.getDrawable() != my) {
                                    five22++;
                                    al.add(a);
                                    if (five22 >= f) {
                                        int ft = 0;
                                        Boolean vse=false;
                                        for (int b = 0; b < f; b++) {
                                            if (str + b < 10 && stl + b < 10) {
                                                ImageButton fBut = arr[str + al.get(b)][stl + al.get(b)];


                                                if (fBut.getDrawable() == the) {
                                                ft++;
                                                if (ft == f) {
                                                    vse = true;
                                                }
                                                }
                                            }
                                        }
                                        if(!vse){
                                            ft=0;
                                        for (int b = 0; b < f; b++) {
                                            if (str + b < 10 && stl + b < 10) {
                                                ImageButton fBut = arr[str + al.get(b)][stl + al.get(b)];

                                                if (fBut.getDrawable() == the) {
                                                    ft++;

                                                    if (ft == valueIt) {
                                                        while (!setTf) {
                                                            int rand = random.nextInt(10);
                                                            for (int c = 0; c < f; c++) {
                                                                if (al.get(c) == rand) {
                                                                    if (str + rand < 10 && stl + rand < 10) {
                                                                        ImageButton setTochno = arr[str + rand][stl + rand];
                                                                        if (setTochno.getDrawable() == null) {
                                                                            if (!setTf) {
                                                                                setTochno.setImageDrawable(it);
                                                                                setTf = true;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }  al.remove(0);

                                    }

                                } else {
                                    five22 = 0;
                                    al = new ArrayList<Integer>();
                                    ;
                                }

                            }
                            }
                        }

                        }
                    }
                }
            }
        }
        for(int str=0; str<10;str++) {
            for (int stl = 0; stl < 10; stl++) {
                int fintTwo = 0;
                for (int any = 0; any < 10; any++) {
                    if (str + any < 10 && stl - any > -1) {
                        ImageButton findBut = arr[str + any ][stl - any ];
                        if (findBut.getDrawable() == the) {
                            fintTwo++;
                            if (fintTwo == valueIt) {

                                int five22 = 0;

                                ArrayList<Integer> al = new ArrayList<Integer>();
                                for (int a = 0; a < 10; a++) {
                                    if (str + a < 10 && stl - a > -1) {
                                        setBut = arr[str + a][stl - a];

                                        if (setBut.getDrawable() != my) {
                                            five22++;
                                            al.add(a);
                                            if (five22 >= f) {
                                                int ft = 0;
                                                Boolean vse=false;
                                                for (int b = 0; b < f; b++) {
                                                    if (str + b < 10 && stl - b > -1) {
                                                        ImageButton fBut = arr[str + al.get(b)][stl - al.get(b)];


                                                        if (fBut.getDrawable() == the) {
                                                            ft++;
                                                            if (ft == f) {
                                                                vse = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                if(!vse){
                                                    ft=0;
                                                for (int b = 0; b < f; b++) {
                                                    if (str + b < 10 && stl - b > -1) {
                                                        ImageButton fBut = arr[str + al.get(b)][stl - al.get(b)];

                                                        if (fBut.getDrawable() == the) {
                                                            ft++;

                                                            if (ft == valueIt) {
                                                                while (!setTf) {
                                                                    int rand = random.nextInt(10);
                                                                    for (int c = 0; c < f; c++) {
                                                                        if (al.get(c) == rand) {
                                                                            if (str + rand < 10 && stl - rand > -1) {
                                                                                ImageButton setTochno = arr[str + rand][stl - rand];
                                                                                if (setTochno.getDrawable() == null) {
                                                                                    if (!setTf) {
                                                                                        setTochno.setImageDrawable(it);
                                                                                        setTf = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                                al.remove(0);

                                            }

                                        } else {
                                            five22 = 0;
                                            al = new ArrayList<Integer>();

                                        }

                                    }
                                }
                            }

                        }
                    }
                }
            }
        }

    }


 }