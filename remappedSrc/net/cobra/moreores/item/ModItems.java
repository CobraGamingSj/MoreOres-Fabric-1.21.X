package net.cobra.moreores.item;

import net.cobra.moreores.sound.ModSounds;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
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
    public static final Item TASWELL = registerItem("taswell", new MusicDiscItem(7, ModSounds.TASWELL, new Item.Settings(), 514));
    public static final Item DREITON = registerItem("dreiton", new MusicDiscItem(7, ModSounds.DREITON, new Item.Settings(), 497));
    public static final Item BIOME_FEST = registerItem("biome_fest", new MusicDiscItem(7, ModSounds.BIOME_FEST, new Item.Settings(), 377));
    public static final Item ARIA_MATH = registerItem("aria_math", new MusicDiscItem(7, ModSounds.ARIA_MATH, new Item.Settings(), 309));
    public static final Item INFINITE_AMETHYST = registerItem("infinite_amethyst", new MusicDiscItem(7, ModSounds.INFINITE_AMETHYST, new Item.Settings(), 271));
    public static final Item ENDLESS = registerItem("endless", new MusicDiscItem(7, ModSounds.ENDLESS, new Item.Settings(), 403));
    public static final Item FEATHERFALL = registerItem("featherfall", new MusicDiscItem(7, ModSounds.FEATHERFALL, new Item.Settings(), 344));


    //Smithing
    public static final Item SMITHING_TEMPLATE = registerItem("smithing_template", new Item(new Item.Settings()));


    //Item Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier("moreores", name), item);
    }


    //Class Registry
    public static void registerItems() {

    }
}