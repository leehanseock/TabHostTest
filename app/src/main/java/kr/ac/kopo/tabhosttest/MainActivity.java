package kr.ac.kopo.tabhosttest;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpecMusic = tabHost.newTabSpec("tab1").setIndicator("Music");
        tabSpecMusic.setContent(R.id.linear_music);
        tabHost.addTab(tabSpecMusic);

        TabHost.TabSpec tabSpecSinger = tabHost.newTabSpec("tab2").setIndicator("Singer");
        tabSpecSinger.setContent(R.id.linear_singer);
        tabHost.addTab(tabSpecSinger);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("tab3").setIndicator("Album");
        tabSpecAlbum.setContent(R.id.linear_album);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(1);
    }
}