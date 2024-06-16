package net.cobra.moreores.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block ENERGY_BLOCK = ModBlocks.registerBlock("energy_block", new EnergyBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).requiresTool().strength(512.0f, 256.0f).strength(256.0f).sounds(BlockSoundGroup.METAL).luminance((state) -> {
        return 30;
    })));
    public static final Block RUBY_LAMP = ModBlocks.registerBlock("ruby_lamp", new RubyLamp(AbstractBlock.Settings.create().requiresTool().sounds(BlockSoundGroup.GLASS).luminance(state -> state.get(RubyLamp.LIT) ? 15:0)));
    public static final Block RUBY_BLOCK = ModBlocks.registerBlock("ruby_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0f, 5.0f).strength(5.0f)));
    public static final Block RADIANT_BLOCK = ModBlocks.registerBlock("radiant_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_RED).requiresTool().strength(5.0f, 5.0f).strength(5.0f)));
    public static final Block SAPPHIRE_BLOCK = ModBlocks.registerBlock("sapphire_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).requiresTool().strength(4.0f, 4.0f).strength(4.0f)));
    public static final Block GREEN_SAPPHIRE_BLOCK = ModBlocks.registerBlock("green_sapphire_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).requiresTool().strength(4.0f, 4.0f).strength(4.0f)));
    public static final Block BLUE_GARNET_BLOCK = ModBlocks.registerBlock("blue_garnet_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).requiresTool().strength(6.0f, 6.5f).strength(7.0f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)));
    public static final Block PINK_GARNET_BLOCK = ModBlocks.registerBlock("pink_garnet_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.PINK).requiresTool().strength(6.0f, 6.5f).strength(7.0f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)));
    public static final Block GREEN_GARNET_BLOCK = ModBlocks.registerBlock("green_garnet_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.PINK).requiresTool().strength(6.0f, 6.5f).strength(7.0f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)));
    public static final Block TOPAZ_BLOCK = ModBlocks.registerBlock("topaz_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).requiresTool().strength(8.0f, 8.0f).strength(9.0f)));
    public static final Block PERIDOT_BLOCK = ModBlocks.registerBlock("peridot_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).requiresTool().strength(8.0f, 8.0f).strength(9.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WHITE_TOPAZ_BLOCK = ModBlocks.registerBlock("white_topaz_block", new Block(AbstractBlock.Settings.create().requiresTool()));
    public static final Block PYROPE_BLOCK = ModBlocks.registerBlock("pyrope_block", new Block(AbstractBlock.Settings.create().requiresTool()));
    public static final Block JADE_BLOCK = ModBlocks.registerBlock("jade_block", new Block(AbstractBlock.Settings.create().requiresTool()));

    public static final Block RUBY_ORE = ModBlocks.registerBlock("ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 3), AbstractBlock.Settings.create().requiresTool().strength(6.0f, 6.0f).strength(6.0f).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block SAPPHIRE_ORE = ModBlocks.registerBlock("sapphire_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 3), AbstractBlock.Settings.create().requiresTool().strength(5.0f, 5.0f).strength(5.0f).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block GREEN_SAPPHIRE_ORE = ModBlocks.registerBlock("green_sapphire_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 3), AbstractBlock.Settings.create().requiresTool().strength(5.0f, 5.0f).strength(5.0f).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block BLUE_GARNET_ORE = ModBlocks.registerBlock("blue_garnet_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 3), AbstractBlock.Settings.create().requiresTool().strength(7.0f, 7.5f).strength(8.0f).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block PINK_GARNET_ORE = ModBlocks.registerBlock("pink_garnet_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 3), AbstractBlock.Settings.create().requiresTool().strength(7.0f, 7.5f).strength(8.0f).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block GREEN_GARNET_ORE = ModBlocks.registerBlock("green_garnet_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 3), AbstractBlock.Settings.create().requiresTool().strength(7.0f, 7.5f).strength(8.0f).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block TOPAZ_ORE = ModBlocks.registerBlock("topaz_ore", new ExperienceDroppingBlock(UniformIntProvider.create(1, 3), AbstractBlock.Settings.create().requiresTool().strength(9.0f, 9.0f).strength(10.0f).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block PERIDOT_ORE = ModBlocks.registerBlock("peridot_ore", new ExperienceDroppingBlock(UniformIntProvider.create(1, 2), AbstractBlock.Settings.create().requiresTool().strength(9.0f, 9.0f).strength(10.0f).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));
    public static final Block WHITE_TOPAZ_ORE = ModBlocks.registerBlock("white_topaz_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 5), AbstractBlock.Settings.create().requiresTool()));
    public static final Block PYROPE_ORE = ModBlocks.registerBlock("pyrope_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 5), AbstractBlock.Settings.create().requiresTool()));
    public static final Block JADE_ORE = ModBlocks.registerBlock("jade_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 5), AbstractBlock.Settings.create().requiresTool()));

    public static final Block TOMATO_CROP = ModBlocks.registerBlock("tomato_crop", new TomatoCropBlock(AbstractBlock.Settings.create()));

    //Block Registry
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of("moreores", name), block);
    }


    //BlockItem Registry
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of("moreores", name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {

    }

}