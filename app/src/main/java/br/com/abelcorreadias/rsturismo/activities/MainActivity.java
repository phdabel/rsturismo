package br.com.abelcorreadias.rsturismo.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.adapters.TourFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        /** @TODO modificar o adaptador pra incluir os fragmentos na inicializacao */
        TourFragmentPagerAdapter adapter = new TourFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
