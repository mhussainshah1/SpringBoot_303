##IntelliJ, SpringBoot devtools livereload
1. Add LiveReload extension in your browser.
<a href="https://chrome.google.com/webstore/detail/livereload/jnihajbhpnppcggbcgedagnkighmdlei?hl=en">chrome</a><br/>
<img src="/img/live-reload.png" alt="Live Reload">

1. Add devtools dependencies to your pom.xml(if it's maven (spring-boot-devtools)).
```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
        </dependency>
````
1. In your intellij IDEA go to: file->settings->build,execution,deployment. Go to ->compiler->build project automatically.
 <img src="/img/ctrl-shift-a.png" alt="Press Ctrl+Shit+A" width ="400" height="300">
 
1. In your intellij IDEA: **SHIFT+Ctrl+A** ->registry-> compiler.automake.allow.when.app.running
 <img src="/img/settings-build_execution_deployment-compiler-build_auto.png" alt="Select Build automatically" width ="400" height="300">
