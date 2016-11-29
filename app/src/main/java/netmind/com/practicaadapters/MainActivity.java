package netmind.com.practicaadapters;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    String[]mListValues={"Android","iPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","MaxOSX","Linux","OS/2","Ubuntu","Windows7","MaxOSX","Linux","OS/2","Ubuntu","Windows7","MaxOSX","Linux","OS/2","Android","iPhone","WindowsMobile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) this.findViewById(R.id.listViewMain);
            listView.setOnItemClickListener(this);
            listView.setOnItemLongClickListener(this);

        //listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mListValues));



        List<Item> listItem = new ArrayList<>();
        for(int idx = 0; idx<mListValues.length; idx++){
            listItem.add(new Item("@mipmap/ic_launcher", mListValues[idx], ""));
        }



        listView.setAdapter(new MyListAdapter(this, 0, listItem));



    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Element " + position + ", with ID = " + id, Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        return false;
    }

}
