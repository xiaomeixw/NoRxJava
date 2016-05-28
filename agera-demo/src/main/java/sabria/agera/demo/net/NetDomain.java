package sabria.agera.demo.net;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by xiong,An android project Engineer,on 28/5/2016.
 * Data:28/5/2016  下午 01:21
 * Base on clever-m.com(JAVA Service)
 * Describe: https://api.github.com/
 * Version:1.0
 * Open source
 */
public class NetDomain implements Parcelable {

       private String current_user_url;

    private String current_user_authorizations_html_url;

    private String code_search_url;

    public NetDomain(String current_user_url, String current_user_authorizations_html_url, String code_search_url) {
        this.code_search_url=code_search_url;
        this.current_user_authorizations_html_url=current_user_authorizations_html_url;
        this.current_user_url=current_user_url;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.current_user_url);
        dest.writeString(this.current_user_authorizations_html_url);
        dest.writeString(this.code_search_url);
    }

    public NetDomain() {
    }

    protected NetDomain(Parcel in) {
        this.current_user_url = in.readString();
        this.current_user_authorizations_html_url = in.readString();
        this.code_search_url = in.readString();
    }

    public static final Parcelable.Creator<NetDomain> CREATOR = new Parcelable.Creator<NetDomain>() {
        @Override
        public NetDomain createFromParcel(Parcel source) {
            return new NetDomain(source);
        }

        @Override
        public NetDomain[] newArray(int size) {
            return new NetDomain[size];
        }
    };


    @Override
    public String toString() {
        return "NetDomain{" +
                "current_user_url='" + current_user_url + '\'' +
                ", current_user_authorizations_html_url='" + current_user_authorizations_html_url + '\'' +
                ", code_search_url='" + code_search_url + '\'' +
                '}';
    }
}
