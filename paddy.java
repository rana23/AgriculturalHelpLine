package kucse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.agriculturalhelpline.R;

public class paddy extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.paddy);
		Button btnPtypes =(Button) findViewById(R.id.types);
		Button btnPcultivate =(Button) findViewById(R.id.cultivate);
		Button btnPfartilizer =(Button) findViewById(R.id.fartilizer);
		Button btnPinsectes =(Button) findViewById(R.id.insects);
		Button btnPsoil =(Button) findViewById(R.id.soil);
		
		
		
		
		btnPtypes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent QBird = new Intent("android.intent.action.PTYPES");
				startActivity(QBird);
				
			}
		});
		
		
		
		btnPcultivate.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent QBird = new Intent("android.intent.action.PCULTIVATE");
			startActivity(QBird);
			
		}
	});
		
		
		btnPfartilizer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent QBird = new Intent("android.intent.action.PFARTILIZER");
				startActivity(QBird);
				
			}
		});
		
		
		btnPinsectes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent QBird = new Intent("android.intent.action.PINSECTES");
				startActivity(QBird);
				
			}
		});
		
		

		btnPsoil.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent QBird = new Intent("android.intent.action.PSOIL");
				startActivity(QBird);
				
			}
		});
	}
	
}
