package sabria.agera.demo.net;

import android.support.annotation.NonNull;

import com.google.android.agera.BaseObservable;
import com.google.android.agera.Supplier;
import com.google.android.agera.Updatable;

/**
 * Created by xiong,An android project Engineer,on 28/5/2016.
 * Data:28/5/2016  下午 01:35
 * Base on clever-m.com(JAVA Service)
 * Describe:
 * Version:1.0
 * Open source
 */
public class NetRepository extends BaseObservable implements Supplier<NetDomain>,Updatable,NetRequest.NetCallback{

    private NetDomain domain;

    @Override
    public NetDomain get(){
        return domain;
    }

    @Override
    public void setError() {
        dispatchUpdate();
    }

    @Override
    public void setDomain(NetDomain domain) {
        this.domain=domain;
        dispatchUpdate();
    }
    

    @Override
    public void update() {
        NetRequest netRequest = new NetRequest(this);
        netRequest.run();
    }

    @Override
    protected void observableActivated() {
        super.observableActivated();
        update();
    }
}
