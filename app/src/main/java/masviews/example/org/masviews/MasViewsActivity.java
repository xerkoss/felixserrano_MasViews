package masviews.example.org.masviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MasViewsActivity extends AppCompatActivity {

    private EditText entrada;
    private EditText salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_views);
        entrada = (EditText)findViewById(R.id.entrada);
        salida = (EditText)findViewById(R.id.salida);
    }

    public void sePulsa(View view){
        salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString().isEmpty() ? "0" : entrada.getText().toString()) *2.0));
    }

    public void sePulsa0(View view){
        entrada.setText(entrada.getText() + (String)view.getTag());
    }
}
