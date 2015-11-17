package philthesis.thesissamples;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WearableListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private String[] mItems;
    private WearableListView mWearableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        mItems = new String[]{"item0", "item1", "item2", "item3", "item4"};
        mWearableListView = (WearableListView) findViewById(R.id.wearable_list);
        mWearableListView.setAdapter(new Adapter(this, mItems));
        mWearableListView.setClickListener(mClickListener);
    }

    private WearableListView.ClickListener mClickListener = new WearableListView.ClickListener() {
        @Override
        public void onClick(WearableListView.ViewHolder viewHolder) {
            int position = viewHolder.getLayoutPosition();
            Toast.makeText(MainActivity.this, "Tapped on item " + position, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onTopEmptyRegionClick() {
            Toast.makeText(MainActivity.this, "Tapped on top empty region", Toast.LENGTH_SHORT).show();
        }
    };
}
