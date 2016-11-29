package netmind.com.practicaadapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A5Alumno on 11/29/2016.
 */

public class MyListAdapterRecycle extends RecyclerView.Adapter<MyListAdapterRecycle.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImgView;
        public TextView mTextTitle;
        public TextView mTextBody;

        public ViewHolder(View itemView) {
            super(itemView);

            this.mImgView = (ImageView) itemView.findViewById(R.id.img_view_custom_row_layout);
            this.mTextTitle = (TextView) itemView.findViewById(R.id.tv_title_custom_row_layout);
            this.mTextBody = (TextView) itemView.findViewById(R.id.tv_body_custom_row_layou);

        }
    }

    Context mContext;
    List<Item> mItemList;

    public MyListAdapterRecycle(Context context, List<Item> listItem) {
        this.mContext = context;
        this.mItemList = listItem;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewRow = LayoutInflater.from(this.mContext).inflate(R.layout.list_view_custom_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(viewRow);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //holder.mImgView.setImageResource();


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
