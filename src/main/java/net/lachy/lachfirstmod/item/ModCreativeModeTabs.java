package net.lachy.lachfirstmod.item;

import net.lachy.lachfirstmod.LachFirstMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.network.chat.Component;
import net.lachy.lachfirstmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LachFirstMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> LACH_TAB = CREATIVE_MODE_TABS.register("lach_tab", ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.RUBY.get()))
        .title(Component.translatable("creativetab.lach_tab"))
        .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModItems.RUBY.get());
            pOutput.accept(ModItems.UNCUT_RUBY.get());
            pOutput.accept(ModBlocks.RUBY_BLOCK.get());
            pOutput.accept(ModBlocks.RUBY_ORE.get());
        })
        .build());

     public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
     }
}