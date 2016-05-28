package sabria.agera.demo.net;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.agera.Updatable;

import sabria.agera.demo.R;

/**
 * Created by xiong,An android project Engineer,on 28/5/2016.
 * Data:28/5/2016  下午 01:10
 * Base on clever-m.com(JAVA Service)
 * Describe:
 * Version:1.0
 * Open source
 */
public class NetActivity extends Activity implements View.OnClickListener, Updatable {

    Button mDataBtn;
    TextView mContentTv;
    NetRepository netRepository;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net);
        netRepository = new NetRepository();
        mDataBtn = (Button) findViewById(R.id.btn_data);
        mContentTv = (TextView) findViewById(R.id.tv_content);
        mDataBtn.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        netRepository.addUpdatable(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        netRepository.removeUpdatable(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_data:
                getData();
                break;
        }
    }

    private void getData() {
        netRepository.update();
    }

    @Override
    public void update() {
        if(netRepository.get()!=null){
            NetDomain netDomain = netRepository.get();
            mContentTv.setText(netDomain.toString());
        }

    }
}
