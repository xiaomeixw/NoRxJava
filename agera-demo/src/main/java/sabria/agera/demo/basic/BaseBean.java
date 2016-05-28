package sabria.agera.demo.basic;

import com.google.android.agera.BaseObservable;
import com.google.android.agera.UpdateDispatcher;

/**
 * Created by xiong,An android project Engineer,on 28/5/2016.
 * Data:28/5/2016  下午 12:03
 * Base on clever-m.com(JAVA Service)
 * Describe:
 * Version:1.0
 * Open source
 */
public class BaseBean extends BaseObservable{


    private String content = "";

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        update();
    }

    private void update() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                content += " after other thread";
                dispatchUpdate();
            }
        }).start();
    }


}
