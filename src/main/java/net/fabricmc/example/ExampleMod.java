package com.example.brightmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.options.GameOptions;

public class BrightMod implements ModInitializer {
    @Override
    public void onInitialize() {
        GameOptions options = Minecraft.getInstance().options;
        options.gamma = 10.0F;
    }
}
