package com.example.gsttax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
TextView t,t2,t3,t4,ts,t5,t6;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,s1,s2,s3,s4,s5,s6,s7,s8,s9,s0,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Button)findViewById(R.id.button12);
        s2=(Button)findViewById(R.id.button13);
        s3=(Button)findViewById(R.id.button14);
        s4=(Button)findViewById(R.id.button15);
        s5=(Button)findViewById(R.id.button16);
        s6=(Button)findViewById(R.id.button17);
        s7=(Button)findViewById(R.id.button18);
        s8=(Button)findViewById(R.id.button19);
        s9=(Button)findViewById(R.id.button20);
        s0=(Button)findViewById(R.id.button21);
        s=(Button)findViewById(R.id.button22);
        ts=(TextView)findViewById(R.id.textView10);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
         t=(TextView)findViewById(R.id.textView3);
        t2=(TextView)findViewById(R.id.textView5);
        t3=(TextView)findViewById(R.id.textView7);
        t4=(TextView)findViewById(R.id.textView9);
        t5=(TextView)findViewById(R.id.textView11);
        t6=(TextView)findViewById(R.id.textView12);
        try {
            s1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "1");
                }
            });
            s2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "2");
                }
            });
            s3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "3");
                }
            });
            s4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "4");
                }
            });
            s5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "5");
                }
            });
            s6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "6");
                }
            });
            s7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "7");
                }
            });
            s8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "8");
                }
            });
            s9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "9");
                }
            });
            s0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText() + "0");
                }
            });
            s.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ts.setText(ts.getText()+".");
                }
            });
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this, "G.S.T Calculator",
                    Toast.LENGTH_LONG).show();
        }
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Amount;
                    int l;
                    Amount = Double.parseDouble(ts.getText().toString());
                    l = 103;
                    validate(Amount, l);
                }
                catch(Exception e)
                {

                    Toast.makeText(MainActivity.this, "Please fill details",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 try {
                     Double Amount;
                     int l;
                     Amount = Double.parseDouble(ts.getText().toString());
                     l = 105;
                     validate(Amount, l);
                 }
                 catch(Exception e)
                 {

                     Toast.makeText(MainActivity.this, "Please fill details",
                             Toast.LENGTH_LONG).show();
                 }
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Double Amount;
                        int l;
                        Amount = Double.parseDouble(ts.getText().toString());
                        l = 112;
                        validate(Amount, l);
                    }
                    catch(Exception e)
                    {

                        Toast.makeText(MainActivity.this, "Please fill details",
                                Toast.LENGTH_LONG).show();
                    }

                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Double Amount;
                        int l;
                        Amount = Double.parseDouble(ts.getText().toString());
                        l = 118;
                        validate(Amount, l);
                    }
                    catch(Exception e)
                    {

                        Toast.makeText(MainActivity.this, "Please fill details",
                                Toast.LENGTH_LONG).show();
                    }
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Double Amount;
                        int l;
                        Amount = Double.parseDouble(ts.getText().toString());
                        l = 128;
                        validate(Amount, l);
                    }
                    catch(Exception e)
                    {

                        Toast.makeText(MainActivity.this, "Please fill details",
                                Toast.LENGTH_LONG).show();
                    }
                }
            });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Amount;
                    int l;
                    Amount = Double.parseDouble(ts.getText().toString());
                    l = 3;
                    validate1(Amount, l);
                }
                catch(Exception e)
                {

                    Toast.makeText(MainActivity.this, "Please fill details",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Amount;
                    int l;
                    Amount = Double.parseDouble(ts.getText().toString());
                    l = 5;
                    validate1(Amount, l);
                }
                catch(Exception e)
                {

                    Toast.makeText(MainActivity.this, "Please fill details",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Amount;
                    int l;
                    Amount = Double.parseDouble(ts.getText().toString());
                    l = 12;
                    validate1(Amount, l);
                }
                catch(Exception e)
                {

                    Toast.makeText(MainActivity.this, "Please fill details",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Amount;
                    int l;
                    Amount = Double.parseDouble(ts.getText().toString());
                    l = 18;
                    validate1(Amount, l);
                }
                catch(Exception e)
                {

                    Toast.makeText(MainActivity.this, "Please fill details",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Amount;
                    int l;
                    Amount = Double.parseDouble(ts.getText().toString());
                    l = 28;
                    validate1(Amount, l);
                }
                catch(Exception e)
                {

                    Toast.makeText(MainActivity.this, "Please fill details",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    ts.setText("");
                    t5.setText("");
                    t6.setText("");
                }
            });


    }

    private void validate1(Double amount, int l) {
        String x,y,z;

        Double Tax;
        Double c, r, k, m;
        c = amount*l;
        Tax = c/100;
        m = Math.round(Tax * 100.0) / 100.0;
        DecimalFormat df=new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        x=df.format(m);
        r = m / 2;
        y=df.format(r);
        k = amount + m;
        z=df.format(k);
        t.setText(x);
        t2.setText(y);
        t3.setText(y);
        t4.setText(z);
        t5.setText("+"+l+"%");
        t6.setText("+"+l+"%");

    }

    private void validate(Double Amount,int l) {
        String x,y,z;
        Double Tax;
        int o;
        Double c, r, k, m,f;
        c = 100.0 / l;
        Tax = Amount - (Amount * c);
        m = Math.round(Tax * 100.0) / 100.0;
        DecimalFormat df=new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        x=df.format(m);
        r = m / 2;
        y=df.format(r);
        k = Amount - m;
        z=df.format(k);
        o=100-l;
        t.setText(x);
        t2.setText(y);
        t3.setText(y);
        t4.setText(z);
        t5.setText(o+"%");
        t6.setText(o+"%");
    }

}
