package com.example.examplemod;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

//when you want to change the directory or name of this class
//don't forge to change manifest.mf and manifest attributes in build.gradle
public class MyMixinConnector implements IMixinConnector {
    @Override
    public void connect() {
        System.out.println("Invoking Mixin Connector");
        Mixins.addConfiguration(
            "assets/examplemod/example.mixins.json"
        );
        if (FMLEnvironment.dist == Dist.CLIENT) {
            Mixins.addConfiguration(
                "assets/examplemod/example.mixins_client.json"
            );
        }
    }
}
