# LBAPI
LullBukkitAPI, Minecraft sunucuları için yardımcı API.

**API Maven-Gradle Dependency:**

Maven:
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.xBuhari</groupId>
    <artifactId>LBAPI</artifactId>
    <version>VERSION</version>
    <scope>compile</scope>
</dependency>
```
Gradle:

```xml
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    compile 'com.github.xBuhari:LBAPI:VERSION'
}
```

**Kullanım:**
```java
public LBAPI lbAPI;

public void onEnable() {
    lbAPI = new LBAPI(this);
    getLogger().info("TPS: " + lbAPI.getServerAPI().getServerTPS());
}```

