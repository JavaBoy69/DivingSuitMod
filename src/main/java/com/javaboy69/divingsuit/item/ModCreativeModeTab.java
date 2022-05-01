package com.javaboy69.divingsuit.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab DIVING_SUIT_MOD = new CreativeModeTab("divingsuitmodTab"){
        @Override
        public ItemStack makeIcon(){ return new ItemStack(ModItems.NEOPREN.get()); }
    };
}
