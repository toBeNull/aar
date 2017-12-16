# 一.多渠道SDK构建+调试

&emsp;&emsp;本项目在[android-fat-aar][0]的基础上实现了Android多渠道SDK的开发、构建与调试，此外还实现了同时生成jar+so类型的sdk、自动生成studio及eclipse版demo、sdk文档等功能。

 - [x] 多渠道SDK的构建
 - [x] 多渠道SDK的调试
 - [ ] 自动生成demo
 - [ ] 自动生成文档

# 二.开发工具版本
android多渠道sdk构建

Android Studio版本：3.0

gradle插件版本：2.3.3

gradle版本：3.3

# 三.构建说明

## 1.下载本项目
```
git clone https://github.com/toBeNull/aar
```
## 2.修改root project的build.gradle如下：
```
buildscript {
    ext {
        debug = false
        ...
    }
    ...
}
...
```
## 3.在根目录命令窗口执行一下命令
```
gradle clean main
```
## 4.获取多渠道aar包及jar包

输出文件夹：sdk/build/outputs/aar/

# 四.调试说明：
## 1.修改root project的build.gradle如下：
```
buildscript {
    ext {
        debug = true
        ...
    }
    ...
}
...
```
## 2.新增一个渠道，如下：
```gradle
buildscript {
    ext {
        ...

        SDKProperties = [
                ...
                [product: 'test',     packageName: 'com.test.demo',    type: 'aar'],
        ]
        ...
    }
    ...
}
```

## 3.gradle同步成功后，在Android Studio的Build Variants窗口切换渠道至testDebug

## 4.运行app，针对test渠道进行修改与开发

# 五.相关文章
```
http://blog.csdn.net/u011370390/article/details/78631278
```

[0]:https://github.com/adwiv/android-fat-aar