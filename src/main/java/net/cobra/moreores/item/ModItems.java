package net.cobra.moreores.item;

import net.cobra.moreores.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    //Foods
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new Item.Settings().food(ModFoods.PINEAPPLE)));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoods.TOMATO)));
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple", new Item(new Item.Settings().food(ModFoods.DIAMOND_APPLE)));


    //Gemstones & Ingots
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RADIANT = registerItem("radiant", new Item(new Item.Settings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item GREEN_SAPPHIRE = registerItem("green_sapphire", new Item(new Item.Settings()));
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item BLUE_GARNET = registerItem("blue_garnet", new Item(new Item.Settings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new Item.Settings()));
    public static final Item PERIDOT = registerItem("peridot", new Item(new Item.Settings()));
    public static final Item WHITE_TOPAZ = registerItem("white_topaz", new Item(new Item.Settings()));
    public static final Item PYROPE = registerItem("pyrope", new Item(new Item.Settings()));
    public static final Item JADE = registerItem("jade", new Item(new Item.Settings()));
    public static final Item ENERGY_INGOT = registerItem("energy_ingot", new EnergyIngotItem(new Item.Settings()));


    //Fuel
    public static final Item WOOD_PELLET = registerItem("wood_pellet", new Item(new Item.Settings()));


    //Music Discs
//    public static final Item TASWELL = registerItem("taswell", new MusicDiscItem(new Item.Settings()));
//    public static final Item DREITON = registerItem("dreiton", new MusicDiscItem(new Item.Settings()));
//    public static final Item BIOME_FEST = registerItem("biome_fest", new MusicDiscItem(new Item.Settings()));
//    public static final Item ARIA_MATH = registerItem("aria_math", new MusicDiscItem(new Item.Settings()));
//    public static final Item INFINITE_AMETHYST = registerItem("infinite_amethyst", new MusicDiscItem(new Item.Settings()));
//    public static final Item ENDLESS = registerItem("endless", new MusicDiscItem(new Item.Settings()));
//    public static final Item FEATHERFALL = registerItem("featherfall", new MusicDiscItem(new Item.Settings()));


//    Ruby Tools & Weapons
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 6, -2.1f))));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 2, -3.0f))));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 2.5F, -3.0F))));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 6.0F, -2.1F))));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, -5.0F, -4.0F))));

    //Smithing
    public static final Item SMITHING_TEMPLATE = registerItem("smithing_template", new Item(new Item.Settings()));


    //Items Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of("moreores", name), item);
    }


    //Class Registry
    public static void registerItems() {

    }
}