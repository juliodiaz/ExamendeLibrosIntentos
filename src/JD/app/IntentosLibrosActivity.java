package JD.app;

import JD.app.R;
import JD.app.CambioPantalla;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class IntentosLibrosActivity extends Activity {
    /** Called when the activity is first created. */
	
	Button btnEnviar;
	EditText TxtAutor, TxtNomLib;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        
        TxtAutor = (EditText)findViewById(R.id.txtAutor);
        
        TxtNomLib = (EditText)findViewById(R.id.txtNomLib);
        
               
        btnEnviar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				cambiarPantalla();
				
			}
		});

        }

	    public void cambiarPantalla()
	    {
			Intent i = new Intent(this, CambioPantalla.class);
			i.putExtra("id", TxtAutor.getText().toString());
			i.putExtra("id1", TxtNomLib.getText().toString());
			startActivity(i);
	    }
        

    }
