package JD.app;

import JD.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CambioPantalla extends Activity 
{ 
	TextView textoLargo;
	TextView textoLargo1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bundle b = getIntent().getExtras();
		
		
			setContentView(R.layout.pantalla_new);
		
		
		textoLargo = (TextView) findViewById(R.id.txtAutor);
		textoLargo1 = (TextView) findViewById(R.id.txtNomLib);
		textoLargo.append(b.getString("id"));
		textoLargo1.append(b.getString("id1"));
		
		Log.e("mensaje","entro al cambio de pantalla");
		
	}

}
