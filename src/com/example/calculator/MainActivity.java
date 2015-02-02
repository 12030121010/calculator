package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText ed;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b16;
    private Button b17;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    ed=(EditText)findViewById(R.id.edit);
	    b1=(Button)findViewById(R.id.b1);
	    b2=(Button)findViewById(R.id.b2);
	    b3=(Button)findViewById(R.id.b3);
	    b4=(Button)findViewById(R.id.b4);
	    b5=(Button)findViewById(R.id.b5);
	    b6=(Button)findViewById(R.id.b6);
	    b7=(Button)findViewById(R.id.b7);
	    b8=(Button)findViewById(R.id.b8);
	    b9=(Button)findViewById(R.id.b9);
	    b10=(Button)findViewById(R.id.b10);
	    b11=(Button)findViewById(R.id.b11);
	    b12=(Button)findViewById(R.id.b12);
	    b13=(Button)findViewById(R.id.b13);
	    b14=(Button)findViewById(R.id.b14);
	    b15=(Button)findViewById(R.id.b15);
	    b16=(Button)findViewById(R.id.b16);
	    b17=(Button)findViewById(R.id.b17);
	    
	    OnClickListener buttonlistener = new OnClickListener()
	    {
	    	public void onClick(View v){
	    		String no=((Button)v).getText().toString();
	    		String txt=ed.getText().toString();
	    		ed.setText(txt+no);
	    				
	    	}
	    };
	    
	   b1.setOnClickListener(buttonlistener);
	   b2.setOnClickListener(buttonlistener);
	   b3.setOnClickListener(buttonlistener);
	   b4.setOnClickListener(buttonlistener);
	   b5.setOnClickListener(buttonlistener);
	   b6.setOnClickListener(buttonlistener);
	   b7.setOnClickListener(buttonlistener);
	   b8.setOnClickListener(buttonlistener);
	   b9.setOnClickListener(buttonlistener);
	   b10.setOnClickListener(buttonlistener);
	   
	}


    OnClickListener buttonlistener = new OnClickListener()
{
    	public void onClick(View v){
    		int id=v.getId();
    		switch(id)
    		{
    		case R.id.plus
    		}
    				
    	}
};
	
} 

