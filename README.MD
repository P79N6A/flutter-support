# Android Flutter Support

加入定期任务对 Flutter Release 针对 Android 平台的 Jar 及 So 文件进行多渠道打包 （debug、profile、release），输出产物会被定期打包到 maven 平台，使用时可根据 debug or release 进行引入。

本工程也可以作为一个 Android 的壳文件的工程，对 Flutter Activity 、 Flutter Main 等相关控件进行封装也可以在这个里面进行添加。

``` shell

cd fluttersupport
../gradlew assemble # will gen 3 vers jar(or aar).

```