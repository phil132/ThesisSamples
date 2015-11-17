package philthesis.thesissamples;

import android.content.Context;
import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 17.11.2015.
 *
 * Adapter for WearableListView. Instantiating the Views
 *
 */
public class Adapter extends WearableListView.Adapter {
    private LayoutInflater mInflater;
    private String[] mItems;

    public Adapter(Context context, String[] Items) {
        mInflater = LayoutInflater.from(context);
        mItems = Items;
    }

    //Amy Time a WearableListView needs to create a new view
    @Override
    public WearableListView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        return new WearableListView.ViewHolder(view);
    }

    //called when scrolling changes position. Load data to position.
    @Override
    public void onBindViewHolder(WearableListView.ViewHolder holder, int position) {
        TextView textView = (TextView) holder.itemView;
        textView.setText(mItems[position]);
    }

    // Return the size of your dataset
    @Override
    public int getItemCount() {
        return mItems.length;
    }
}

