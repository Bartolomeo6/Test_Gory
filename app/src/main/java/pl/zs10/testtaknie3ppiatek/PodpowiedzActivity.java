package pl.zs10.testtaknie3ppiatek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PodpowiedzActivity extends AppCompatActivity {

    private TextView textViewNaglowek;
    private TextView textViewPodpowiedz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);

        int nrPyt = getIntent().getIntExtra("NR",0);
        textViewNaglowek = findViewById(R.id.textView2TrescPytaniaPodpowiedz);
        textViewPodpowiedz = findViewById(R.id.textView5Podpowiedz);

        Pytanie pytanieAktualne = RepozytoriumPytania.utworzPytania().get(nrPyt);
        textViewNaglowek.setText("Podpowiedz do pytania: \n "+pytanieAktualne.getTrescPytania());
        textViewPodpowiedz.setText(pytanieAktualne.getPodpowiedz());
    }
}