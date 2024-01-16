package net.lachy.lachfirstmod.item;

import net.lachy.lachfirstmod.LachFirstMod;
import net.lachy.lachfirstmod.item.custom.ModToolTiers;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, LachFirstMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNCUT_RUBY = ITEMS.register("uncut_ruby",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_CLUMP = ITEMS.register("ruby_clump",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROCK_CANDY = ITEMS.register("rock_candy",
            ()-> new Item(new Item.Properties().stacksTo(16).food(new FoodProperties.Builder().nutrition(12).saturationMod(.7f).build())));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 0, 0, new Item.Properties()));
    

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}