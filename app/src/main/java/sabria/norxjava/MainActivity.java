package sabria.norxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.StaticLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import rx.Observable;
import rx.Observer;

public class MainActivity extends AppCompatActivity {

    private final static String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rxFunder1();
    }

    private void rxFunder1() {

        //1.创建被观察者
        //send three times
        Observable<String> observable = Observable.just("Hello", "RxJava", "go...go...go!");

        //2.创建观察者
        Observer<String> observer = new Observer<String>() {

            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError");
            }

            /**
             * onNext will call three times!
             * @param o
             */
            @Override
            public void onNext(String o) {
                /**
                 *  12-11 18:54:45.829  14880-14880/sabria.demo.rxjava D/MainActivity﹕ onNextHello
                 *  12-11 18:54:45.829  14880-14880/sabria.demo.rxjava D/MainActivity﹕ onNextRxJava
                 *  12-11 18:54:45.829  14880-14880/sabria.demo.rxjava D/MainActivity﹕ onNextgo...go...go!
                 *  12-11 18:54:45.829  14880-14880/sabria.demo.rxjava D/MainActivity﹕ onCompleted
                 */
                Log.d(TAG, "onNext"+o);
            }
        };

        //3.注册被观察者
        observable.subscribe(observer);

    }


}
