package app.buusk15.quiz01repair_797;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText edt_weight, edt_height, edt_firstname,edt_lastname;
	private String w,h,fn,ln;	
	private Button OK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_weight = (EditText) findViewById(R.id.editWeight797);
        edt_height = (EditText) findViewById(R.id.editHeight797);
        edt_firstname = (EditText) findViewById(R.id.editFirstname797);
        edt_lastname = (EditText) findViewById(R.id.editLastname797);
        OK = (Button) findViewById(R.id.btnOK797);
        OK.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v == OK){				
				w = edt_weight.getText().toString();
		    	h = edt_height.getText().toString();
		    	fn = edt_firstname.getText().toString();
		    	ln = edt_lastname.getText().toString();
				Intent i = new Intent(getApplicationContext(), ShowDetails.class);				
				i.putExtra("w",w);
				i.putExtra("h",h);
				i.putExtra("fn", fn);
				i.putExtra("ln", ln);
				startActivity(i);
				}
				
			}
		});
    }
   
  
   }


