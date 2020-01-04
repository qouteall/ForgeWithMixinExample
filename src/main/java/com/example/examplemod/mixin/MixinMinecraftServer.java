package com.example.examplemod.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.stream.IntStream;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {
    @Inject(method = "run", at = @At("HEAD"))
    private void onStartingRunning(CallbackInfo ci) {
        IntStream.range(0, 100).forEach(i -> System.out.println("Mixin For Server is Successful!"));
    }
}
