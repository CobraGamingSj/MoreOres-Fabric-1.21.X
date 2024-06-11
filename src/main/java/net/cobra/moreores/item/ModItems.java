package net.cobra.moreores.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    //Foods
    public static final Item PINEAPPLE = ModItems.registerItem("pineapple", new Item(new Item.Settings().food(ModFoods.PINEAPPLE)));
    public static final Item TOMATO = ModItems.registerItem("tomato", new Item(new Item.Settings().food(ModFoods.TOMATO)));
    public static final Item DIAMOND_APPLE = ModItems.registerItem("diamond_apple", new Item(new Item.Settings().food(ModFoods.DIAMOND_APPLE)));


    //Gemstones & Ingots
    public static final Item RUBY = ModItems.registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RADIANT = ModItems.registerItem("radiant", new Item(new Item.Settings()));
    public static final Item SAPPHIRE = ModItems.registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item GREEN_SAPPHIRE = ModItems.registerItem("green_sapphire", new Item(new Item.Settings()));
    public static final Item PINK_GARNET = ModItems.registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item BLUE_GARNET = ModItems.registerItem("blue_garnet", new Item(new Item.Settings()));
    public static final Item GREEN_GARNET = ModItems.registerItem("green_garnet", new Item(new Item.Settings()));
    public static final Item TOPAZ = ModItems.registerItem("topaz", new Item(new Item.Settings()));
    public static final Item PERIDOT = ModItems.registerItem("peridot", new Item(new Item.Settings()));
    public static final Item WHITE_TOPAZ = ModItems.registerItem("white_topaz", new Item(new Item.Settings()));
    public static final Item PYROPE = ModItems.registerItem("pyrope", new Item(new Item.Settings()));
    public static final Item JADE = ModItems.registerItem("jade", new Item(new Item.Settings()));
    public static final Item ENERGY_INGOT = ModItems.registerItem("energy_ingot", new EnergyIngotItem(new Item.Settings()));


    //Fuel
    public static final Item WOOD_PELLET = ModItems.registerItem("wood_pellet", new Item(new Item.Settings()));


    //Music Discs
//    public static final Item TASWELL = ModItems.registerItem("taswell", new MusicDiscItem(new Item.Settings()));
//    public static final Item DREITON = ModItems.registerItem("dreiton", new MusicDiscItem(new Item.Settings()));
//    public static final Item BIOME_FEST = ModItems.registerItem("biome_fest", new MusicDiscItem(new Item.Settings()));
//    public static final Item ARIA_MATH = ModItems.registerItem("aria_math", new MusicDiscItem(new Item.Settings()));
//    public static final Item INFINITE_AMETHYST = ModItems.registerItem("infinite_amethyst", new MusicDiscItem(new Item.Settings()));
//    public static final Item ENDLESS = ModItems.registerItem("endless", new MusicDiscItem(new Item.Settings()));
//    public static final Item FEATHERFALL = ModItems.registerItem("featherfall", new MusicDiscItem(new Item.Settings()));


//  Ruby Tools & Weapons
    public static final Item RUBY_SWORD = ModItems.registerItem("ruby_sword", new SwordItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 6, -2.1f))));
    public static final Item RUBY_PICKAXE = ModItems.registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 2, -3.0f))));
    public static final Item RUBY_SHOVEL = ModItems.registerItem("ruby_shovel", new ShovelItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 2.5F, -3.0F))));
    public static final Item RUBY_AXE = ModItems.registerItem("ruby_axe", new AxeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 6.0F, -2.1F))));
    public static final Item RUBY_HOE = ModItems.registerItem("ruby_hoe", new HoeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, -5.0F, 4.0F))));

    //Smithing
    public static final Item SMITHING_TEMPLATE = ModItems.registerItem("smithing_template", new Item(new Item.Settings()));


    //Items Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of("moreores", name), item);
    }


    //Class Registry
    public static void registerItems() {

    }
}