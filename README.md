# NoRxJava : Everything about Rxjava
Thinking like a Rxjava library creator,Why we need use RxJava...I will tell you everything about Rxjava:RxJava Study Resources(Part1)、Rxjava Usage(Part2) and Interpretation of Rxjava Source Code(Part3)...


## Part1 RxJava Study Resources:

### Article

1.[RxJavaEssentials](https://www.packtpub.com/application-development/rxjava-essentials):Learn reactive programming to create awesome Android and Java apps.(translator[yuxingxin](http://yuxingxin.com/2016/01/08/RxJavaEssentials/),authorize[From .NET To RxJava](http://www.devtf.cn/?p=1221))

2.[RxJava Essentials CN](https://www.gitbook.com/book/yuxingxin/rxjava-essentials-cn/) && [RxJavaEssentials.pdf](http://vdisk.weibo.com/s/CeH3i0tfvZMVq) && [Learning Reactive Programming](http://vdisk.weibo.com/s/CeH3i0tfvZMfT)

3.[Grokking RxJava, Part 1: The Basics](http://blog.danlew.net/2014/09/15/grokking-rxjava-part-1/):RxJava is the new hotness amongst Android developers these days. The only problem is that it can be difficult to approach initially. Functional Reactive Programming is hard when you come from an imperative world, but once you understand it, it's so awesome!I'm here to try to give you a flavor of RxJava. The goal of this three four-part series is to get your foot in the door. I'm not going to try to explain everything (nor could I). I just want you to become interested in RxJava and how it works.(Chinese translation:[深入浅出RxJava（一：基础篇）](http://blog.csdn.net/lzyzsd/article/details/41833541))

4.[给 Android 开发者的 RxJava 详解](http://gank.io/post/560e15be2dca930e00da1083):Introduce Rxjava To Chinese Android developer.

5.[RxAndroid And Kotlin (Part 1)](https://medium.com/@ahmedrizwan/rxandroid-and-kotlin-part-1-f0382dc26ed8):I started with RxAndroid about a week ago. At first, I didn’t really get it… I mean, I grasped the concept but I didn’t understand where I should be using it. But then after going through a few examples and a few really good articles (links at the end)… I just got it! 

6.[REPLACE ASYNCTASK AND ASYNCTASKLOADER WITH RX.OBSERVABLE – RXJAVA ANDROID PATTERNS](http://blog.stablekernel.com/replace-asynctask-asynctaskloader-rx-observable-rxjava-android-patterns/):I'd like to explore some patterns that have emerged as I've worked on various projects that rely on RxJava as the primary backbone of the architecture.There are plenty of “Getting Started” type posts talking about RxJava, some of which are in the context of Android. But at this point, I imagine there are people out there who like what they hear so far but aren't really sure how or why to to use it when solving concrete problems in their Android projects.(Chinese translation:[用RxJava.Observable取代AsyncTask和AsyncTaskLoader-RxJava Android模版](http://blog.csdn.net/zhaokaiqiang1992/article/details/44751003))

7.[When the Avengers meet Dagger2, RxJava and Retrofit in a clean way](http://saulmm.github.io/when-Thor-and-Hulk-meet-dagger2-rxjava-1/):Recently, a lot articles, frameworks, and talks at the android community, are appearing talking about testing and software architecture, as said in the last Droidcon Spain, we are focusing on how to do robust applications instead on how to develop specific features. That denotes that the Android framework and the current Android commnunity is reaching some level of maturity.(Chinese translation:[当复仇者联盟遇上Dragger2、RxJava和Retrofit的巧妙结合](http://www.devtf.cn/?p=565))

8.[Architecting Android with RxJava](http://www.jianshu.com/p/943ceaccfdff)

9.[ Don't break the chain: use RxJava's compose() operator](http://blog.danlew.net/2015/03/02/dont-break-the-chain/):What if you have a set of operators that you want to reuse for multiple streams? For example, I frequently use subscribeOn() and observeOn() because I want to process data in a worker thread then subscribe to it on the main thread. It'd be great if I could apply this logic to all my streams in a consistent, reusable manner.(Chinese translation:[避免打断链式结构：使用.compose( )操作符](http://www.jianshu.com/p/e9e03194199e))

10.[Error handling in RxJava](http://blog.danlew.net/2015/12/08/error-handling-in-rxjava/):xJava makes error handling a snap. Just use onError, right?That's fine and dandy if you're the subscriber, but what about exceptions that occur inside your operators? How do you ensure that an Exception in, say, flatMap() gets passed along to onError? And what if you don't want the exception to terminate the sequence?

11.[How to upgrade to RxAndroid 1.0](http://blog.danlew.net/2015/09/01/how-to-upgrade-to-rxandroid-10/):A number of people have asked me recently, "What the hell happened to RxAndroid?"The fact of the matter is, RxAndroid was getting to be a bit of a mess and thus has been majorly refactored. You can read more about it here, but essentially:I am proposing a from-scratch, modularization of the library into re-usable and composeable modules.That has been accomplished, but if you upgrade now you're probably wondering: where did everything go and how can I get my code compiling again?

12.[Deferring Observable code until subscription in RxJava](http://blog.danlew.net/2015/07/23/deferring-observable-code-until-subscription-in-rxjava/):I've grown fond of RxJava's defer() as a tool for ensuring Observable code runs when subscribed (rather than when created). I've written about defer() before but I'd like to go into more detail here.





http://www.jianshu.com/p/e79f306e12f1
https://github.com/kaushikgopal/RxJava-Android-Samples
http://www.jianshu.com/p/b283b5b704e5
https://github.com/dlew/rxjava-multiple-sources-sample
https://github.com/marcoRS/rxjava-essentials/blob/master/app/src/main/java/com/packtpub/apps/rxjava_essentials/example1/Fi
rstExampleFragment.java
https://github.com/evant/rxloader
https://github.com/AndroidKnife/RxBus
https://github.com/ReactiveX/RxJavaAsyncUtil
https://github.com/pwittchen/prefser
https://github.com/ffgiraldez/rx-mvvm-android







