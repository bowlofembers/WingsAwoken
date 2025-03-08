package com.bowlofembers.wingsmod.init;

import com.bowlofembers.wingsmod.WingsMod;
import com.bowlofembers.wingsmod.item.WingItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WingsMod.MOD_ID);

    public static final RegistryObject<Item> ANGEL_WINGS = ITEMS.register("angel_wings", WingItem::new);
    public static final RegistryObject<Item> SLIME_WINGS = ITEMS.register("slime_wings", WingItem::new);
    public static final RegistryObject<Item> FAIRY_WINGS = ITEMS.register("fairy_wings", WingItem::new);
    public static final RegistryObject<Item> EVIL_WINGS = ITEMS.register("evil_wings", WingItem::new);
    public static final RegistryObject<Item> FIRE_WINGS = ITEMS.register("fire_wings", WingItem::new);
    public static final RegistryObject<Item> BAT_WINGS = ITEMS.register("bat_wings", WingItem::new);
    public static final RegistryObject<Item> BLUE_BUTTERFLY_WINGS = ITEMS.register("blue_butterfly_wings", WingItem::new);
    public static final RegistryObject<Item> MONARCH_BUTTERFLY_WINGS = ITEMS.register("monarch_butterfly_wings", WingItem::new);
    public static final RegistryObject<Item> DRAGON_WINGS = ITEMS.register("dragon_wings", WingItem::new);
    public static final RegistryObject<Item> PARROT_WINGS = ITEMS.register("parrot_wings", WingItem::new);
}
