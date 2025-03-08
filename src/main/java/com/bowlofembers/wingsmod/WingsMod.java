package com.bowlofembers.wingsmod;

import com.bowlofembers.wingsmod.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(WingsMod.MOD_ID)
public class WingsMod {
    public static final String MOD_ID = "wingsmod";

    public WingsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modEventBus);
    }
}
