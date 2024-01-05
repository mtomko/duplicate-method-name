# Repro

```scala
[info] welcome to sbt 1.9.8 (GraalVM Community Java 21.0.1)
[info] loading settings for project global-plugins from plugins.sbt ...
[info] loading global plugins from /Users/mtomko/.sbt/1.0/plugins
[info] loading settings for project repro-build-build from metals.sbt ...
[info] loading project definition from /opt/broad/gpp/repro/project/project
[info] loading settings for project repro-build from metals.sbt ...
[info] loading project definition from /opt/broad/gpp/repro/project
[success] Generated .bloop/repro-build.json
[success] Total time: 1 s, completed Jan 5, 2024, 7:43:38 AM
[info] loading settings for project repro from build.sbt ...
[info] set current project to repro (in build file:/opt/broad/gpp/repro/)
[info] Setting Scala version to 2.13.12 on 1 projects.
[info] Reapplying settings...
[info] set current project to repro (in build file:/opt/broad/gpp/repro/)
[info] running Main
doh
[success] Total time: 0 s, completed Jan 5, 2024, 7:43:38 AM
[info] Setting Scala version to 3.3.1 on 1 projects.
[info] Reapplying settings...
[info] set current project to repro (in build file:/opt/broad/gpp/repro/)
[info] running Main
Exception in thread "sbt-bg-threads-2" java.lang.ClassFormatError: Duplicate method name "Main$$$_$_$$anonfun$$anonfun$1" with signature "(LMain$Packet;)Z" in class file Main$
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1027)
	at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:150)
	at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:524)
	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:427)
	at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:421)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:714)
	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:420)
	at sbt.internal.ManagedClassLoader.findClass(ManagedClassLoader.java:103)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:593)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
	at Main.main(Main.scala)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at sbt.Run.invokeMain(Run.scala:144)
	at sbt.Run.execute$1(Run.scala:94)
	at sbt.Run.$anonfun$runWithLoader$5(Run.scala:121)
	at sbt.Run$.executeSuccess(Run.scala:187)
	at sbt.Run.runWithLoader(Run.scala:121)
	at sbt.Defaults$.$anonfun$bgRunTask$6(Defaults.scala:1988)
	at sbt.Defaults$.$anonfun$termWrapper$2(Defaults.scala:1927)
	at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
	at scala.util.Try$.apply(Try.scala:213)
	at sbt.internal.BackgroundThreadPool$BackgroundRunnable.run(DefaultBackgroundJobService.scala:367)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
[success] Total time: 0 s, completed Jan 5, 2024, 7:43:38 AM
[info] Reapplying settings...
[info] set current project to repro (in build file:/opt/broad/gpp/repro/)
```
