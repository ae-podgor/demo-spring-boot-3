# README


## JIT vs AOT compilation performance comparison
Conditions:
* Windows 10 v1607
* openjdk version "17.0.6" 2023-01-17
* OpenJDK Runtime Environment GraalVM CE 22.3.1 (build 17.0.6+10-jvmci-22.3-b13)
* OpenJDK 64-Bit Server VM GraalVM CE 22.3.1 (build 17.0.6+10-jvmci-22.3-b13, mixed mode, sharing)

| Process | Just-in-time | Ahead-of-time |
|---------|--------------|---------------|
| Build   | 15.686 s     | **03:12 min** |
| Run     | 5.054 s      | 0.741 s       |

Prerequisites for using Native Image
On Windows, Native Image requires Visual Studio Code and Microsoft Visual C++(MSVC).
On Windows, the native-image builder will only work when it’s executed from the x64 Native Tools Command Prompt.


### Reference Documentation
https://docs.spring.io/spring-boot/docs/3.0.0/reference/html/native-image.html#native-image.developing-your-first-application.native-build-tools.prerequisites.windows


