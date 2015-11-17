package recyclerviewsample.com.example.kazuhiro.recyclerviewsample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("RecyclerAdapter Sample");

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        final List<Profile> list = new ArrayList<Profile>();

        Profile[] profileList = new Profile[3];
        profileList[0] = new Profile("夢眠 ねむ",
                "https://itnail.b.sakurastorage.jp/production/item_images/images/000/065/237/medium/450f3bd6-4d6a-4d8f-8f98-661e21f527b9.jpg",
                "キャッチフレーズ：永遠の魔法少女未満\n" +
                        "\n" +
                        "雑誌モデルや「DJねむきゅん」としても活躍するアキバと世界を繋ぐサブカル系アイドル。特技はDJ！\n" +
                        "\n" +
                        "ニックネーム：ねむきゅん\n" +
                        "テーマカラー：ミントグリーン\n" +
                        "ヲタクジャンル：ヲタク研究\n");

        profileList[1] = new Profile("藤崎彩音", "http://moejapan.jp/dempagumi/img/profile/fujisakiayane.jpg", "157cm　12月7日生まれ\n" +
                "\n" +
                "キャッチフレーズ：踊ってみたら七変化！\n" +
                "\n" +
                "両親の影響で1歳からコスプレイヤーとしてのキャリアをスタート。また「ピンキー！」\n" +
                "名義でニコニコ動画に投稿する踊り手としても活躍している。\n" +
                "\n" +
                "ニックネーム：ピンキー！\n" +
                "テーマカラー：ブルー\n" +
                "ヲタクジャンル：コスプレ");

        profileList[2] = new Profile("最上もが", "http://pbs.twimg.com/media/A9-4gEXCMAAcRLc.jpg", "162cm 2月25日生まれ A型 東京都出身\n" +
                "\n" +
                "キャッチフレーズ：金色の異端児\n" +
                "\n" +
                "ファッション雑誌のモデルやグラビア、テレビドラマや映画に出演するなど、活動の幅は\n" +
                "多岐に渡る。アイドル界の異端児的存在。\n" +
                "\n" +
                "ニックネーム：もがちゃん\n" +
                "テーマカラー：紫\n" +
                "ヲタクジャンル：ネットゲーム");


        for (int i = 0; i < profileList.length ; i++ ) {
            list.add(profileList[i]);
        }
        recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(), list));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
