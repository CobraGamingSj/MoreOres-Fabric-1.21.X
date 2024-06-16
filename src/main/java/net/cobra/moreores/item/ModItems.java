package net.cobra.moreores.item;

import net.cobra.moreores.block.ModBlocks;
import net.cobra.moreores.block.jukebox.ModJukeboxSongs;
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
    public static final Item MUSIC_DISC_TASWELL = ModItems.registerItem("music_disc_taswell", new Item(new Item.Settings().jukeboxPlayable(ModJukeboxSongs.TASWELL)));
    public static final Item MUSIC_DISC_DREITON = ModItems.registerItem("music_disc_dreiton", new Item(new Item.Settings().jukeboxPlayable(ModJukeboxSongs.DREITON)));
    public static final Item MUSIC_DISC_BIOME_FEST = ModItems.registerItem("music_disc_biome_fest", new Item(new Item.Settings().jukeboxPlayable(ModJukeboxSongs.BIOME_FEST)));
    public static final Item MUSIC_DISC_ARIA_MATH = ModItems.registerItem("music_disc_aria_math", new Item(new Item.Settings().jukeboxPlayable(ModJukeboxSongs.ARIA_MATH)));
    public static final Item MUSIC_DISC_INFINITE_AMETHYST = ModItems.registerItem("music_disc_infinite_amethyst", new Item(new Item.Settings().jukeboxPlayable(ModJukeboxSongs.INFINITE_AMETHYST)));
    public static final Item MUSIC_DISC_ENDLESS = ModItems.registerItem("music_disc_endless", new Item(new Item.Settings().jukeboxPlayable(ModJukeboxSongs.ENDLESS)));
    public static final Item MUSIC_DISC_FEATHERFALL = ModItems.registerItem("music_disc_featherfall", new Item(new Item.Settings().jukeboxPlayable(ModJukeboxSongs.FEATHERFALL)));


//  Ruby Tools & Weapons
    public static final Item RUBY_SWORD = ModItems.registerItem("ruby_sword", new SwordItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 6, -2.1f))));
    public static final Item RUBY_PICKAXE = ModItems.registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 2, -3.0f))));
    public static final Item RUBY_SHOVEL = ModItems.registerItem("ruby_shovel", new ShovelItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 2.5F, -3.0F))));
    public static final Item RUBY_AXE = ModItems.registerItem("ruby_axe", new AxeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 6.0F, -2.1F))));
    public static final Item RUBY_HOE = ModItems.registerItem("ruby_hoe", new HoeItem(ModToolMaterials.RUBY, new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, -5.0F, 0.0F))));


//    Sapphire Tools & Weapons
    public static final Item SAPPHIRE_SWORD = ModItems.registerItem("sapphire_sword", new SwordItem(ModToolMaterials.SAPPHIRE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 8, -2.0f))));
    public static final Item SAPPHIRE_PICKAXE = ModItems.registerItem("sapphire_pickaxe", new PickaxeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 4, -3.0f))));
    public static final Item SAPPHIRE_AXE = ModItems.registerItem("sapphire_axe", new AxeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 8, -2.0f))));
    public static final Item SAPPHIRE_HOE = ModItems.registerItem("sapphire_hoe", new HoeItem(ModToolMaterials.SAPPHIRE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 4, -3.0f))));
    public static final Item SAPPHIRE_SHOVEL = ModItems.registerItem("sapphire_shovel", new ShovelItem(ModToolMaterials.SAPPHIRE, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SAPPHIRE, 3.5F, -3.0F))));


//    Smithing
    public static final Item RUBY_UPGRADE_SMITHING_TEMPLATE = ModItems.registerItem("ruby_upgrade_smithing_template", RubyUpgradeSmithingTemplate.createRubyUpgrade());


//    Seeds
    public static final Item TOMATO_SEEDS = ModItems.registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()));

    //Items Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of("moreores", name), item);
    }


    //Class Registry
    public static void registerItems() {

    }
}