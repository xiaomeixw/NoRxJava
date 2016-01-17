# NoRxJava : Everything about Rxjava
Thinking like a Rxjava library creator,Why we need use RxJava...I will tell you everything about Rxjava:RxJava Study Resources(Part1)、Rxjava Usage(Part2) and Interpretation of Rxjava Source Code(Part3)...

![](http://i.imgur.com/IeJeTuo.png)

When to find RxJava:

- RxJava: [https://github.com/ReactiveX/RxJava](https://github.com/ReactiveX/RxJava)
- RxAndroid: [https://github.com/ReactiveX/RxAndroid](https://github.com/ReactiveX/RxAndroid)
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

## Part1 RxJava Study Resources:

### 1-1 Article

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




