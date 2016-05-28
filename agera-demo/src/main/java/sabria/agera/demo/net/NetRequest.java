package sabria.agera.demo.net;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by xiong,An android project Engineer,on 28/5/2016.
 * Data:28/5/2016  下午 01:23
 * Base on clever-m.com(JAVA Service)
 * Describe:
 * Version:1.0
 * Open source
 */
public class NetRequest {

    private static final String URL="https://api.github.com/";

    private OkHttpClient mClient;
    private NetCallback mNetCallback;
    private Request mRequest;


    public NetRequest(NetCallback netCallback){
        super();
        this.mNetCallback=netCallback;
        this.mClient=new OkHttpClient();
        this.mRequest=new Request.Builder().url(URL).build();

    }

    /**
     * OKHTTP CALL
     */
    public void run(){
        Log.e("NetRequest","run");
        mClient.newCall(mRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                mNetCallback.setError();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    JSONObject jsonObject = new JSONObject(response.body().string());
                    String current_user_url=jsonObject.getString("current_user_url");
                    String current_user_authorizations_html_url=jsonObject.getString("current_user_authorizations_html_url");
                    String code_search_url=jsonObject.getString("code_search_url");
                    NetDomain netDomain = new NetDomain(current_user_url, current_user_authorizations_html_url, code_search_url);
                    mNetCallback.setFruits(netDomain);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public interface NetCallback{
        void setError();
        void setFruits(NetDomain domain );
    }



}
