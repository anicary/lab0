package mx.edu.ittepic.tdm_juegogato_anacarolinamondragonrangel;

import android.content.DialogInterface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private Boolean c1, c2, c3, c4, c5, c6, c7, c8, c9;
    int turno;
int xd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        turno = 1;
        c1 = false;
        c2 = false;
        c3 = false;
        c4 = false;
        c5 = false;
        c6 = false;
        c7 = false;
        c8 = false;
        c9 = false;

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn1.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn1.setText("X");

                    } else if (turno == 2) {
                        turno = 1;
                        btn1.setText("O");
                    }
                }
                c1 = true;
                FinJuego();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn2.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn2.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn2.setText("O");
                    }
                }
                c2 = true;
                FinJuego();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn3.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn3.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn3.setText("O");
                    }
                }
                c3 = true;
                FinJuego();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn4.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn4.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn4.setText("O");
                    }
                }
                c4 = true;
                FinJuego();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn5.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn5.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn5.setText("O");
                    }
                }
                c5 = true;
                FinJuego();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn6.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn6.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn6.setText("O");
                    }
                }
                c6 = true;
                FinJuego();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn7.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn7.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn7.setText("O");
                    }
                }
                c7 = true;
                FinJuego();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn8.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn8.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn8.setText("O");
                    }
                }
                c8 = true;
                FinJuego();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn9.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn9.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn9.setText("O");
                    }
                }
                c9 = true;
                FinJuego();
            }
        });

    }

    public void FinJuego() {

        String a, b, c, d, e, f, g, h, i;
        boolean fin = false;

        a = btn1.getText().toString();
        b = btn2.getText().toString();
        c = btn3.getText().toString();
        d = btn4.getText().toString();
        e = btn5.getText().toString();
        f = btn6.getText().toString();
        g = btn7.getText().toString();
        h = btn8.getText().toString();
        i = btn9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Ganan las X", Toast.LENGTH_LONG).show();
            fin = true;
        }

        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Ganan las O", Toast.LENGTH_LONG).show();
            fin = true;
        }

        if (c1 == true)
            if (c2 == true)
                if (c3 == true)
                    if (c4 == true)
                        if (c5 == true)
                            if (c6 == true)
                                if (c7 == true)
                                    if (c8 == true)
                                        if (c9 == true) {
                                            Toast.makeText(MainActivity.this, "Empate", Toast.LENGTH_LONG).show();
                                            fin = true;
                                        }

        if (fin) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);


            new AlertDialog.Builder(this)
                    .setTitle("Fin del juego")
                    .setMessage("¿Volver a jugar?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            recreate();
                        }

                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .show();
        }
    }

    public void Reiniciar(View view) {
        recreate();
    }
}
