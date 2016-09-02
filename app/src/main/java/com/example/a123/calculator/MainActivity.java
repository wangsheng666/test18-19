package com.example.a123.calculator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
    /**
     * Called when the activity is first created.
     */
    private Button add, sub, mult, divid, caculate, clear;
    private Button dig0, dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, dim, sqr;
    private EditText factor1;
    private String factoronestr, factortwostr;
    double value = 0;
    String symbol = "a";
    String tem = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clear = (Button) findViewById(R.id.clear);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mult);
        divid = (Button) findViewById(R.id.divid);
        caculate = (Button) findViewById(R.id.caculate);
        sqr = (Button) findViewById(R.id.sqr);
        dig1 = (Button) findViewById(R.id.dig1);
        dig3 = (Button) findViewById(R.id.dig3);
        dig2 = (Button) findViewById(R.id.dig2);
        dig4 = (Button) findViewById(R.id.dig4);
        dig5 = (Button) findViewById(R.id.dig5);
        dig6 = (Button) findViewById(R.id.dig6);
        dig7 = (Button) findViewById(R.id.dig7);
        dig8 = (Button) findViewById(R.id.dig8);
        dig9 = (Button) findViewById(R.id.dig9);
        dig0 = (Button) findViewById(R.id.dig0);
        dim = (Button) findViewById(R.id.dim);
        factor1 = (EditText) findViewById(R.id.factor1);
        add.setOnClickListener(new addlistener());
        sub.setOnClickListener(new sublistener());
        mult.setOnClickListener(new multlistener());
        divid.setOnClickListener(new dividlistener());
        caculate.setOnClickListener(new listener());
        clear.setOnClickListener(new clearlistener());
        sqr.setOnClickListener(new sqrlistener());
        dig1.setOnClickListener(this);
        dig3.setOnClickListener(this);
        dig2.setOnClickListener(this);
        dig4.setOnClickListener(this);
        dig5.setOnClickListener(this);
        dig6.setOnClickListener(this);
        dig7.setOnClickListener(this);
        dig8.setOnClickListener(this);
        dig9.setOnClickListener(this);
        dig0.setOnClickListener(this);
        dim.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(dig3)) {
            tem = tem + "3";
            factor1.setText(tem);
        }
        if (v.equals(dig1)) {
            tem = tem + "1";
            factor1.setText(tem);
        }
        if (v.equals(dig2)) {
            tem = tem + "2";
            factor1.setText(tem);
        }
        if (v.equals(dig4)) {
            tem = tem + "4";
            factor1.setText(tem);
        }
        if (v.equals(dig5)) {
            tem = tem + "5";
            factor1.setText(tem);
        }
        if (v.equals(dig6)) {
            tem = tem + "6";
            factor1.setText(tem);
        }
        if (v.equals(dig7)) {
            tem = tem + "7";
            factor1.setText(tem);
        }
        if (v.equals(dig8)) {
            tem = tem + "8";
            factor1.setText(tem);
        }
        if (v.equals(dig9)) {
            tem = tem + "9";
            factor1.setText(tem);
        }
        if (v.equals(dig0)) {
            tem = tem + "0";
            factor1.setText(tem);
        }
        if (v.equals(dim)) {
            tem = tem + ".";
            factor1.setText(tem);
        }
    }

    class addlistener implements OnClickListener {
        @Override
        public void onClick(View arg0) {   // TODO Auto-generated method stub
            factoronestr = factor1.getText().toString();
            if (factoronestr.equals("")) {
            } else if (symbol == "a") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = factoronedouble;
                factor1.setText("");
            } else if (symbol == "*") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value * factoronedouble;
                factor1.setText("");
            } else if (symbol == "-") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value - factoronedouble;
                factor1.setText("");
            } else if (symbol == "/") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value / factoronedouble;
                factor1.setText("");
            } else {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = factoronedouble + value;
                factor1.setText("");
            }
            symbol = "+";
            tem = "";
        }
    }

    class sublistener implements OnClickListener {

        @Override
        public void onClick(View arg0) {   // TODO Auto-generated method stub
            factoronestr = factor1.getText().toString();
            if (factoronestr.equals("")) {
            } else if (symbol == "a") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = factoronedouble;
                factor1.setText("");
            } else if (symbol == "*") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value * factoronedouble;
                factor1.setText("");
            } else if (symbol == "+") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value + factoronedouble;
                factor1.setText("");
            } else if (symbol == "/") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value / factoronedouble;
                factor1.setText("");
            } else {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value - factoronedouble;
                factor1.setText("");
            }
            symbol = "-";
            tem = "";
        }
    }   class multlistener implements OnClickListener{
        @Override
        public void onClick(View arg0) {
        // TODO Auto-generated method stub
            factoronestr = factor1.getText().toString();
            if (factoronestr.equals("")) {
            } else if (symbol == "a") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = factoronedouble;
                factor1.setText("");
            } else if (symbol == "+") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value + factoronedouble;
                factor1.setText("");
            } else if (symbol == "-") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value - factoronedouble;
                factor1.setText("");
            } else if (symbol == "/") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value / factoronedouble;
                factor1.setText("");
            } else {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = factoronedouble * value;
                factor1.setText("");
            }
            symbol = "*";
            tem = "";
        }
    }

    class dividlistener implements OnClickListener {
        @Override
        public void onClick(View arg0) {
        // TODO Auto-generated method stub
            factoronestr = factor1.getText().toString();
            if (factoronestr.equals("")) {
            } else if (symbol == "a") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = factoronedouble;
                factor1.setText("");
            } else if (symbol == "*") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value * factoronedouble;
                factor1.setText("");
            } else if (symbol == "-") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value - factoronedouble;
                factor1.setText("");
            } else if (symbol == "+") {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value + factoronedouble;
                factor1.setText("");
            } else {
                factoronestr = factor1.getText().toString();
                double factoronedouble = Double.parseDouble(factoronestr);
                value = value / factoronedouble;
                factor1.setText("");
            }
            symbol = "/";
            tem = "";
        }
    }

    class clearlistener implements OnClickListener {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub  factor1.setText(null);
            symbol = "a";
            tem = "";
        }
    }
    class listener implements OnClickListener {
        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            factortwostr = factor1.getText().toString();
            double factortwodouble = Double.parseDouble(factortwostr);
            if (symbol == "+") {
                value = value + factortwodouble;
                factor1.setText(value + "");
                value = 0;
                symbol = "a";
            }
            if (symbol == "-") {
                value = value - factortwodouble;
                factor1.setText(value + "");
                value = 0;
                symbol = "a";

            }
            if (symbol == "*") {
                value = value * factortwodouble;
                factor1.setText(value + "");
                value = 0;
                symbol = "a";
            }
            if (symbol == "/") {
                value = value / factortwodouble;
                if (value % 1 == 0) {
                    factor1.setText((int) value + "");
                } else {
                    factor1.setText(value + "");
                }
                value = 0;
                symbol = "a";
            }
            tem = "";
        }
    }   class sqrlistener implements OnClickListener{
        @Override   public void onClick(View v) {
            // TODO Auto-generated method stub
            factoronestr = factor1.getText().toString();
            factoronestr = factor1.getText().toString();
            if (factoronestr.equals("")) {
            } else {
                double factoronedouble = Double.parseDouble(factoronestr);
                value = StrictMath.pow(factoronedouble, 0.5);
                factor1.setText("" + value);
                value = 0;
                symbol = "a";
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        menu.add(0, 1, 1, "exit");
        menu.add(0, 2, 2, "about");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        if (item.getItemId() == 1) {
            finish();
        }
        if (item.getItemId() == 2) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, MainActivity.class);
            MainActivity.this.startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}