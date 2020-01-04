package com.example.examplemod.mixin_client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.stream.IntStream;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Inject(method = "run", at = @At("HEAD"))
    private void onStartingRunning(CallbackInfo ci) {
        IntStream.range(0, 100).forEach(i -> System.out.println("Mixin For Client is Successful!"));
    }
}
