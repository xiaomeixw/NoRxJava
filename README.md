# NoRxJava : Everything about Rxjava
Thinking like a Rxjava library creator,Why we need use RxJava...I will tell you everything about Rxjava:RxJava Study Resources(Part1)、Rxjava Usage(Part2) and Interpretation of Rxjava Source Code(Part3)...

![](http://i.imgur.com/IeJeTuo.png)

Where to find RxJava:

- RxJava1.x: [https://github.com/ReactiveX/RxJava](https://github.com/ReactiveX/RxJava)
- RxJava2.0: [https://github.com/ReactiveX/RxJava/tree/2.x](https://github.com/ReactiveX/RxJava/tree/2.x)
- RxAndroid: [https://github.com/ReactiveX/RxAndroid](https://github.com/ReactiveX/RxAndroid)
- Retrolambda: [https://github.com/orfjackal/retrolambda](https://github.com/orfjackal/retrolambda)
- RxBinding: [https://github.com/JakeWharton/RxBinding](https://github.com/JakeWharton/RxBinding)
- RxJavaFX: [https://github.com/ReactiveX/RxJavaFX](https://github.com/ReactiveX/RxJavaFX)
- RxNetty: [https://github.com/ReactiveX/RxNetty](https://github.com/ReactiveX/RxNetty)
- RxKotlin: [https://github.com/ReactiveX/RxKotlin](https://github.com/ReactiveX/RxKotlin)
- RxJavaAsyncUtil: [https://github.com/ReactiveX/RxJavaAsyncUtil](https://github.com/ReactiveX/RxJavaAsyncUtil)
- RxJavaDebug: [https://github.com/ReactiveX/RxJavaDebug](https://github.com/ReactiveX/RxJavaDebug)
- RxApacheHttp: [https://github.com/ReactiveX/RxApacheHttp](https://github.com/ReactiveX/RxApacheHttp)
- RxJavaString: [https://github.com/ReactiveX/RxJavaString](https://github.com/ReactiveX/RxJavaString)
- RxJavaFileUtils: [https://github.com/ReactiveX/RxJavaFileUtils](https://github.com/ReactiveX/RxJavaFileUtils)
- RxJavaMath: [https://github.com/ReactiveX/RxJavaMath](https://github.com/ReactiveX/RxJavaMath)
- RxCpp: [https://github.com/ReactiveX/RxCpp](https://github.com/ReactiveX/RxCpp)
- RxPHP: [https://github.com/ReactiveX/RxPHP](https://github.com/ReactiveX/RxPHP)
- RxGo: [https://github.com/ReactiveX/RxGo](https://github.com/ReactiveX/RxGo)
- RxRuby: [https://github.com/ReactiveX/RxRuby](https://github.com/ReactiveX/RxRuby)

#### Version 2.x

Version 2.x and 1.x will live side-by-side for several years. They will have different namespaces (io.reactivex vs rx). 

The purpose for 2.x is:

- leverage Java 8+ features
- [Reactive Streams](http://www.reactive-streams.org) compatibility
- performance gains through design changes learned through the 1.x cycle

#### Version 1.x

- Zero Dependencies
- < 800KB Jar
- Java 6+ & [Android](https://github.com/ReactiveX/RxAndroid) 2.3+
- Java 8 lambda support
- Polyglot ([Scala](https://github.com/ReactiveX/RxScala), [Groovy](https://github.com/ReactiveX/RxGroovy), [Clojure](https://github.com/ReactiveX/RxClojure) and [Kotlin](https://github.com/ReactiveX/RxKotlin))
- Non-opinionated about source of concurrency (threads, pools, event loops, fibers, actors, etc)
- Async or synchronous execution
- Virtual time and schedulers for parameterized concurrency

Learn more about RxJava on the <a href="https://github.com/ReactiveX/RxJava/wiki">Wiki Home</a>.



![](https://raw.githubusercontent.com/google/agera/master/doc/images/agera.png)

Where to find Google's Reactive Programming for Android:

- Agera: [https://github.com/google/agera](https://github.com/google/agera)

## Part1 RxJava Study Resources:

### 1-1 Article

1.[RxJavaEssentials](https://www.packtpub.com/application-development/rxjava-essentials):Learn reactive programming to create awesome Android and Java apps.(translator[yuxingxin](http://yuxingxin.com/2016/01/08/RxJavaEssentials/),authorize[From .NET To RxJava](http://www.devtf.cn/?p=1221))

2.[RxJava Essentials CN](https://www.gitbook.com/book/yuxingxin/rxjava-essentials-cn/) && [RxJavaEssentials.pdf](http://vdisk.weibo.com/s/CeH3i0tfvZMVq) && [Learning Reactive Programming](http://vdisk.weibo.com/s/CeH3i0tfvZMfT) && [RxJava for Android App Development](http://www.oreilly.com/programming/free/rxjava-for-android-app-development.csp)

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

13.[Loading data from multiple sources with RxJava](http://blog.danlew.net/2015/06/22/loading-data-from-multiple-sources-with-rxjava/):Suppose I have some Data that I query from the network. I could simply hit the network each time I need the data, but caching the data on disk and in memory would be much more efficient.(Chinese translation:[使用RxJava从多个数据源获取数据](http://www.jianshu.com/p/be084df924dc))

14.[Grokking RxJava, Part 2: Operator, Operator](http://blog.danlew.net/2014/09/22/grokking-rxjava-part-2/):In part 1 I went over the basic structure of RxJava, as well as introducing you to the map() operator. However, I can understand if you're still not compelled to use RxJava - you don't have much to work with yet. But that will change quickly - a big part of the power of RxJava is in all of the operators included in the framework.Let's go through an example to introduce you to more operators.(Chinese translation:[深入浅出RxJava(二：操作符)](http://blog.csdn.net/lzyzsd/article/details/44094895))

15.[Grokking RxJava, Part 3: Reactive with Benefits](http://blog.danlew.net/2014/09/30/grokking-rxjava-part-3/):In part 1, I went over the basic structure of RxJava. In part 2, I showed you how powerful operators could be. But maybe you're still not sold; there isn't quite enough there yet to convince you. Here's some of the other benefits that come along with the RxJava framework which should seal the deal.(Chinese translation:[深入浅出RxJava三--响应式的好处](http://blog.csdn.net/lzyzsd/article/details/44891933))

16.[Grokking RxJava, Part 4: Reactive Android](http://blog.danlew.net/2014/10/08/grokking-rxjava-part-4/):In parts 1, 2, and 3 I covered how RxJava works (in a general sense). But as an Android developer, how do you make it work for you? Here is some practical information for Android developers.RxAndroid is an extension to RxJava built just for Android. It includes special bindings that will make your life easier.(Chinese translation:[深入浅出RxJava四-在Android中使用响应式编程](http://blog.csdn.net/lzyzsd/article/details/45033611))

17.[Using RxJava with Android](http://andraskindler.com/blog/2013/using-rxjava-in-android/):This post is the first in a series about RxJava and Android. This tutorial will show you how to build a REST API client in Android with RxJava observables (and based on Square’s Retrofit).If you’re into Android (and Java) development, there is a good chance you’ve already heard about RxJava, which is a Java implementation of Reactive Extensions developed by Netflix. Reactive Extensions is a library to compose asynchronous and event-based programs using observable collections and LINQ-style query operators, quoted from the corresponding MSDN site. Netflix made the library available for the public on Github, supporting Java 6 or newer, making it available to use with Android apps as well.(Chinese translation:[在安卓上使用RxJava](http://www.importnew.com/8321.html))

18.[First RxJava](http://codethink.me/2015/05/09/intro-of-rxjava/)

19.[RxJava Observable tranformation: concatMap() vs flatMap()](http://fernandocejas.com/2015/01/11/rxjava-observable-tranformation-concatmap-vs-flatmap/):After a while I decided that was time to get back for some writing. As you may know at @SoundCloud we do a strong use of the reactive approach, but to be honest, I am not here to talk about RxJava itself because there are great articles out there to read about it (here and here) and great people to follow as well such as Ben Christesen, Matthias Käppler and many others.I also consider myself a ‘newbie’ in reactive programming and now I am at that stage where you start seeing the benefits of this approach and want to make every single object reactive, which is very dangerous, so if you are in the same level as me, just keep an eye on it, and use it wherever makes sense, you are advised.(Chinese translation:[RxJava变换操作符：.concatMap( )与.flatMap( )的比较](http://www.jianshu.com/p/6d16805537ef))

20.[Debugging RxJava on Android](http://fernandocejas.com/2015/11/05/debugging-rxjava-on-android/):Debugging is the process of finding and resolving bugs or defects that prevent correct operation of computer software (Wikipedia).Nowadays debugging is not an easy task, specially with all the complexity around current systems: Android is not an exception to this rule and since we are dealing with asynchronous executions, that becomes way harder.As you might know, at @SoundCloud, we are heavily using RxJava as one of our core components for Android Development, so in this article I am gonna walk you through the way we debug Rx Observables and Subscribers.

21.[Observe on the correct thread](https://medium.com/@diolor/observe-in-the-correct-thread-1939bb9bb9d2#.7j22t2xa0):Although people understand the logic of RxJava there is still a lot of confusion in which thread you should run the observable’s chain and its operators.First of all let’s clear out what’s the difference between .subsribeOn() and .observeOn() in RxJava.(Chinese translation:[在正确的线程上观察](http://www.jianshu.com/p/72911b9ba2d7))

22.[Improving UX with RxJava](https://medium.com/@diolor/improving-ux-with-rxjava-4440a13b157f#.6vcvc4ss4):In a perfect mobile world users would never lose connectivity, servers will never return errors and bacon would have been low fat.Building a great app experience is usually a bliss for a user but pain for the developer. Gone are the days that a user clicks a button, the UI gets blocked and you wait for a backend response. It’s just frustrating.(Chinese translation:[使用RxJava 提升用户体验](http://www.jianshu.com/p/33c548bce571)).Demo：https://github.com/hanks-zyh/RxSerach.

23.[Party tricks with RxJava, RxAndroid & Retrolambda](https://medium.com/swlh/party-tricks-with-rxjava-rxandroid-retrolambda-1b06ed7cd29c#.fqvylwt6l):“Users expect real time data. They want their tweets now. Their order confirmed now”. As a developer, you demand fire-and-forget messaging. You really don’t want to be blocked waiting for a result… You want to have the result pushed to you when it is ready, whenever that is. Even better, when working with big result sets, you want to receive individual results as they are ready because you don’t want to wait for the entire set to be processed before you see the first item on that list. Developers have lots of tools to push data, that’s easy. Developers need tools to react to pushed data.

24.[Android Application Architecture](https://medium.com/ribot-labs/android-application-architecture-8b6e34acda65?source=false---------3):Our journey from standard Activities and AsyncTasks to a modern MVP-based architecture powered by RxJava.(Chinese translation:[Android应用架构](http://www.jianshu.com/p/8ca27934c6e6)).

25.[Unit Testing RxJava Observables](https://medium.com/ribot-labs/unit-testing-rxjava-6e9540d4a329#.a3d6yribm):RxJava is a great library, but it’s not easy to get started. Here we outline different approaches to unit test Observables.

26.[Why should we use RxJava on Android](https://medium.com/@lpereira/why-should-we-use-rxjava-on-android-c9066087c56c?source=false---------5):Reactive Extensions (Rx) are a set of interfaces and methods which provide a way to developers solve problems rapidly, simply to maintain, and easy to understand. RxJava provides just that, a set of tools to help you write clean and simpler code.To be honest with you, at first I thought RxJava was just way to difficult to understand and the ideia to add a library just to use these new tools was very troubling for me. After awhile, I understood that I was struggling by doing the same boilerplate implementation over and over again to keep the user updated on what is going on the application.

27.[RX Java and Recursion](https://medium.com/@stevenlow1983/rx-java-and-recursion-719f8ee1977a#.hs9i55gqp):Recently I had what seemed like a tricky problem. I was using akka and wanted to make an http call within the method handling a message. When the http call completed, I wanted the actor to send a message back to the original sender actor. As I was using akka I needed to make the http call asynchronously so as not to block the thread. Seems straight forward enough if I use something like ReactiveX. I can use an async http client and convert a future into an observable. I can then subscribe to that observable, handle the http response, and send a message back to the sender. All lovely and non-blocking.

28.[Android app development using the reactive programming paradigm (RxJava)](https://medium.com/@arifnadeem7/step-by-step-android-app-development-using-the-reactive-programming-paradigm-rxjava-aa1c63a66650#.l8gryaqgt):If you have already looked into the likes of RxJava and other ReactiveX libraries; you are likely to agree when I say that reactive programming has a steep learning curve, this learning experience is further impeded by the fact that there aren’t many good tutorials or books on this concept.

29.[A simple event bus with RxJava](https://medium.com/@seventyone/a-simple-event-bus-with-rxjava-46cc1858df23#.ie2d6g2xp):Often I’m trying to avoid additional dependencies, especially if I only a need a fraction of the functionality provided by it. Every dependency makes you… well… dependent on the library and its future development, which you can’t always have influence on. Or the project will be abandoned completely and you start hacking around the source to make it work, because replacing it completely would be really time consuming and challenging. After reading this article I decided to roll my own!

30.[RxJAVA, Part 1 : 기초](https://medium.com/@LIP/rxjava-29cfb3ceb4ca#.tdfbxa71j):안드로이드 개발자들에게서 RxJava가 새로 부상하고 있다. RxJava의 유일한 문제는 진입장벽이 높다는 것이다. 만일 당신이 명령형 프로그래밍의 세상에서 왔다면 함수적 반응 프로그래밍(Functional Reactive Programming)은 어려울 것이다. 하지만 단 한 번만 이해한다면 이것이 최고임을 알 게 될 것이다.여기서는 RxJava의 맛만을 보여주려고 한다. 이 연재의 목표는 문에 발을 딛게 하는 것이다. 모든 것을 설명하려고 하지 않을 것이다(그렇게 할 수도 없다.). 나는 그저 당신이 RxJava와 그 동작에 대해 관심을 가지게 하고 싶을 뿐이다.

31.[RxJava: Unit Testing Examples](https://medium.com/mobile-engineering/rxjava-unit-testing-examples-a26af80dfce4#.qbkpza8ps):After my initial foray, I wondered about unit testing RxJava. So here are a couple of examples.Lets say you have queried an API and have a model which contains an array of country names. A requirement is that the UI does not show any name which is mythical, “Atlantis” for example.

32.[Introducing Yahnac: Where RxJava Meets Firebase and Content Providers](https://medium.com/google-developer-experts/introducing-yahnac-where-rxjava-meets-firebase-and-content-providers-49c424f51487#.8gyiqvyw9):What’s Yahnac you might ask? Yet another Hacker News client, because there are never enough Hacker News clients out there!For those who don’t know, Hacker News is a social news website focusing on computer science and entrepreneurship and it is run by the startup incubator Y Combinator. In general, content that can be submitted is defined as “anything that gratifies one’s intellectual curiosity”.

33.[RxJava: Android MVVM App structure with Retrofit](https://medium.com/@manuelvicnt/rxjava-android-mvvm-app-structure-with-retrofit-a5605fa32c00#.8854d5nz2):Creating an App structure for Android which is easy to maintain and debug is not always easy. The more Network communications and interaction between Views the app contains, the more difficult it will be.One of the things I really appreciate about a good structure is when you have a defect in your app and you know exactly where to go to fix it.

34.[Easily test your one-off async operations on Android with Dagger2 and RxJava](https://medium.com/@ZakTaccardi/easily-test-your-one-off-async-operations-on-android-with-dagger2-eb77c6221901#.snxyce41i):This demo application utilizes RxJava, Dagger2, and JUnit. Explaining these libraries is out of scope for this article, but the internet has plenty of content on those topics, so check them out before continuing on. This also assumes you are familiar with the basics of JUnit testing.

35.[RxJava Wiki — Introduction](https://medium.com/@LIP/rxjava-wiki-home-6f6bbc1f40fc#.age5zpk4c):RxJava는 Reactive Extensions의 Java VM 버전 구현이다. Observable sequences를 이용하여 비동기 프로그램과 이벤트-기반 프로그램을 구성하기 위한 라이브러리이다.선언적으로 모든 것이 연속되어 일어나게 조립할 수 있도록 해주는 operator들을 추가하고 데이터/이벤트 sequences를 지원하기 위해 옵저버 패턴을 확장하였다. 그러면서 추상화를 통해 low-level threading, synchronization, thread-safety, concurrent data structures, and non-blocking I/O같은 것들에 대한 걱정은 하지 않도록 하였다.RxJava는 Groovy, Clojure, JRuby, Kotlin 그리고 Scala같은 Java 6 또는 그 이상의 JVM-기반 언어를 지원한다.

36.[Simple way to test asynchronous actions in Android: Service, AsyncTask, Thread, RxJava etc.](https://medium.com/@v.danylo/simple-way-to-test-asynchronous-actions-in-android-service-asynctask-thread-rxjava-etc-d43b0402e005#.v3vjgny9u):Sometimes testing asynchronous actions might be very difficult but in most common cases during Android development it might be done with a very simple technique.If you know basics of concurrency you can test asynchronous operations with a simple wait/notify.

37.[RxJava 短期效用](https://medium.com/cowbear-coder/rxjava-feed-of-rxjava-and-android-1daae2059847#.tvel4ildr):一個 FRP 的實現，透過 FRP(Functional Reactive Programming) 概念。短期效用：有效避免巢狀 callback 增加可讀性以及減少 List<item> 的轉換成本。

38.[Legal from State to State](https://medium.com/@justinpollard/legal-from-state-to-state-a2d32330f1a2#.vzplqnw80):Avoiding IllegalStateExceptions using RxJava and RxLifecycle.

39.[Reactive Streams 1.0.0 interview](https://medium.com/@viktorklang/reactive-streams-1-0-0-interview-faaca2c00bec#.fqy5ijlqh):On the heels of the release of Reactive Streams 1.0.0, I decided to grab a couple of engineers — Ben Christensen of RxJava and Netflix fame, Stephane Maldini of Pivotal’s Project Reactor and the inimitable Dr. Roland Kuhn of the Akka Project at Typesafe — that have been engaged in the project, to ask them a couple of quick questions about Reactive Streams, their involvement, and what the future has in store for Reactive Streams.

40.[Taking Command of Android Development](https://medium.com/@theMikhail/take-command-of-android-development-9411af8cf571#.ron9qpxpl):Throughout my Android career, I’ve often been asked to complete what sounds like a simple task:Get information from a server to a UI.

41.[Reactive Android Form. The recipe](https://medium.com/swlh/reactive-android-form-the-recipe-a90822465850#.sih6taixe):Everyone hates forms, but there is a type of people that hates them even more… Developers. We are all tired of these long forms and handling all the possible cases, all the errors and then make everything smoothly and easy for the user. I don’t have the perfect solution, but I have a way to make it easier and let me say even better. Let’s call it RxForms.

42.[Why you should be doing Functional Reactive Programming](https://medium.com/@cesarmcferreira/why-you-should-be-doing-functional-reactive-programming-858bd9bb8001#.jbtyg2xtw):stages of learning reactive programming: - denial - anger - bargaining - acceptance - flatMap the shit out of it.Let me start by saying that Functional Reactive Programming is hard when you come from an imperative mindset, but once you overcome the steep learning curve, it can save time, make for a cleaner, more robust, and maintainable code base.

43.[RxFlux Android Architecture](https://medium.com/swlh/rxflux-android-architecture-94f77c857aa2#.5qc4gocv1):This is the first article about the new RxFlux framework. Is small light-weight framework that makes it easy to follow the Flux pattern with RxJava functionalities.I will not get into the details on how Flux works, in order to understand more how to use Flux pattern in Android, @lgvalle created a nice example and explanation. I would recommend to read it before.In this article I will explain how to create an app from scratch using RxFlux. If you want to see more specific details in how to use RxFlux, go to the repo. One last note is that I used Retrolambda because everything looks much clear with it.

44.[Android RxJava使用介绍(一)Hello World](http://blog.csdn.net/job_hesc/article/details/45798307):RxJava最核心的两个东西就是Observables(被观察者，也就是事件源)和Subscribers(观察者)，由Observables发出一系列的事件，Subscribers进行订阅接收并进行处理，看起来就好像是设计模式中的观察者模式，但是跟观察者模式不同的地方就在于，如果没有观察者(即Subscribers)，Observables是不会发出任何事件的。

45.[可能是东半球最全的RxJava使用场景小结](http://blog.csdn.net/theone10211024/article/details/50435325):可能是东半球最全的RxJava使用场景小结.

46.[Implementing an Event Bus With RxJava - RxBus](http://nerds.weddingpartyapp.com/tech/2014/12/24/implementing-an-event-bus-with-rxjava-rxbus/):“RxBus” is not going to be a library. Implementing an event bus with RxJava is so ridiculously easy that it doesn’t warrant the bloat of an independent library.

47.[Website: http://rxmarbles.com/](http://rxmarbles.com/):Interactive diagrams of Rx Observables.

48.[Functional Reactive Programming on Android With RxJava](http://mttkay.github.io/blog/2013/08/25/functional-reactive-programming-on-android-with-rxjava/):In the domain of mobile or desktop applications, parallel execution allows for responsive user interfaces because we can move computations into the background while the UI responds to ongoing user interactions. Code must execute concurrently to not stray from this fundamental requirement. Writing such programs is diffcult because on mobile they are typically written in imperative languages like C or Java. Writing concurrent code in imperative languages is difficult because code is written in terms of interweaved, temporal instructions that move objects or data structures from one state to another. This imperative style of programming inherently produces side effects. It presents several problems when running instructions in parallel, such as race conditions when writing to a shared resource.

49.[Monads: Your App as a Function, Part 1](http://mttkay.github.io/blog/2014/01/25/your-app-as-a-function/):I write Android applications, and Java is not a functional language. It’s not even an object-oriented language, at least not in a puristic sense. However, that doesn’t stop us from adopting some of the good practices found in FP to improve on existing Java code. In this post I’ll try to explain how adopting one of the most fundamental type patterns in FP, monadic types, can dramatically simplify and improve the robustness of your core application logic.I have already written about RxJava and functional reactive programming and how we make use of it in our mobile applications at SoundCloud.

50.[Monads: Your App as a Function, Part 2](http://mttkay.github.io/blog/2014/01/25/monads-your-app-as-a-function-part-2/):Let me begin by saying that there is no deeper meaning in these laws beyond supporting common sense. I still think it’s worth looking at them because they close the loop to imperative programming, which you might be more familiar with, since especially the second and third laws enable what’s been attributed to monads as being “programmable semicolons” in case you’ve stumbled upon that phrase before.

51.[RxAndroid and Retrofit 2.0](https://medium.com/@ahmedrizwan/rxandroid-and-retrofit-2-0-66dc52725fff#.hnhw6dfp9):Ok, so this isn’t new or anything, but I thought let’s just make a simple tutorial with the new Retrofit 2.0, that should give you (and me) a starting point.This isn’t a tutorial for RxAndroid, so if you don’t know much about it, you should first check out this..

52.[Crunching RxAndroid — Part 5](https://medium.com/crunching-rxandroid/crunching-rxandroid-part-5-1dd5fba89058#.bwm71fx1j):In the last episode, we saw that even with the help of Reactive Programming, we risk to leak some important (and heavy) parts of our app, thus wasting users’ resources. They won’t be happy. We won’t be happy as a consequence, so let’s fix this!

53.[Why RxFlux?](https://medium.com/swlh/why-rxflux-5b687f062709#.b5npxdlld):I realized that my previous post showing a real example of an app using RxFlux was quite extensive.I decided to do a pre-introduction, where I will try to convince you why you should use it or at least read more about it.First of all RxFlux comes from the combination of RxJava and Flux pattern. If you don’t know the advantages of RxJava, just google it, you will find thousands of posts about it. On the other side, Flux is a known pattern in different platforms that recently popped up in the Android World.

54.[Droidcon 2015 London (Part 1)](https://medium.com/@LiudasSurvila/droidcon-2015-london-part-1-698a6b750f30#.oysfipy58):It was a blast. In these blog post series, I am putting brief of all talks I’ve attended in Droidcon 2015 London (will add links to videos when they are uploaded). It’s a summary and a reference point to things I’ve learned (and actually force myself to look deeper). Also, I am adding awesome #sketchnotes made by @corey_latislaw (my own are not very pretty xD). And some photos from a social feed. Part 2.

55.[Back in Krakow for the Droidcon](https://medium.com/@hamen/back-in-krakow-for-the-droidcon-25f5b868a981#.oiqzurlcg):After almost ten years, I was in Poland again last week. Ten years ago I was an Erasmus student; last week I was a speaker at Droidcon Krakow!Every Droidcon feels like a family reunion to me, but the funny part is that the family is continuously growing in size, every time we meet.Droidcon Krakow venue was a hotel and turns out that’s just brilliant: everything is already there, organised, comfortable. The food was really good and those “always-on” buffets were delicious. I stayed in the same hotel and this made the logistics as smooth as possible.

56.[Reactive Programming in the Netflix API with RxJava](http://techblog.netflix.com/2013/02/rxjava-netflix-api.html):Our recent post on optimizing the Netflix API introduced how our web service endpoints are implemented using a reactive programming model for composition of asynchronous callbacks from our service layer.This post takes a closer look at how and why we use the reactive model and introduces our open source project RxJava – a Java implementation of Rx (Reactive Extensions).

57.[RxJavaに3日で入門し](http://qiita.com/yuya_presto/items/152fa80d073d865cfc90):今開発中のプロダクトにおいて、RxJavaの導入をやってみたので、実際に使った箇所とその例、調べないとわからなかったことを載せておきました。そう（retrolambdaのためにjdk8を投入）までして導入したかったメリットを話してくれ、サンプルコードがないとわからん、といった声を頂いているので、実際に何が解決されたのか、どんなコードで解決したのかということと、そのために勉強しなくてはならなかった点について書いています。


58.[Top 7 Tips for RxJava on Android](http://futurice.com/blog/top-7-tips-for-rxjava-on-android):Last November I found myself at Futurice in London starting a challenging project that seemed to be the perfect candidate for a more immersive reactive system. We made the bold decision to build the entire Android architecture in RxJava. Little did we know at that time, though, just how deep the dive would be. After a few initial encouraging experiments we were surrounded by eerie problems and sleepless nights. Some usual solutions became impossible as they did not play with the system. Instead of null pointer exceptions we were debugging threading issues. Stack Overflow became even less relevant than usually. Curiously enough, there was no desire to turn back. It was clear the reactive way was the right way and anything else would have felt but an ugly compromise. That is, in fact, the funny thing about reactive — no matter how hard it is in the beginning, it always feels it is worth it. Fast-forward a few months, and we have an app with dense but clean code and an usually good test coverage of critical domain logic.

59.[Advanced RxJava](http://akarnokd.blogspot.jp/):In this final part, I'm going to show how one can implement operators (source and transformative alike). Since the Completable API features no values but only the terminal onError and onCompleted events, there are a way less meaningful operators possible unlike the main Observable class; therefore, most of the examples will feature an existing Completable operator.

60.[詳解RxJava2：Backpressureで流速制御](http://qiita.com/yuya_presto/items/0e95271bc85efe7f768e):謝辞：チームでは本当に自由にRxJavaを使わせてもらっていて、今回の記事の内容も実際にアプリでReactiveな表示更新ロジックを書こうとして習得したものです。この記事ではRxJavaのBackpressureの仕組みについて説明しつつ、Backpressureを使って問題をうまく解決できるパターンを紹介します。深夜テンションで一部お見苦しい点がございますがお許しください。

61.[ReactiveX란 무엇인가?](https://www.evernote.com/shard/s655/sh/ca763c7a-17a9-4b85-ba8d-8eec979d2442/ab38e452d455f654):ReactiveX는 Observer 패턴과, Iterator 패턴, 함수형 프로그래밍의 특성을 이용하여 비동기 구성과 관측 가능한 데이터 스트림 또는 이벤트 스트림을 다루는데 초점을 맞춘 API이다. 실시간 데이터를 다루는것은 빈번하게 발생하며, 실시간 데이터를 다루기 위해 효율적이고, 명확하며, 확장가능한 접근법을 가지는 것은 중요하다. 실시간 데이터를 다루기 위해 Observables와 operator를 사용하여, ReactiveX는 쓰레드 생성과 동시성 문제와 같은 비동기 프래그래밍의 일반적인 관심사를 단순화 하면서 데이터 스트림의 생성과 작용을 위한 구성 가능하고 유연한 API를 제공한다.

62.[The Simplest RxJava Observable Sample App](https://medium.com/@AdamScott/the-simplest-rxjava-observable-sample-app-831d845f541f#.9braguf3u):The RxJava Observable pattern in Android Development is excellent for handling multiple complex tasks and allowing control of how processes and data are handled. It’s hard to say if this is going to be a best practice or just this year’s trend, however it does seem to have current benefits.

63.[Testing Rx code](https://medium.com/azimolabs/testing-rx-code-7918d7ee1680#.fk3vqjpfr):In our app we strongly rely on Reactive Programming approach. Almost all async calls are handled by RxJava (the only exception is database which still works very well with old-fashioned Cursor, LoaderManager and Content Provider set). With a great possibilities given by reactive extension there is one issue — call chains, especially those which are passed between different threads by observeOn() and subscribeOn() operators, make testing problematic. In more complex solutions with IO or Computation schedulers simple using toBlocking() call doesn’t work — test is literally blocked during method execution.

64.[RxJava on the Sign In Screen](https://medium.com/@etiennelawlor/rxjava-on-the-sign-in-screen-9ecb66b88572#.rejv79wg9):Before I dive into an example of using RxJava, I’d like to talk a little bit about my journey trying to grok RxJava. What exactly is this thing called RxJava?RxJava is a Java VM implementation of ReactiveX (Reactive Extensions): a library for composing asynchronous and event-based programs by using observable sequences.

65.[Async Injection in Dagger 2 with RxJava](https://medium.com/@froger_mcs/async-injection-in-dagger-2-with-rxjava-e7df503343c0#.lkd7vbkg1):A couple weeks ago I wrote a post about asynchronous dependency injection in Dagger 2 with Producers. Objects initialization execution on background thread(s) has one great advantage — it doesn’t block main thread which is responsible for drawing UI in real-time (60 frames per second for keeping smooth interface).

66.[Using HandlerScheduler from RxAndroid](https://medium.com/@deividi/using-handlerscheduler-from-rxandroid-a09d35fc40a0#.b2xn3xz9s):Working in different threads in android became more easily in RxJava. Developers using RxJava don’t need to worry (in most cases) about thread executions in background or parallel. Simply put a magical subscribeOn and observeOn(AndroidSchedulers.mainThread()) and everything works fine. But there is the HandlerScheduler in RxAndroid, so… how and when do I need use it?

67.[Crunching RxAndroid — Part 8](https://medium.com/crunching-rxandroid/crunching-rxandroid-part-8-bf1808c08f95#.86cai75gz):In the previous part of this series, we dissected a little bit of the core RxJava framework, with the idea of learning the most we could about the mechanics of the reactive programming on Android and how to create and use custom operators. This time, we will start talking about a very important — yet very hard to catch — element of the famous library, trying to understand where we can use this new component and where we do not need it.

68.[2 minute introduction to Rx](https://medium.com/@andrestaltz/2-minute-introduction-to-rx-24c8ca793877#.9rvqu5wyk):You've probably seen this tutorial I wrote some time ago. Too long? Alright. Rx is not that hard, you could have invented it yourself. Keep reading.

69.[Howdy RxJava](https://medium.com/fuzz/howdy-rxjava-8f40fef88181#.ql2b0jrgu):During my research on Reactive Programming, almost every article I’ve found, begins with the notion that it is difficult to learn. Finding articles focused on people with zero or little knowledge of reactive programming has been difficult. This article attempts to demystify the fundamentals of reactive programming for newcomers — using RxJava on android.

69.[Converting callback async calls to RxJava](https://medium.com/we-are-yammer/converting-callback-async-calls-to-rxjava-ebc68bde5831#.i0zi7lg5v):Since we started using RxJava in our Yammer Android app we’ve often encountered APIs that don’t follow its reactive model, requiring us to do some conversion work to integrate them with the rest of our RxJava Observable chains.

70.[【RxJava && Agera】从源码简要分析基本调用流程](http://mp.weixin.qq.com/s?__biz=MzI1MTA1MzM2Nw==&mid=2649796857&idx=1&sn=ed8325aeddac7fd2bd81a0717c010e98&scene=1&srcid=0817o3Xzkx4ILR6FKaR1M9LX#rd):相信很多做Android或是Java研发的同学对RxJava应该都早有耳闻了，尤其是在Android开发的圈子里，RxJava渐渐开始广为流行。同样有很多同学已经开始在自己的项目中使用RxJava。它能够帮助我们在处理异步事件时能够省去那些复杂而繁琐的代码，尤其是当某些场景逻辑中回调中嵌入回调时，使用RxJava依旧能够让我们的代码保持极高的可读性与简洁性。不仅如此，这种基于异步数据流概念的编程模式事实上同样也能广泛运用在移动端这种包括网络调用、用户触摸输入和系统弹框等在内的多种响应驱动的场景。那么现在，就让我们一起分析一下RxJava的响应流程吧.

71.[use Rxjava instead of Event Bus libraries](https://medium.com/mobiwise-blog/use-rxjava-instead-of-event-bus-libraries-aa78b5023097#.o289efgou):In Android community, everyone is talking about RxJava and why we should use RxJava in Android projects. After start implementing RxJava in our Android application, we noticed that we don’t need Otto(or any other event bus libraries) implemented in our code base. In this blog post, I am going to show how we got rid of Otto in our code base, start using RxJava instead.

72.[Migrating from RxJava 1.0 to RxJava 2.0 and Learn RxJava by Examples](https://medium.freecodecamp.com/migrating-from-rxjava1-to-rxjava2-5dac0a94b4aa#.o2fsm8w32):This article will help you learn RxJava 2.0 by example. It will also show you how to migrate from RxJava 1.0.If you are just getting starting with RxJava, here’s a sample project to learn it with examples. You can dive right in, build the project, and start learning.

73.[RxJava as event bus, the right way](https://lorentzos.com/rxjava-as-event-bus-the-right-way-10a36bdd49ba#.aghy6iu2v):Otto from Square got officially deprecated the previous days. In the Android world we can cheer now something like “EventBusses are dead long live RxJava”.The raising question though is how can you efficiently migrate from an existing event bus such as Otto or Greenbot’s EventBus to Rx, or sometimes known as RxBus.Before we talk about RxJava as a event bus let’s be sure that one understands the functionality of an event bus.

74.[Let the view handle the lifecycle in MVP by using RxJava](https://medium.com/@ferhatparmak/let-the-view-handle-the-lifecycle-in-mvp-by-using-rxjava-694d67923871#.wrhbtiewl):Suppose that your view has a method called showProducts. Simply, it updates the items of recyclerview. If your view is a Fragment, you have to call this method after onViewCreated to be make sure the view is inflated.If we let the presenter know when onViewCreated is called, it can call showProducts on right time. But handling the view’s lifecycle is not the presenter’s job. View should handle that. But how?

75.[RxJava2: An Early Preview](https://medium.com/@theMikhail/rxjava2-an-early-preview-5b05de46b07#.fzdlntva7):As an avid RxJava user I’ve been following the development of RxJava2 which just hit its first Release Candidate. Here are some of the most interesting updates and additions to the library and what they mean for the developer community.

76.[Android animations powered by RxJava](https://pspdfkit.com/blog/2016/android-animations-powered-by-rx-java/):Animating objects in Android is seemingly easy, especially using ViewPropertyAnimator which provides out-of-the-box solutions and easy-to-construct view property animations. Add RxJava to the mix and you have a very powerful tool for chaining animations with other animations, random actions, etc.

77.[RxJava’s Side Effect Methods](http://www.grokkingandroid.com/rxjavas-side-effect-methods/):RxJava’s Observable class has plenty of methods that can be used to transform the stream of emitted items to the kind of data that you need. Those methods are at the very core of RxJava and form a big part of it’s attraction.But there are other methods, that do not change the stream of items in any way – I call those methods side effect methods.

78.[What's different in 2.0](https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0):RxJava 2.0 has been completely rewritten from scratch on top of the Reactive-Streams specification. The specification itself has evolved out of RxJava 1.x and provides a common baseline for reactive systems and libraries.Because Reactive-Streams has a different architecture, it mandates changes to some well known RxJava types. This wiki page attempts to summarize what has changed and describes how to rewrite 1.x code into 2.x code.

79.[Testing asynchronous RxJava code using Mockito](https://medium.com/@fabioCollini/testing-asynchronous-rxjava-code-using-mockito-8ad831a16877#.qudsmx4nk):RxJava is used in many Android applications to manage background tasks, in this post will see how to test this code using Mockito and some RxJava utility classes. The example is written using RxJava 2, the same concepts are available also in RxJava 1 (in the demo project you can find both versions of the same example).

80.[RxAndroid Tutorial](https://www.raywenderlich.com/141980/rxandroid-tutorial):Reactive programming is not just another API. It’s a whole new paradigm and a very useful one. RxJava is a reactive implementation used on Android. Android is a perfect place to start your exploration of the reactive world. It’s made even easier with RxAndroid, a library that wraps asynchronous UI events to be more RxJava like.

81.[Practical challenges for RxJava learners](https://medium.com/@sergii/practical-challenges-for-rxjava-learners-1821c454de9#.sn4x6mmux):RxJava is a valuable part of Java developer toolset and #1 language improvement framework for Android developers. Many of us want to learn it better, read some blogs and sources, but often miss practice to consolidate collected knowledge. Below I suggest a way to challenge yourself with coding tasks and improve practical RxJava skills.

82.[Testing RxJava2](https://www.infoq.com/articles/Testing-RxJava2):You’ve read about RxJava; you’ve played with the samples on the internet, for example in RxJava by Example, and now you have made a commitment to explore reactive opportunities in your own code. But now you are wondering how to test out the new capabilities that you might find in your codebase.Reactive programming requires a shift in how to reason about a particular problem, because we need to focus not on individual data items but on data flowing as streams of events. These events are often produced and consumed from different threads, and so when writing tests we must keep aware of concurrency concerns. Fortunately RxJava2 provides built-in support for testing Observables and Disposables, built right into the core rxjava dependency.

83.[关于 RxJava 最友好的文章—— RxJava 2.0 全新来袭](https://juejin.im/post/582b2c818ac24700618ff8f5):之前写RxJava相关文章的时候，就有人想让我谈谈RxJava2.0的新特性，说实话，一开始我是拒绝的。因为在我看来，RxJava2.0虽然是版本的重大升级，但总归还是RxJava，升级一个版本还能上天是咋的？了解一下它的更新文档不就好了么？真的有必要单出一篇文章来谈这个么?但是详细的了解了RxJava2.0以及部分源码之后，我觉得还是有必要对RxJava2.0做一个说明，帮助大家对于RxJava有更好的认识。

84.[Clearer RxJava intentions with Single and Completable](https://medium.com/@ValCanBuild/making-your-rxjava-intentions-clearer-with-single-and-completable-f064d98d53a8#.w5bhyxjhk):In almost all RxJava example code and tutorials there is one class that reigns supreme — the Observable. It is the object which makes the whole magic of reactive programming possible. It’s simple — you only have to track 3 events — onNext, onError, and onCompleted and you can apply all of the hundreds of possible operators to make it do your bidding. Why would you need anything else, right?

85.[A Complete Guide To Learn RxJava](https://blog.mindorks.com/a-complete-guide-to-learn-rxjava-b55c0cea3631):RxJava is used for reactive programming. In reactive programming, the consumer reacts to the data as it comes in. Reactive programming allows for event changes to propagate to registered observers.As we know that the RxJava is the most important library for Android Projects. So we must have a proper grip on using RxJava in the Android Projects.RxJava is an art and endless possibilities await those who can master it.

86.[NotRxJava guide for lazy folks](https://yarikx.github.io/NotRxJava/):These days if you are an android developer, you might hear some hype about RxJava. RxJava is library which can help you get rid of all you complex write-only code that deals with asynchronous events. Once you start using it in your project – you will use it everywhere.My goal here is to show some “prequel” to read before the official documentation in order to better understand the problems that RxJava tries to solve. This article is positioned as a small walk-through on how to reorganize messy Async code by ourselfs to see how we can implement basic principles of RxJava without actually using RxJava.

87.[093 : RxJava intervention with Dan Lew](http://fragmentedpodcast.com/episodes/093-rxjava-intervention-with-dan-lew/):In this episode of Fragmented, our friend and RxJava paragon of the Android – Dan Lew, returns for a record 3 and 1/2 time.We’ve been using RxJava over the years now and have even talked to Dan about it in previous episodes.

88.[Our Top Nine Learnings from Migrating from RxJava 1 to RxJava 2](https://www.runtastic.com/blog/en/tech/rxjava-2-migration-learnings/):At Runtastic we’re using RxJava to establish functional and reactive programming patterns. Modern mobile apps and RxJava are a great fit. We had been using RxJava 1 for a while, but recently we’ve switched major parts of our codebase to RxJava 2.RxJava2 introduces breaking changes. The official documentation outlines all the changes between RxJava 1 and 2. In this blog post, we want to outline the biggest learnings we had when migrating to RxJava 2. We’ll use the Groups feature of the Runtastic Running & Fitness app as an example throughout this blog post.

### 1-2 Video

1.[Get Reactive by Wolfram Rittmeyer/Pascal Welsch](https://www.youtube.com/watch?v=ssC4nX_pP3o):The RxJava hype is still in full swing and almost everything gets Rxified. At least since the stable RxAndroid 1.0 release it’s time to take RxAndroid seriously!In this session you will learn what RxJava is about, how to use it on Android and how RxAndroid can be used to build maintainable Android Apps from networking with Retrofit2 to UI with the new RxBinding and RxLifecycle libraries powered by MVP.If you haven’t had the time to Get Reactive, we’ll provide a quick introduction why you should use RxAndroid in your current and next projects.Code: https://github.com/passsy/android-GetReactive﻿.Slides: https://speakerdeck.com/passsy/get-reactive-devoxx.


2.[Learning RxJava (for Android) by example](https://www.youtube.com/watch?v=k3D0cWyNno4):A presentation aimed at beginners who have heard about RxJava and want to see what all the fuss is about. Kaushik Gopal provides primers on RxJava and RxAndroid, then looks at implementing real-world use cases in Android with RxJava. 

3.[Devnexus 2015 - RxJava and Retrolambda Making Android - Ross Hambrick](https://www.youtube.com/watch?v=vRl3u1I9v2M):Devnexus 2015 - RxJava and Retrolambda Making Android - Ross Hambrick.

4.[#droidconDE 2015: Ivan Morgillo – Android reactive programming with Rxjava](https://www.youtube.com/watch?v=JCLZ55M2gVo):In a world where there is a smartphone in every pocket, designing and building applications that can run smoothly and provide the User Experience that users will like it’s the only way to go. Reactive Programming style with RxJava will help you to beat Android Platform limitations to create astonishing Android Apps.This talk will be a practical journey from basic Reactive Programming and Observer Pattern concepts to the main feature of RxJava, with practical code examples and a real-world app.Find more information here: http://15.droidcon.de/session/android...

5.[Jake Wharton: Reactive Extensions, RxAndroid, Optimization](https://www.youtube.com/watch?v=qGM04LcSCmo):Before Droidcon NYC 2015, Huyen tries to pick Jake Wharton's brain on Reactive Extensions, RxAndroid, and optimization.

6.[Droidcon NYC 2015 - Introduction to Functional Reactive Programming](https://www.youtube.com/watch?v=_XKX6UQfNGY):Juan Gomez-Netflix:Introduction to Functional Reactive Programming.http://droidcon.nyc/2015/dcnyc/33/

7.[Reactive Programming](https://www.youtube.com/watch?v=3bAQXTVsEiQ):Meetup: Reactive Programming by Venkat Subramaniam
Get $10 off Digital Ocean Cloud Hosting https://goo.gl/VK2R48.NDC Meetup with Venkat Subramaniam on Reactive Programming.

8.[React 2014 : Erik Meijer - What does it mean to be Reactive?](https://www.youtube.com/watch?v=sTSQlYX5DU0):The inimitable Erik Meijer delivering his opening keynote to React 2014.

9.[Functional Reactive Programming with RxJava](https://www.youtube.com/watch?v=Dk8cR1Kxj0Y):RxJava is a library for composing asynchronous and event-based programs by using observable sequences for the Java VM. It supports Java 6+, Clojure, Scala, Groovy, JRuby, and Java 8 lambdas. In this session, learn how the Netflix API uses RxJava (techblog.netflix.com/2013/02/rxjava-net­flix-api.html) to implement highly concurrent Web services against asynchronous datasources without blocking, synchronization, or thread safety concerns by using declarative functional reactive composition. Come see what functional reactive programming looks like, how it fits into Java, and what use cases it addresses.

10.[Java 8 Stream and RxJava comparison: patterns and performances by José Paumard](https://www.youtube.com/watch?v=fabN6HNZ2qY):The Stream API is among the most important API introduced in the JDK 8. New patterns have been introduced, enabling new ways to process data, especially in parallel. The Java 8 Stream API is not alone on this segment. We would like to present here RxJava, a popular API, brought by Netflix. The patterns offered by this API are quite different from the Stream API. This presentation compares those two APIs, from the developer point of view. What patterns are proposed on both sides, and what are the performances of those patterns. Many examples and benchmarks (using JMH) are shown. The goal is not to state which one of those APIs is the best, but merely give keys to decide which one is the best suited for my application.

11.[A Playful Introduction to Rx by Erik Meijer](https://www.youtube.com/watch?v=WKore-AkisY):Learning Rx does not have to be boring like working your way through theoretical sermons about esoteric concepts like category theory and duality. Life is too short for that kind of abstract nonsense. So what is a better way to spend a hot summer day with an ice-cold drink, or a cold winter night with a piping hot drink, than to learn Rx by writing an awesome platform game? In this talk, Erik will walk you through many of the features of Rx through programming a friendly bug to run across a lushy grassy meadow and jump for the stars.

12.[Learn you some Rx for the greater good](https://www.youtube.com/watch?v=BujWQSjtplc):What is this Rx thing that everybody keeps talking about? How am I supposed to learn it? Is it even worth my effort? Watch, learn and try Functional Reactive Programming with RxJava on Android platform “For The Greater Good”.

13.[RxJava Tutorial 01 - download, setup, & write simple app.](https://www.youtube.com/watch?v=hzaq64zh0K4):RxJava Tutorial 01 - download, setup, & test-run by writing a simple app. . website + download source code @ http://www.zaneacademy.com

14.[Functional Reactive Programming with RxJava • Ben Christensen](https://www.youtube.com/watch?v=_t06LRX0DV0):ABSTRACT
Rxjava is a library for composing asynchronous and event-based programs using observable sequences for the Java VM that supports Java 6+, Clojure, Scala, Groovy, JRuby and Java 8 lambdas.Learn how the Netflix API uses RxJava (http://techblog.netflix.com/2013/02/r...) to implement highly concurrent web services against asynchronous data sources without blocking, synchronization or thread-safety concerns by using declarative functional reactive composition.Come see what functional reactive programming looks like, how it fits into Java, what use cases it addresses and real-world examples of how it can become a tool in your application development. 

15.[Introducing RxJava into a Spring Boot REST API](https://www.youtube.com/watch?v=QOR69q1e63Y):RxJava is an awesome library for async data streams. It is both expressive and powerful but the learning curve can be quite steep at first. So we want to quickstart developers into the world of Reactive eXtensions with more context than just listing operators!Adapted from a hands-on workshop, this talk will describe how one can migrate code into a fully async and RxJava-based application, built upon Spring Boot and Java 8.
What kind of changes does this require? What shifts in thinking? What are the traps and pitfalls to avoid? Hopefully you'll learn the answers to these questions in this talk!Slides: http://www.slideshare.net/SpringCentr...+XsoulflyX https://github.com/simonbasle/practicalRx﻿

16.[Demystifying RXJAVA Subscribers](https://www.youtube.com/watch?v=NVKmyK6sd-Q):Demystifying RXJAVA SubscribersRxJava is a powerful library for creating and composing streams of data. It can quickly be used to great effect, but a deeper understand of its internals will prevent running into pitfalls later on.This talk will focus on the core mechanism of how streams are created and observed: subscribers and subscriptions. We will start with an introduction to the contract of the Subscriber type and how it is used by sources to create streams. Then we will touch on operators and how they use subscribers to modify the data flowing through streams. Finally we'll look at how threading behaves in operators like subscribeOn and observeOn.

17.[Android reactive programming with RxJava by Ivan Morgillo](https://www.youtube.com/watch?v=Jnca7o4f-1k):In a world where there is a smartphone in every pocket, designing and building applications that can run smoothly and provide the User Experience that users will like it’s the only way to go. Reactive Programming style with RxJava will help you to beat Android Platform limitations to create astonishing Android Apps.This talk will be a practical journey from basic Reactive Programming and Observer Pattern concepts to the main feature of RxJava, with practical code examples and a real-world app.I'll show the audience how to create an Observable "from scratch", from a list or from a function we already have in our code base. Our listeners will learn how to filter an Observable sequence to create a new sequence containing only the values we want; they will learn how to apply a function to an Observable, how to concatenate, merge or zip Observables. I'll show how to enjoy RxAndroid Schedulers to overcome the threading and concurrency hell in Android.

18.[RxJava Easy Wins: Breaking down Reactive Programming](https://www.youtube.com/watch?v=SVv4i39MbEM):Ron Shapiro, Android Developer: http://nyc.droidcon.com/2014/dcnyc/62/...Slides from https://speakerdeck.com/search?q=droi...

19.[Практика использования RxJava в Я.Музыке и Я.Радио - Евгений Макар, Дмитрий Стабровски](https://www.youtube.com/watch?v=9o9dhWzOTa8):Евгений расскажет, как здорово используется RxJava в Яндекс.Радио, а Дмитрий — как благодаря этой технологии код Яндекс.Музыки становится легче.

20.[Lambdas on Android: RetroLambda, RxJava and Android Studio](https://www.youtube.com/watch?v=l63V5bZaS70):In this video, I'll show you how to migrate to lambdas on Android using RetroLambda, GradleRetroLambda and Android Studio.

21.[RXJava on practice, Cegeka](https://www.youtube.com/watch?v=ZxvPXvKiIDQ):RXJava on practice, Cegeka.

22.[RxJava Tutorial 03 - Observable from, just, & create methods](https://www.youtube.com/watch?v=sDqrlNprY24):Website + download source code http://www.zaneacademy.com.

23.[RxJava: Reactive Extensions in Scala](https://www.youtube.com/watch?v=tOMK_FYJREw):RxJava is a library for composing asynchronous and event-based programs using observable sequences for the Java VM that supports Java 6+, Clojure, Scala, Groovy, JRuby, and Java 8 lambdas.

24.[Ben Christensen on Reactive Programming with RxJava (TimesOpen: Reactive Programming)](https://www.youtube.com/watch?v=hZFjWho576o):Ben Christensen of Netflix Edge Engineering explains how Netflix deals with asynchronous streams of data and multiple values.

25.[RxJava Tutorial 02 - Reactive Addition Example](https://www.youtube.com/watch?v=alniTPvuPFo):Website + download source code http://www.zaneacademy.com.

26.[Retrofit y RXJava: cómo mejorar el rendimiento en Android Apps](https://www.youtube.com/watch?v=8-3Unjov5gk):En ese te video, Pedro Hernández, profesor del curso de Desarrollo para Android, te enseñará cómo obtener el mayor rendimiento en tus peticiones al servidor a través del uso de herramientas como RX java y Retrofit .

27.[Reactive Data Acess with RxJava, Including N1QL: Couchbase Connect 2015](https://www.youtube.com/watch?v=3EOKYPbvwHQ):This talk shows how to build scalable, reactive, and fault tolerant applications by making use of RxJava and the brand new fully reactive Couchbase Java SDK 2.x. We will also cover stability patterns and how our brand new query language, “N1QL” fits into the picture. This subject is important, as applications that exclusively rely on synchronous data access often hit a scalability wall when responses slow down and thread pools are exhausted. New paradigms, like reactive programming, alleviate the wasting of resources by dispatching them where they can do useful work and provide extensive toolsets to deal with the ever growing demands of web applications.

28.[GKAC 2014 Nov. - RxJava를 활용한 Functional Reactive Programming](https://www.youtube.com/watch?v=VIoTmuwRsH0):세션 슬라이드: http://www.slideshare.net/waynejo/gdg...

29.[Learn you some Rx for the greater good](https://www.youtube.com/watch?v=BujWQSjtplc):What is this Rx thing that everybody keeps talking about? How am I supposed to learn it? Is it even worth my effort? Watch, learn and try Functional Reactive Programming with RxJava on Android platform “For The Greater Good”.

30.[All Video:RxJava Tutorial](https://www.youtube.com/watch?v=hzaq64zh0K4&list=PLWM-sNqx_ezof__5WnN8WVQmMWXQkcFHi)by gasdia73youtube:RxJava Tutorial - download, setup, & test-run by writing a simple app. . website + download source code @ http://www.zaneacademy.com

31.[All Video:Learning RxJava (for Android) by example](https://www.youtube.com/watch?v=k3D0cWyNno4&list=PLREjTXdqZ86p6hkWi014Xz4Ro5F5Tww0B)by Bálint Böde:A presentation aimed at beginners who have heard about RxJava and want to see what all the fuss is about. Kaushik Gopal provides primers on RxJava and RxAndroid, then looks at implementing real-world use cases in Android with RxJava. 

32.[All Video:Functional Reactive Programming with RxJava • Ben Christensen](https://www.youtube.com/watch?v=_t06LRX0DV0&list=PLv170KGbI73s6y-AmrqTn8rGAF1yOOiuD)by matej zdolsek :This presentation was recorded at GOTO Aarhus 2013.Check out our upcoming conferences at http://gotocon.com

33.[WJUG #126 - CompletableFuture i RxJava - functional reactive programming w Javie - Tomasz Nurkiewicz](https://www.youtube.com/watch?v=S7gCcgTWSPs):WJUG #126 - CompletableFuture i RxJava - functional reactive programming w Javie - Tomasz Nurkiewicz.

34.[RxJava intro](https://www.youtube.com/watch?v=1AhA_4E9ufM):RxJava intro.

35.[RxJava arhictecture](https://www.youtube.com/watch?v=nACaHpca7OI):RxJava arhictecture.

36.[RxJava: Functional Reactive Programming - RJUG - December 17, 2014](https://www.youtube.com/watch?v=_tIVfsPUjXg):Richmond Java Users Group - RJUG December 17, 2014.

37.[GKAC 2015 Apr. - RxAndroid](https://www.youtube.com/watch?v=FpIqbVTnB30):Speaker: 김용욱.Session slide: http://www.slideshare.net/gdgkorea/gk...﻿

38.[Evolution of RxAndroid (Gource Visualization)](https://www.youtube.com/watch?v=1cvlXuurWYQ):Gource visualization of RxAndroid (https://github.com/ReactiveX/RxAndroid). RxJava bindings for Android.

39.[All Video:Lambdas on Android: RetroLambda, RxJava and Android Studio](https://www.youtube.com/watch?v=l63V5bZaS70&list=PL7D6rDpJO-797g91KOUkD0DEJeadW5qI-)by bibol bolat :In this video, I'll show you how to migrate to lambdas on Android using RetroLambda, GradleRetroLambda and Android Studio.

40.[All Video:Lambdas on Android: 웨비나 - RxAndroid ](https://www.youtube.com/watch?v=fBFHqJDLn9c&list=PLwA8jrpzf_Ccy_WsWAGZ0cz5oDu0xaWcg&index=2)by bs sin  :RxAndroid.

41.[Learning Rx by example](https://vimeo.com/190922794)by Øredev Conference.

42.[Exploring RxJava 2 for Android](https://realm.io/news/gotocph-jake-wharton-exploring-rxjava2-android/)by Jake Wharton on Nov 30 2016.

### 1-3 Library
1. **MovieGuide** An Android app that showcases the MVP pattern and RxJava.  
[https://github.com/esoxjem/MovieGuide](https://github.com/esoxjem/MovieGuide)
1. **Awesome-RxJava** RxJava resources.  
[https://github.com/lzyzsd/Awesome-RxJava](https://github.com/lzyzsd/Awesome-RxJava)
1. **NoRxJava** Everything about Rxjava:Thinking like a Rxjava library creator,Why we need use RxJava.  
[https://github.com/xiaomeixw/NoRxJava](https://github.com/xiaomeixw/NoRxJava)
1. **RxAndroidLibs** A curated list of libraries to aid reactive development on Android.  
[https://github.com/zsoltk/RxAndroidLibs](https://github.com/zsoltk/RxAndroidLibs)
1. **RxDocs** Rx和RxJava文档中文翻译项目.  
[https://github.com/mcxiaoke/RxDocs](https://github.com/mcxiaoke/RxDocs)
1. **RxAndroid-overview** Deckset presentation about RxJava and RxAndroid.  
[https://github.com/AL333Z/RxAndroid-overview/blob/master/presentation.md](https://github.com/AL333Z/RxAndroid-overview/blob/master/presentation.md)
1. **RxJava-Android-Samples** Learning RxJava for Android by example.  
[https://github.com/kaushikgopal/RxJava-Android-Samples](https://github.com/kaushikgopal/RxJava-Android-Samples)
1. **RxBinding** RxJava binding APIs for Android's UI widgets.  
[https://github.com/JakeWharton/RxBinding](https://github.com/JakeWharton/RxBinding)
1. **reark** RxJava architecture library for Android.  
[https://github.com/reark/reark](https://github.com/reark/reark)
1. **Meizhi** ank.io unofficial client, RxJava & Retrofit.  
[https://github.com/drakeet/Meizhi](https://github.com/drakeet/Meizhi)
1. **PhotoNoter** An Android app that use MVP+Dagger2+RxJava+Dex+MaterialDesign.  
[https://github.com/yydcdut/PhotoNoter](https://github.com/yydcdut/PhotoNoter)
1. **rex-weather** RexWeather - A sample Android project demonstrating the use of Retrofit and RxJava to interact with web services.  
[https://github.com/vyshane/rex-weather](https://github.com/vyshane/rex-weather)
1. **RxBus** Event Bus By RxJava.  
[https://github.com/AndroidKnife/RxBus](https://github.com/AndroidKnife/RxBus)
1. **rxjava-essentials** These are the RxJava Essentials code samples modified to use the latest build tools and with minor code formatting modifications.  
[https://github.com/marcoRS/rxjava-essentials](https://github.com/marcoRS/rxjava-essentials)
1. **RxJava-Essentials-CN** RxJava Essentials for Chinese.  
[https://github.com/yuxingxin/RxJava-Essentials-CN](https://github.com/yuxingxin/RxJava-Essentials-CN)
1. **Android-ReactiveLocation** Small library that wraps Google Play Service API in brilliant RxJava Observables reducing boilerplate to minimum.  
[https://github.com/mcharmas/Android-ReactiveLocation](https://github.com/mcharmas/Android-ReactiveLocation)
1. **ReactiveNetwork** Android library listening network connection state and change of the WiFi signal strength with RxJava Observables.  
[https://github.com/pwittchen/ReactiveNetwork](https://github.com/pwittchen/ReactiveNetwork)
1. **RxRecyclerView** Reactive RecyclerView Adapter.  
[https://github.com/exallium/RxRecyclerView](https://github.com/exallium/RxRecyclerView)
1. **RxFileObserver** Simple reactive API for Android's FileObserver class.  
[https://github.com/phajduk/RxFileObserver](https://github.com/phajduk/RxFileObserver)
1. **rxfilewatcher** Convenient file watcher with an RxJava interface, based on JDK WatchService.  
[https://github.com/helmbold/rxfilewatcher](https://github.com/helmbold/rxfilewatcher)
1. **RxLifecycle** Lifecycle handling APIs for Android apps using RxJava.  
[https://github.com/trello/RxLifecycle](https://github.com/trello/RxLifecycle)
1. **frodo** Android Library for Logging RxJava Observables and Subscribers.  
[https://github.com/android10/frodo](https://github.com/android10/frodo)
1. **rx-mvvm-android** My way to MVVM using RxJava with new Android databinding.  
[https://github.com/ffgiraldez/rx-mvvm-android](https://github.com/ffgiraldez/rx-mvvm-android)
1. **rxjava-multiple-sources-sample** Sample code demonstrating loading multiple data sources via RxJava.  
[https://github.com/dlew/rxjava-multiple-sources-sample](https://github.com/dlew/rxjava-multiple-sources-sample)
1. **RxCupboard** Store and retrieve streams of POJOs from an Android database using RxJava and Cupboard.  
[https://github.com/erickok/RxCupboard](https://github.com/erickok/RxCupboard)
1. **Android-RxFirebase** RxJava implementation for the Android Firebase client.  
[https://github.com/spirosoik/Android-RxFirebase](https://github.com/spirosoik/Android-RxFirebase)
1. **RxJavaSamples** 收集了RxJava常见的使用场景.  
[https://github.com/THEONE10211024/RxJavaSamples](https://github.com/THEONE10211024/RxJavaSamples)
1. **android_guides** Extensive Open-Source Guides for Android Developers.  
[https://github.com/codepath/android_guides/wiki/RxJava](https://github.com/codepath/android_guides/wiki/RxJava)
1. **sqlbrite** A lightweight wrapper around SQLiteOpenHelper which introduces reactive stream semantics to SQL operations.  
[https://github.com/square/sqlbrite](https://github.com/square/sqlbrite)
1. **storio** Beautiful API for SQLiteDatabase and ContentResolver.  
[https://github.com/pushtorefresh/storio](https://github.com/pushtorefresh/storio)
1. **RxBonjour** Reactive spice added to Android's network service discovery API.  
[https://github.com/aurae/RxBonjour](https://github.com/aurae/RxBonjour)
1. **rx-shared-preferences** RxJava SharedPreferences for Android, lightweight and extendable.  
[https://github.com/henrytao-me/rx-shared-preferences](https://github.com/henrytao-me/rx-shared-preferences)
1. **rxsnappy** RxSnappy is a thread safe rxjava wrapper for the great SnappyDB fast key-value database for Android.  
[https://github.com/team-supercharge/rxsnappy](https://github.com/team-supercharge/rxsnappy)
1. **RxPaper** Reactive extension for NoSQL data storage on Android.  
[https://github.com/cesarferreira/RxPaper](https://github.com/cesarferreira/RxPaper)
1. **StackRX** Stackoverflow client utilizing RXJava and other libraries.  
[https://github.com/Liffft/StackRX](https://github.com/Liffft/StackRX)
1. **RxCache** Reactive caching library for Android and Java.  
[https://github.com/VictorAlbertos/RxCache](https://github.com/VictorAlbertos/RxCache)
1. **RxPermissions** Android runtime permissions powered by RxJava.  
[https://github.com/tbruyelle/RxPermissions](https://github.com/tbruyelle/RxPermissions)
1. **JianDanRxJava** 使用Rxjava重构煎蛋高仿.  
[https://github.com/ZhaoKaiQiang/JianDanRxJava](https://github.com/ZhaoKaiQiang/JianDanRxJava)
1. **hello-mvp-dagger-2** Android MVP example code using RxJava, Retrolambda, Dagger 2, and more.  
[https://github.com/grandstaish/hello-mvp-dagger-2](https://github.com/grandstaish/hello-mvp-dagger-2)
1. **RxKotlin** RxJava bindings for Kotlin.  
[https://github.com/ReactiveX/RxKotlin](https://github.com/ReactiveX/RxKotlin)
1. **RxRelay** RxJava types that are both an Observable and an Action1.  
[https://github.com/JakeWharton/RxRelay](https://github.com/JakeWharton/RxRelay)
1. **NBAPlus** A concise APP about NBA News and Event with RxJava and EventBus.  
[https://github.com/SilenceDut/NBAPlus](https://github.com/SilenceDut/NBAPlus)
1. **wasp** Compact and easy to use, 'all-in-one' android network solution.  
[https://github.com/orhanobut/wasp](https://github.com/orhanobut/wasp)
1. **RxPeople** Observing people... wait what?  
[https://github.com/cesarferreira/RxPeople](https://github.com/cesarferreira/RxPeople)
1. **ReactiveSensors** Android library monitoring hardware sensors with RxJava Observables.  
[https://github.com/pwittchen/ReactiveSensors](https://github.com/pwittchen/ReactiveSensors)
1. **RxFingerprint** Android Fingerprint authentication and encryption APIs wrapped in RxJava.  
[https://github.com/Mauin/RxFingerprint](https://github.com/Mauin/RxFingerprint)
1. **RxGoogleMaps** Rx Wrapper For Android Google maps.  
[https://github.com/sdoward/RxGoogleMaps](https://github.com/sdoward/RxGoogleMaps)
1. **Mateyko** Lightweight image loader based on Retrofit and RxJava.  
[https://github.com/Marchuck/Mateyko](https://github.com/Marchuck/Mateyko)
1. **GWSRxBus** Seems to me that it might call for using some of the RXJava and RxAndroid Observables sugar to handle those cases and make the event bus more streamlined and handle more use cases.  
[https://github.com/shareme/GWSRxBus](https://github.com/shareme/GWSRxBus)
1. **octodroid** Android toolkit for the GitHub API.  
[https://github.com/rejasupotaro/octodroid](https://github.com/rejasupotaro/octodroid)
1. **satellite** Satellite is a simple (for those who are familiar with RxJava) Android library, which allows to properly connect background tasks with visual parts of an application.  
[https://github.com/konmik/satellite](https://github.com/konmik/satellite)
1. **RxPalette** RxJava bindings for the Palette library on Android.  
[https://github.com/hzsweers/RxPalette](https://github.com/hzsweers/RxPalette)
1. **android-subscription-leaks** Small sample app demonstrating memory leak solutions when using RxJava.  
[https://github.com/dlew/android-subscription-leaks](https://github.com/dlew/android-subscription-leaks)
1. **RxBinding** Easy oneway bindings for Android, which is based on RxJava.  
[https://github.com/ogaclejapan/RxBinding](https://github.com/ogaclejapan/RxBinding)
1. **RxClojure** RxJava bindings for Clojure.  
[https://github.com/ReactiveX/RxClojure](https://github.com/ReactiveX/RxClojure)
1. **assertj-rx** AssertJ assertions for RxJava Observables.  
[https://github.com/ribot/assertj-rx](https://github.com/ribot/assertj-rx)
1. **RxT4A** RxJava Toolbox for Android (a fork of RxAndroid).  
[https://github.com/cookpad/RxT4A](https://github.com/cookpad/RxT4A)
1. **RxMediaStore** MediaStore with AutoCursor in RxJava.  
[https://github.com/yongjhih/RxMediaStore](https://github.com/yongjhih/RxMediaStore)
1. **SimpleWeibo** Simple Weibo SDK turns Weibo API into a Java interface with RxJava.  
[https://github.com/8tory/SimpleWeibo](https://github.com/8tory/SimpleWeibo)
1. **RxPromise** A Promise wrapper around RxJava's Observable.  
[https://github.com/Q42/RxPromise](https://github.com/Q42/RxPromise)
1. **reark** RxJava architecture library for Android.  
[https://github.com/reark/reark](https://github.com/reark/reark)
1. **RxParse** Reactive Parse.  
[https://github.com/yongjhih/RxParse](https://github.com/yongjhih/RxParse)
1. **prefser** Wrapper for Android SharedPreferences with object serialization and RxJava Observables.  
[https://github.com/pwittchen/prefser](https://github.com/pwittchen/prefser)
1. **RxJava-Optional** RxJava-Optional is an library that allows developers to use Optional using RxJava.  
[https://github.com/eccyan/RxJava-Optional](https://github.com/eccyan/RxJava-Optional)
1. **RxAndroidBootstrap** A project which showcases usage of Dagger 2, Rxjava and retrolambda among other open source libraries.  
[https://github.com/richardradics/RxAndroidBootstrap](https://github.com/richardradics/RxAndroidBootstrap)
1. **rxpresso** Easy Espresso UI testing for Android applications using RxJava.  
[https://github.com/novoda/rxpresso](https://github.com/novoda/rxpresso)
1. **RetroFacebook** RetroFacebook turns Facebook API into a Java interface using RxJava.  
[https://github.com/yongjhih/RetroFacebook](https://github.com/yongjhih/RetroFacebook)
1. **rxmocks** Mocks/Assertions for RxJava testing.  
[https://github.com/novoda/rxmocks](https://github.com/novoda/rxmocks)
1. **RxStore** A tiny library that assists in saving and restoring objects to and from disk using RxJava.  
[https://github.com/Gridstone/RxStore](https://github.com/Gridstone/RxStore)
1. **Intro-To-RxJava** An extensive tutorial on RxJava.  
[https://github.com/Froussios/Intro-To-RxJava](https://github.com/Froussios/Intro-To-RxJava)
1. **rxpresso** Easy Espresso UI testing for Android applications using RxJava.  
[https://github.com/novoda/rxpresso](https://github.com/novoda/rxpresso)
1. **rxloader** Handles Android's activity lifecyle for rxjava's Observable.  
[https://github.com/evant/rxloader](https://github.com/evant/rxloader)
1. **RxBlur** 用RxJava处理和操作高斯模糊效果的简单用例.  
[https://github.com/SmartDengg/RxBlur](https://github.com/SmartDengg/RxBlur)
1. **RxJavaSamples** 收集了RxJava常见的使用场景.  
[https://github.com/THEONE10211024/RxJavaSamples](https://github.com/THEONE10211024/RxJavaSamples)
1. **RxWeather** Architecting Android with RxJava.  
[https://github.com/SmartDengg/RxWeather](https://github.com/SmartDengg/RxWeather)
1. **RengwuxianRxjava** 扔物线《给Android开发者的RxJava详解》文章中的例子.  
[https://github.com/androidmalin/RengwuxianRxjava](https://github.com/androidmalin/RengwuxianRxjava)
1. **rxjava-jdbc** Efficient execution and functional composition of database calls using jdbc and rx-java Observables. 
[https://github.com/davidmoten/rxjava-jdbc](https://github.com/davidmoten/rxjava-jdbc)
1. **RxJavaProGuardRules** ProGuard rules for RxJava shipped as AAR.  
[https://github.com/artem-zinnatullin/RxJavaProGuardRules](https://github.com/artem-zinnatullin/RxJavaProGuardRules)
1. **RxStarter** Showcase Project using RxJava and RxDAO pattern.  
[https://github.com/digitalbuddha/RxStarter](https://github.com/digitalbuddha/RxStarter)
1. **HelloRx** RxAndroid (RxJava) examples.  
[https://github.com/GDG-Korea/HelloRx](https://github.com/GDG-Korea/HelloRx)
1. **RxTuples** Simple tuples to use with RxJava.  
[https://github.com/pakoito/RxTuples](https://github.com/pakoito/RxTuples)
1. **learning-rxjava** Examples of using RxJava.  
[https://github.com/meddle0x53/learning-rxjava](https://github.com/meddle0x53/learning-rxjava)
1. **rxjava-koans** The Koans walk you along the path to Rx enlightenment in order to learn RxJava.  
[https://github.com/mutexkid/rxjava-koans](https://github.com/mutexkid/rxjava-koans)
1. **RxJava2-Java6** An automated backport of RxJava 2 to support Java 6.  
[https://github.com/JakeWharton/RxJava2-Java6](https://github.com/JakeWharton/RxJava2-Java6)
1. **daysuntil** Android app demonstrating Kotlin, RxJava, Realm and More.  
[https://github.com/GavinThePacMan/daysuntil](https://github.com/GavinThePacMan/daysuntil)
1. **rxjava-promises** Promises Implementation for JVM languages.  
[https://github.com/darylteo/rxjava-promises](https://github.com/darylteo/rxjava-promises)
1. **RxCamera** RxJava style API for android camera.  
[https://github.com/ragnraok/RxCamera](https://github.com/ragnraok/RxCamera)
1. **rain-or-shine** Sample Android application using RxJava.  
[https://github.com/rosshambrick/rain-or-shine](https://github.com/rosshambrick/rain-or-shine)
1. **ReactiveSensors** Android library monitoring hardware sensors with RxJava Observables.  
[https://github.com/pwittchen/ReactiveSensors](https://github.com/pwittchen/ReactiveSensors)
1. **rxjava-android-example** FRP sample implementation for Android using RxJava.  
[https://github.com/andrewhr/rxjava-android-example](https://github.com/andrewhr/rxjava-android-example)
1. **prefser** Wrapper for Android SharedPreferences with object serialization and RxJava Observables.  
[https://github.com/pwittchen/prefser](https://github.com/pwittchen/prefser)
1. **realm-rxjava-example** [DEPRECATED] Example of using Realm with RxJava on Android.  
[https://github.com/kboyarshinov/realm-rxjava-example](https://github.com/kboyarshinov/realm-rxjava-example)
1. **RxFlux** RxFlux is a small framework in order to follow Flux design pattern with RxJava functionalities.  
[https://github.com/skimarxall/RxFlux](https://github.com/skimarxall/RxFlux)
1. **mod-rxvertx** Vert.x module which uses RxJava to "Rx-ify" the Vert.x APIs making them composable.  
[https://github.com/vert-x/mod-rxvertx](https://github.com/vert-x/mod-rxvertx)
1. **rxfilewatcher** Convenient file watcher with an RxJava interface, based on JDK WatchService.  
[https://github.com/helmbold/rxfilewatcher](https://github.com/helmbold/rxfilewatcher)
1. **rxjava-webservice-example** simple comparison between Retrofit with & without RxJava.  
[https://github.com/mutexkid/rxjava-webservice-example](https://github.com/mutexkid/rxjava-webservice-example)
1. **RxAndroidEventsSample** BusEvents implementation base RxJava/RxAndroid.  
[https://github.com/wangjiegulu/RxAndroidEventsSample](https://github.com/wangjiegulu/RxAndroidEventsSample)
1. **RxJavaExamples** Several simple examples demonstrating how to use RxJava along with a few exercises to try.  
[https://github.com/colintheshots/RxJavaExamples](https://github.com/colintheshots/RxJavaExamples)
1. **rxmocks** Mocks/Assertions for RxJava testing.  
[https://github.com/novoda/rxmocks](https://github.com/novoda/rxmocks)
1. **reactive-http** RxJava HTTP Client for Android and Java application.  
[https://github.com/lyft/reactive-http](https://github.com/lyft/reactive-http)
1. **rxjava-http-tail** RxJava-based HTTP log following library.  
[https://github.com/myfreeweb/rxjava-http-tail](https://github.com/myfreeweb/rxjava-http-tail)
1. **ReactiveBeacons** Android library scanning BLE beacons nearby with RxJava.  
[https://github.com/pwittchen/ReactiveBeacons](https://github.com/pwittchen/ReactiveBeacons)
1. **RxFace** 用 RxJava, Retrofit, Okhttp 处理人脸识别的简单用例.  
[https://github.com/MrFuFuFu/RxFace](https://github.com/MrFuFuFu/RxFace)
1. **HelloRx** RxAndroid (RxJava) examples.  
[https://github.com/GDG-Korea/HelloRx](https://github.com/GDG-Korea/HelloRx)
1. **RxAndroidDemo** Sample app using RxJava and RxAndroid.  
[https://github.com/alphamu/RxAndroidDemo](https://github.com/alphamu/RxAndroidDemo)
1. **rxandroid-architecture-sample** A sample project to demonstrate a an android app that can consume data from multiple sources using RxJava.  
[https://github.com/zsiegel/rxandroid-architecture-sample](https://github.com/zsiegel/rxandroid-architecture-sample)
1. **rxjava-android-playground** ⚡️Demo Android project for playing with RxJava, RxAndroid, RxBindings, RxLifecycle and other Rx related libraries on Android, just for learning purposes.  
[https://github.com/walmyrcarvalho/rxjava-android-playground](https://github.com/walmyrcarvalho/rxjava-android-playground)
1. **RxAndroidCrunch** A simple tutorial step by step on how to implement and use RxAndroid.  
[https://github.com/tiwiz/RxAndroidCrunch](https://github.com/tiwiz/RxAndroidCrunch)
1. **Learning-Rxandroid** Learn and use RxAndroid together by PPT and Example.  
[https://github.com/YongHuiLuo/Learning-Rxandroid](https://github.com/YongHuiLuo/Learning-Rxandroid)
1. **TestDetailRxAndroid** RxAndroid基础知识.  
[https://github.com/SpikeKing/TestDetailRxAndroid](https://github.com/SpikeKing/TestDetailRxAndroid)
1. **RxSmartLock** Reactive extension for Google's Smart Lock for Passwords API.  
[https://github.com/ShlMlkzdh/RxSmartLock](https://github.com/ShlMlkzdh/RxSmartLock)
1. **RxFile** Rx methods to get a File and Image or Video thumbnails from a Document Provider on Android.  
[https://github.com/pavlospt/RxFile](https://github.com/pavlospt/RxFile)
1. **rxjava-extras** Utilities for use with rxjava.  
[https://github.com/davidmoten/rxjava-extras](https://github.com/davidmoten/rxjava-extras)
1. **hexagonal-mvp-reactive-android** Android project using RxJava, Hexagonal architecture and MVP.  
[https://github.com/ffgiraldez/hexagonal-mvp-reactive-android](https://github.com/ffgiraldez/hexagonal-mvp-reactive-android)
1. **rx-android-permissions** Simple RxJava library for requesting and observing Android runtime permissions.
[https://github.com/beworker/rx-android-permissions](https://github.com/beworker/rx-android-permissions)
1. **RxBluetooth** Android reactive bluetooth.  
[https://github.com/IvBaranov/RxBluetooth](https://github.com/IvBaranov/RxBluetooth)
1. **rxjava-extras** Utilities for use with rxjava.  
[https://github.com/davidmoten/rxjava-extras](https://github.com/davidmoten/rxjava-extras)
1. **hexagonal-mvp-reactive-android** Android project using RxJava, Hexagonal architecture and MVP.  
[https://github.com/ffgiraldez/hexagonal-mvp-reactive-android](https://github.com/ffgiraldez/hexagonal-mvp-reactive-android)
1. **rx-android-permissions** Simple RxJava library for requesting and observing Android runtime permissions.  
[https://github.com/beworker/rx-android-permissions](https://github.com/beworker/rx-android-permissions)
1. **rxjava-akka** Attempt at a bridge from RxJava to Akka and vice versa.  
[https://github.com/jmhofer/rxjava-akka](https://github.com/jmhofer/rxjava-akka)
1. **DaggerStarter** RxJava Showcase.  
[https://github.com/Betterment/DaggerStarter](https://github.com/Betterment/DaggerStarter)
1. **rx-docker-client** RxJava based Docker REST API client for the JVM.  
[https://github.com/shekhargulati/rx-docker-client](https://github.com/shekhargulati/rx-docker-client)
1. **vertx-rx** RxJava api for Vert.x 3.0.  
[https://github.com/vert-x3/vertx-rx](https://github.com/vert-x3/vertx-rx)
1. **rx-mvp-android** A basic project demonstrating some uses of RxJava with the Model-View-Presenter pattern on android.  
[https://github.com/zsiegel/rx-mvp-android](https://github.com/zsiegel/rx-mvp-android)
1. **practicalRx** A RxJava workshop to discover this library by migrating a legacy application. DON'T fork or PR this repo as it may be reconstructed from practicalRxOrigin in the future.  
[https://github.com/simonbasle/practicalRx](https://github.com/simonbasle/practicalRx)
1. **RxEspresso** Filling the gap between RxJava and Espresso.  
[https://github.com/stablekernel/RxEspresso](https://github.com/stablekernel/RxEspresso)
1. **ZhihuDailyRRD** This simple example is created by RRD(Retrofit,RxJava,Dagger2).  
[https://github.com/lsxiao/ZhihuDailyRRD](https://github.com/lsxiao/ZhihuDailyRRD)
1. **compass** Compass project - the RxJava way.  
[https://github.com/domsu/compass](https://github.com/domsu/compass)
1. **rxjava-file** RxJava observables for files including NIO events.  
[https://github.com/davidmoten/rxjava-file](https://github.com/davidmoten/rxjava-file)
1. **RxAndroidDemo** Sample app using RxJava and RxAndroid.  
[https://github.com/alphamu/RxAndroidDemo](https://github.com/alphamu/RxAndroidDemo)
1. **RxJavaFX** RxJava bindings for JavaFX.  
[https://github.com/ReactiveX/RxJavaFX](https://github.com/ReactiveX/RxJavaFX)
1. **RxJava-Threading-Examples** Examples of how to use many different threading operators in RxJava.  
[https://github.com/GrahamLea/RxJava-Threading-Examples](https://github.com/GrahamLea/RxJava-Threading-Examples)
1. **rxjava-priority-scheduler** An RxJava scheduler that incorporates priorities in scheduling tasks.  
[https://github.com/ronshapiro/rxjava-priority-scheduler](https://github.com/ronshapiro/rxjava-priority-scheduler)
1. **RxJavaDemo** Demos for the useage of Rxjava operators in android app.  
[https://github.com/Chaoba/RxJavaDemo](https://github.com/Chaoba/RxJavaDemo)
1. **RxGcm** A reactive wrapper for Android Google Cloud Messaging (aka gcm) to get rid of Service(s) configuration, handling foreground and background notifications depending on application state.  
[https://github.com/VictorAlbertos/RxGcm](https://github.com/VictorAlbertos/RxGcm)
1. **RxJavaApp** 一个用于学习RxJava操作符的APP.  
[https://github.com/jiang111/RxJavaApp](https://github.com/jiang111/RxJavaApp)
1. **RxAndroidAudio** Maybe the most robust Android Audio encapsulation library, with part Rx support..  
[https://github.com/Piasy/RxAndroidAudio](https://github.com/Piasy/RxAndroidAudio)
1. **RxSealedUnions** Tagged Unions for the RxJava aesthete..  
[https://github.com/pakoito/RxSealedUnions](https://github.com/pakoito/RxSealedUnions)
1. **RxWear** Reactive Wearable API Library for Android and RxJava..  
[https://github.com/patloew/RxWear](https://github.com/patloew/RxWear)
1. **rxeither** Either type for RxJava..  
[https://github.com/eleventigers/rxeither](https://github.com/eleventigers/rxeither)
1. **redex** ReDex is an Android bytecode (dex) optimizer originally developed at Facebook. It provides a framework for reading, writing, and analyzing .dex files, and a set of optimization passes that use this framework to improve the bytecode. An APK optimized by ReDex should be smaller and faster than its source...  
[https://github.com/facebook/redex](https://github.com/facebook/redex)
1. **RxCurrying** Simple currying for FuncN and ActionN on RxJava..  
[https://github.com/pakoito/RxCurrying](https://github.com/pakoito/RxCurrying)
1. **RxActions** Simple ActionN composition to use with RxJava..  
[https://github.com/pakoito/RxActions](https://github.com/pakoito/RxActions)
1. **RxDrive** RxJava wrapper for Google Drive Android API..  
[https://github.com/francescocervone/RxDrive](https://github.com/francescocervone/RxDrive)
1. **RxAppFocus** A tiny library which makes it simple to monitor visibility of your Android app..  
[https://github.com/gramboid/RxAppFocus](https://github.com/gramboid/RxAppFocus)
1. **RxSocialConnect-Android** OAuth RxJava extension for Android..  
[https://github.com/FuckBoilerplate/RxSocialConnect-Android](https://github.com/FuckBoilerplate/RxSocialConnect-Android)
1. **RxAgera** Convert between RxJava and Agera reactive base types..  
[https://github.com/akarnokd/RxAgera](https://github.com/akarnokd/RxAgera)
1. **rxassertions** Nice AssertJ assertions for RxJava..  
[https://github.com/ubiratansoares/rxassertions](https://github.com/ubiratansoares/rxassertions)
1. **Reactive-Billing** Lightweight reactive wrapper around In App Billing API v3 for Android..  
[https://github.com/lukaspili/Reactive-Billing](https://github.com/lukaspili/Reactive-Billing)
1. **RxSensor** Simple reactive wrapper for Android sensors..  
[https://github.com/wandup/RxSensor](https://github.com/wandup/RxSensor)
1. **RxImagePicker** Android. Pick image from camera or gallery using RxJava..  
[https://github.com/MLSDev/RxImagePicker](https://github.com/MLSDev/RxImagePicker)
1. **RxJavaJoins** Joins operators for RxJava..  
[https://github.com/ReactiveX/RxJavaJoins](https://github.com/ReactiveX/RxJavaJoins)
1. **ObservableScheduler** A simple Rx for study..  
[https://github.com/jiang111/ObservableScheduler](https://github.com/jiang111/ObservableScheduler)
1. **rxjava-mvp-giphy** Showcase of RxJava used with MVP and some other popular android libraries..  
[https://github.com/emmaguy/rxjava-mvp-giphy](https://github.com/emmaguy/rxjava-mvp-giphy)
1. **RxActivityResult** A reactive-tiny-badass-vindictive library to break with the OnActivityResult implementation as it breaks the observables chain..  
[https://github.com/VictorAlbertos/RxActivityResult](https://github.com/VictorAlbertos/RxActivityResult)
1. **RxFit** Reactive Fitness API Library for Android and RxJava..  
[https://github.com/patloew/RxFit](https://github.com/patloew/RxFit)
1. **rxandroidexamples** A set of examples for using RxJava in Android..  
[https://github.com/klnusbaum/rxandroidexamples](https://github.com/klnusbaum/rxandroidexamples)
1. **RxValidator** Easy Android form validation in Rx way..  
[https://github.com/phajduk/RxValidator](https://github.com/phajduk/RxValidator)
1. **RxLinkClawler** Android library for grabbing info from link using reactive way..  
[https://github.com/afeozzz/RxLinkClawler](https://github.com/afeozzz/RxLinkClawler)
1. **RxZhihuPager** A RX app for zhihu..  
[https://github.com/Runpop/RxZhihuPager](https://github.com/Runpop/RxZhihuPager)
1. **RxAndroidBle** RxAndroidBle is a powerful painkiller for Android's Bluetooth Low Energy headaches. It is backed by RxJava, implementing complicated APIs as handy reactive observables..  
[https://github.com/Polidea/RxAndroidBle](https://github.com/Polidea/RxAndroidBle)
1. **SuperMvp** A RX app for explore MVP,Material+Rx+Retrofit+Glide+leakcanary+butterknife..  
[https://github.com/liuyanggithub/SuperMvp](https://github.com/liuyanggithub/SuperMvp)
1. **AnDevCon-RxPatterns** Patterns used by my AnDevCon talk "Reactive Android Patterns"..  
[https://github.com/colintheshots/AnDevCon-RxPatterns](https://github.com/colintheshots/AnDevCon-RxPatterns)
1. **RxJoke** A RX app,Rxjava+Retrofit+Dagger2+MVP..  
[https://github.com/JDDJJ/RxJoke](https://github.com/JDDJJ/RxJoke)
1. **RxMarkdown** Markdown for Android..  
[https://github.com/yydcdut/RxMarkdown](https://github.com/yydcdut/RxMarkdown)
1. **RxViper** Android micro framework for developing apps based on clean VIPER architecture..  
[https://github.com/RxViper/RxViper](https://github.com/RxViper/RxViper)
1. **RxRecyclerAdapter** Rx based RecyclerView Adapter..  
[https://github.com/ahmedrizwan/RxRecyclerAdapter](https://github.com/ahmedrizwan/RxRecyclerAdapter)
1. **RxDebounceClick** A simple library to prevent debounce click on Android widget，convert into RxJava..  
[https://github.com/SmartDengg/RxDebounceClick](https://github.com/SmartDengg/RxDebounceClick)
1. **RxComboDetector** Android view click combo detector with Rx..  
[https://github.com/Piasy/RxComboDetector](https://github.com/Piasy/RxComboDetector)
1. **RxJavaV1V2Adapter** Adapter between RxJava v1 and v2..  
[https://github.com/artem-zinnatullin/RxJavaV1V2Adapter](https://github.com/artem-zinnatullin/RxJavaV1V2Adapter)
1. **RxJava2-Android-Samples** RxJava 2 Android Examples - Migration From RxJava 1 to RxJava 2 - How to use RxJava 2 in Android.  
[https://github.com/amitshekhariitbhu/RxJava2-Android-Samples](https://github.com/amitshekhariitbhu/RxJava2-Android-Samples)
1. **RxIAPv3** Android In-App Billing Library which provides several Rx Methods for Purchasing, Consuming and Listing Products.  
[https://github.com/pavlospt/RxIAPv3](https://github.com/pavlospt/RxIAPv3)
1. **Elephant** Elephant is PHPHub Community Android unofficial client, base on Material Design + MVP+RxJava+Retrofit.  
[https://github.com/Freelander/Elephant](https://github.com/Freelander/Elephant)
1. **RxDownload** The download tool based on RxJava . Support multi-threaded download and breakpoint download, intelligent judge whether to support multi-threaded download and breakpoint download.  
[https://github.com/ssseasonnn/RxDownload](https://github.com/ssseasonnn/RxDownload)
1. **RxNearby** Nearby handling APIs for Android Apps using RxJava.  
[https://github.com/hkurokawa/RxNearby](https://github.com/hkurokawa/RxNearby)
1. **Intro-To-RxJava** An extensive tutorial on RxJava.  
[https://github.com/Froussios/Intro-To-RxJava](https://github.com/Froussios/Intro-To-RxJava)
1. **RxDbflow** RxJava wrapper for dbflow.  
[https://github.com/roadhouse-dev/RxDbflow](https://github.com/roadhouse-dev/RxDbflow)
1. **Traceur** Easier RxJava2 debugging with better stacktraces.  
[https://github.com/T-Spoon/Traceur](https://github.com/T-Spoon/Traceur)
1. **RxPicker** The ImageSelect tool based on RxJava.  
[https://github.com/imuhao/RxPicker](https://github.com/imuhao/RxPicker)
1. **RxComponentLifecycle** Rx binding of new Android Architecture Component Lifecycle.  
[https://github.com/florent37/RxComponentLifecycle](https://github.com/florent37/RxComponentLifecycle)
1. **RxTest** Kotlin DSL for testing RxJava.  
[https://github.com/RubyLichtenstein/RxTest](https://github.com/RubyLichtenstein/RxTest)
