package netmind.com.practicaadapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by A5Alumno on 11/29/2016.
 */

public class MyListAdapter extends ArrayAdapter<Item> {

    private Context mContext;
    private List<Item> itemList;

    public MyListAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_view_custom_layout, null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.img_view_custom_row_layout);

        TextView txtTittle = (TextView) convertView.findViewById(R.id.tv_title_custom_row_layout);
        txtTittle.setText(this.itemList.get(position).getmTitle());

        TextView txtBody = (TextView) convertView.findViewById(R.id.tv_body_custom_row_layou);

        return convertView;
    }
}
