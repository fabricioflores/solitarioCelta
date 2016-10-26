package es.upm.miw.SolitarioCelta;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import es.upm.miw.SolitarioCelta.R;

public class ShowResults extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scores);
		TextView textView = (TextView) findViewById(R.id.scores);

		String finalText = "";
		try{
			BufferedReader fin = new BufferedReader(
					new InputStreamReader(openFileInput(getString(R.string.scores))));
			String linea = fin.readLine();
			while (linea != null) {
				finalText += linea + "\n";
				linea = fin.readLine();
			}
			fin.close();
		}catch(IOException e){
			Toast.makeText(this,
					getString(R.string.loadScoreException),
					Toast.LENGTH_SHORT).show();
		}
		textView.setText(finalText);
	}
}
