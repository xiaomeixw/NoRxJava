package sabria.agera.demo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.agera.Updatable;

public class MainActivity extends Activity implements TextWatcher, Updatable {

    TextView mChangeTv;
    EditText mInputEt;
    BaseBean baseBean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseBean = new BaseBean();

        mChangeTv = (TextView) findViewById(R.id.tv_change);
        mInputEt = (EditText) findViewById(R.id.et_input);
        mInputEt.addTextChangedListener(this);

    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (baseBean != null){
            baseBean.setContent(s.toString());
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }


    @Override
    protected void onResume() {
        super.onResume();
        baseBean.addUpdatable(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        baseBean.removeUpdatable(this);
    }

    @Override
    public void update() {
        mChangeTv.setText(baseBean.getContent());
    }
}
