package kucse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.agriculturalhelpline.R;

public class fishing extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fishing);
		Button btnFtypes =(Button) findViewById(R.id.types);
		Button btnFcultivate =(Button) findViewById(R.id.Fish_Culture);
		Button btnFdisease =(Button) findViewById(R.id.Disease);
		Button btnFfood =(Button) findViewById(R.id.Fish_Food);
		Button btnFwater =(Button) findViewById(R.id.Nature_Of_Water);
		
		
		
		
		btnFtypes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent QBird = new Intent("android.intent.action.FTYPES");
				startActivity(QBird);
				
			}
		});
		
		
		
		btnFcultivate.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent QBird = new Intent("android.intent.action.FCULTURE");
			startActivity(QBird);
			
		}
	});
		
		
		btnFdisease.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent QBird = new Intent("android.intent.action.FDISEASE");
				startActivity(QBird);
				
			}
		});
		
		
		btnFfood.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent QBird = new Intent("android.intent.action.FFOOD");
				startActivity(QBird);
				
			}
		});
		
		

		btnFwater.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent QBird = new Intent("android.intent.action.FWATER");
				startActivity(QBird);
				
			}
		});
	}
	
}
