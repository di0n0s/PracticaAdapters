package netmind.com.practicaadapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A5Alumno on 11/29/2016.
 */

public class MainActivityRecyclerView extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_layout);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMain);

        String[]mListValues={"Android","iPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","MaxOSX","Linux","OS/2","Ubuntu","Windows7","MaxOSX","Linux","OS/2","Ubuntu","Windows7","MaxOSX","Linux","OS/2","Android","iPhone","WindowsMobile"};

        List<Item> listItem = new ArrayList<>();
        for(int idx = 0; idx<mListValues.length; idx++){
            listItem.add(new Item("@mipmap/ic_launcher", mListValues[idx], ""));
        }

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new MyListAdapterRecycle(this, listItem));
    }
}
