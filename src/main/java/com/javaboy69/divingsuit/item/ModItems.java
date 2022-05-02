package com.javaboy69.divingsuit.item;

import com.javaboy69.divingsuit.DivingSuit;
import com.javaboy69.divingsuit.item.custom.ModArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DivingSuit.MOD_ID);

    public static final RegistryObject<Item> NEOPREN = ITEMS.register("neopren", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVING_SUIT_MOD)));

    public static final RegistryObject<Item> DIVING_HELMET = ITEMS.register("diving_helmet", () -> new ModArmorItem(ModArmorMaterials.NEOPREN, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.DIVING_SUIT_MOD)));

    public static final RegistryObject<Item> DIVING_JACKET = ITEMS.register("diving_jacket", () -> new ArmorItem(ModArmorMaterials.NEOPREN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.DIVING_SUIT_MOD)));

    public static final RegistryObject<Item> DIVING_LEGGINS = ITEMS.register("diving_leggins", () -> new ArmorItem(ModArmorMaterials.NEOPREN, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.DIVING_SUIT_MOD)));

    public static final RegistryObject<Item> DIVING_FLOSSES = ITEMS.register("diving_fins", () -> new ArmorItem(ModArmorMaterials.NEOPREN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.DIVING_SUIT_MOD)));

    //public static final RegistryObject<Item> DIVING_MASK = ITEMS.register("diving_mask", () -> new ArmorItem())

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
