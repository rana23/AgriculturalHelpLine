package kucse;


import com.example.agriculturalhelpline.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



	public class agriculture extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.agriculture);
			Button btnPaddy = (Button)findViewById(R.id.Paddy);
			Button btnFishing = (Button)findViewById(R.id.Fishing);
			Button btnFarm = (Button)findViewById(R.id.Farm);

		 btnPaddy.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	             Intent paddy = new Intent("android.intent.action.PADDY");
	             startActivity(paddy);
	            
	         }
	     });
		 
		 btnFishing.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	             Intent fishing = new Intent("android.intent.action.FISHING");
	             startActivity(fishing);
	         }
	     });
		 
		 btnFarm.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	             Intent farm = new Intent("android.intent.action.FARM");
	             startActivity(farm);
	         }
	     });
	 }


	}


