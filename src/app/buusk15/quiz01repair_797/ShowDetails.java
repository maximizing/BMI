package app.buusk15.quiz01repair_797;

import org.w3c.dom.Text;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class ShowDetails extends Activity {
	private String getweight,getheight,txt1,txt2,txt3,txt4,tx5,tx6,tx7,tx8,tx9,txt10,txt11,tx12,tx13,tx14,tx15,tx16,txt17,txt18,getfirstname,getlastname;
	private float weight,height,BMI;
	private TextView Result;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_details);		
		comparison();
	}
	private void comparison(){
		Result = (TextView) findViewById(R.id.txtResult797);
		Typeface thaifont = Typeface.createFromAsset(getAssets(), "fonts/THSarabun.ttf");
		Result.setTypeface(thaifont);
		Result.setTypeface(thaifont,Typeface.BOLD);
		
		getweight = getIntent().getStringExtra("w");
		getheight = getIntent().getStringExtra("h");
		getfirstname = getIntent().getStringExtra("fn");
		getlastname = getIntent().getStringExtra("ln");
		
		txt1 = "\n\nน้ำหนัก (Weight) = ";
		txt2 = "\n\nความสูง (Height) = ";
		txt3 = "\n\nBMI = ";
		txt4 = "\n\nคุณมีน้ำหนัก ";
		////////
		tx5 = "น้ำหนักน้อย / ผอม";
		tx6 = "ปกติ (สุขภาพดี)";
		tx7 = "ท้วม / โรคอ้วนระดับ 1";
		tx8 = "อ้วน / โรคอ้วนระดับ 2";
		tx9 = "อ้วนมาก / โรคอ้วนระดับ 3";
		////////
		txt10 = "\n\nโดยทั่วไปค่าดัชนีมวลกายปกติมีค่า ระหว่าง 18.50 - 22.90 ";
		txt11 = "\n\nภาวะเสี่ยงต่อโรค ";
		////////
		tx12 = "มากกว่าคนปกติ";
		tx13 = "เท่าคนปกติ";
		tx14 = "อันตรายระดับ 1";
		tx15 = "อันตรายระดับ 2";
		tx16 = "อันตรายระดับ 3";
		////////
		txt17 = "\nชื่อ "+getfirstname;
		txt18 = "\n\nนามสกุล "+getlastname;
			
		
		weight = Float.valueOf(getweight).floatValue();
    	height = Float.valueOf(getheight).floatValue();
    	BMI = (weight/((height/100)*(height/100)));
		
		if(BMI < 18.50){
			Result.setText(txt17+txt18+txt1+getweight+" กิโลกรัม"+txt2+getheight+" เซนติเมตร"+txt3+BMI+txt4+tx5+txt10+txt11+tx12);
		}else if(BMI > 30){
			Result.setText(txt17+txt18+txt1+getweight+" กิโลกรัม"+txt2+getheight+" เซนติเมตร"+txt3+BMI+txt4+tx9+txt10+txt11+tx16);
		}else if(BMI >= 18.50 && BMI <= 22.90){
			Result.setText(txt17+txt18+txt1+getweight+" กิโลกรัม"+txt2+getheight+" เซนติเมตร"+txt3+BMI+txt4+tx6+txt10+txt11+tx13);
		}else if(BMI >= 23 && BMI <= 24.90){
			Result.setText(txt17+txt18+txt1+getweight+" กิโลกรัม"+txt2+getheight+" เซนติเมตร"+txt3+BMI+txt4+tx7+txt10+txt11+tx14);
		}else if(BMI >= 25 && BMI <= 29.90){
			Result.setText(txt17+txt18+txt1+getweight+" กิโลกรัม"+txt2+getheight+" เซนติเมตร"+txt3+BMI+txt4+tx8+txt10+txt11+tx15);
		}
}
}
