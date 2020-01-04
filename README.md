This is an example dev environment of Mixin with Forge 1.14/1.15.

## How to setup dev environment
Run
```gradlew genIntellijRuns``` or
```gradlew genEclipseRuns```

## About Mixin with Forge
Forge 1.14/1.15 does not officially support Mixin.
Forge 1.13's new modlauncher has a different architecture 
which does not allow Mixin to be added by a mod.
Mixin have to be in classpath upon game launching.

There are unofficial ways to let Mixin work with Forge in gaming environment.

### How to install Mixin for client:
Edit the version json. Add the following into "libraries":
```
        {
            "name": "org.spongepowered:mixin:0.8-20191213.172802-13",
            "downloads": {
                "artifact": {
                    "path": "org/spongepowered/mixin-0.8-20191213.172802-13/mixin-0.8-20191213.172802-13.jar",
                    "url": "https://repo.spongepowered.org/maven/org/spongepowered/mixin/0.8-SNAPSHOT/mixin-0.8-20191213.172802-13.jar",
                    "sha1": "fc5c70b4bf04801f63901f24c09f17a3363633ab",
                    "size": 926190
                }
            }
        },
        {
            "name": "org.ow2.asm:asm-util:6.2",
            "downloads": {
                "artifact": {
                    "path": "org/ow2/asm/asm-util/6.2/asm-util-6.2.jar",
                    "url": "https://repo1.maven.org/maven2/org/ow2/asm/asm-util/6.2/asm-util-6.2.jar",
                    "sha1": "a9690730f92cc79eeadc20e400ebb41eccce10b1",
                    "size": 79778
                }
            }
        },
        {
            "name": "org.ow2.asm:asm-analysis:6.2",
            "downloads": {
                "artifact": {
                    "path": "org/ow2/asm/asm-analysis/6.2/asm-analysis-6.2.jar",
                    "url": "https://repo1.maven.org/maven2/org/ow2/asm/asm-analysis/6.2/asm-analysis-6.2.jar",
                    "sha1": "c7d9a90d221cbb977848d2c777eb3aa7637e89df",
                    "size": 32041
                }
            }
        },
```

### How to install Mixin for dedicated server:

1. Download

https://repo.spongepowered.org/maven/org/spongepowered/mixin/0.8-SNAPSHOT/mixin-0.8-20191213.172802-13.jar
https://repo1.maven.org/maven2/org/ow2/asm/asm-util/6.2/asm-util-6.2.jar
https://repo1.maven.org/maven2/org/ow2/asm/asm-analysis/6.2/asm-analysis-6.2.jar

And put them together with the server jar

2. Use this command to launch the server
```
java -cp forge-1.14.4-28.1.109.jar;mixin-0.8-20191213.172802-13.jar;asm-analysis-6.2.jar;asm-util-6.2.jar;libraries/* net.minecraftforge.server.ServerMain
```