package net.cobra.moreores;

import net.cobra.moreores.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.cobra.moreores.block.ModBlocks;
import net.cobra.moreores.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoreOres implements ModInitializer {

	// Gemstones Item Group
	private static final ItemGroup GEMSTONES = FabricItemGroup.builder()
			.icon(() -> new ItemStack(ModItems.RUBY))
			.displayName(Text.translatable("itemGroup.moreores.gemstones"))
			.entries((context, gemstones) -> {
				gemstones.add(ModItems.RUBY);
				gemstones.add(ModItems.RADIANT);
				gemstones.add(ModItems.SAPPHIRE);
				gemstones.add(ModItems.GREEN_SAPPHIRE);
				gemstones.add(ModItems.BLUE_GARNET);
				gemstones.add(ModItems.PINK_GARNET);
				gemstones.add(ModItems.GREEN_GARNET);
				gemstones.add(ModItems.TOPAZ);
				gemstones.add(ModItems.PERIDOT);
				gemstones.add(ModItems.WHITE_TOPAZ);
				gemstones.add(ModItems.PYROPE);
				gemstones.add(ModItems.JADE);
			}).build();

	@Override
	public void onInitialize() {
		// Gemstones Item Group Registry
		Registry.register(Registries.ITEM_GROUP, Identifier.of("moreores", "gemstones"), GEMSTONES);

		// Fuel Registry
		FuelRegistry.INSTANCE.add(ModItems.WOOD_PELLET, 2000);

		// Gemstones & Ingots Registry
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(items -> {
			items.addAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE);
			items.addBefore(Items.NETHERITE_INGOT, ModItems.ENERGY_INGOT);
			items.addBefore(Items.COAL, ModItems.WOOD_PELLET);
			items.addAfter(Items.NETHERITE_INGOT, ModItems.RADIANT);
			items.addAfter(ModItems.RADIANT, ModItems.RUBY);
			items.addAfter(ModItems.RUBY, ModItems.SAPPHIRE);
			items.addAfter(ModItems.SAPPHIRE, ModItems.GREEN_SAPPHIRE);
			items.addAfter(ModItems.GREEN_SAPPHIRE, ModItems.BLUE_GARNET);
			items.addAfter(ModItems.BLUE_GARNET, ModItems.PINK_GARNET);
			items.addAfter(ModItems.PINK_GARNET, ModItems.GREEN_GARNET);
			items.addAfter(ModItems.GREEN_GARNET, ModItems.TOPAZ);
			items.addAfter(ModItems.TOPAZ, ModItems.PERIDOT);
			items.addAfter(ModItems.PERIDOT, ModItems.WHITE_TOPAZ);
			items.addAfter(ModItems.WHITE_TOPAZ, ModItems.PYROPE);
			items.addAfter(ModItems.PYROPE, ModItems.JADE);
		});

		// Tools & Music Discs Registry
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(tools -> {
			tools.addAfter(Items.MUSIC_DISC_OTHERSIDE, ModItems.MUSIC_DISC_ARIA_MATH);
			tools.addAfter(ModItems.MUSIC_DISC_ARIA_MATH, ModItems.MUSIC_DISC_BIOME_FEST);
			tools.addAfter(ModItems.MUSIC_DISC_BIOME_FEST, ModItems.MUSIC_DISC_DREITON);
			tools.addAfter(ModItems.MUSIC_DISC_DREITON, ModItems.MUSIC_DISC_ENDLESS);
			tools.addAfter(ModItems.MUSIC_DISC_ENDLESS, ModItems.MUSIC_DISC_FEATHERFALL);
			tools.addAfter(ModItems.MUSIC_DISC_FEATHERFALL, ModItems.MUSIC_DISC_INFINITE_AMETHYST);
			tools.addAfter(ModItems.MUSIC_DISC_INFINITE_AMETHYST, ModItems.MUSIC_DISC_TASWELL);
			tools.addAfter(Items.NETHERITE_HOE, ModItems.RUBY_SHOVEL);
			tools.addAfter(ModItems.RUBY_SHOVEL, ModItems.RUBY_PICKAXE);
			tools.addAfter(ModItems.RUBY_PICKAXE, ModItems.RUBY_AXE);
			tools.addAfter(ModItems.RUBY_AXE, ModItems.RUBY_HOE);
			tools.addAfter(ModItems.RUBY_HOE, ModItems.SAPPHIRE_SHOVEL);
			tools.addAfter(ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE_PICKAXE);
			tools.addAfter(ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE_AXE);
			tools.addAfter(ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE_HOE);
		});

		// Weapons & Armors Registry
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(combat -> {
			combat.addAfter(Items.NETHERITE_SWORD, ModItems.RUBY_SWORD);
			combat.addAfter(Items.NETHERITE_AXE, ModItems.RUBY_AXE);
			combat.addAfter(ModItems.RUBY_AXE, ModItems.SAPPHIRE_AXE);
			combat.addAfter(ModItems.RUBY_SWORD, ModItems.SAPPHIRE_SWORD);
		});

		// Ores Registry
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(Ores -> {
			Ores.addAfter(Blocks.DEEPSLATE_DIAMOND_ORE, ModBlocks.RUBY_ORE);
			Ores.addAfter(ModBlocks.RUBY_ORE, ModBlocks.SAPPHIRE_ORE);
			Ores.addAfter(ModBlocks.SAPPHIRE_ORE, ModBlocks.GREEN_SAPPHIRE_ORE);
			Ores.addAfter(ModBlocks.GREEN_SAPPHIRE_ORE, ModBlocks.BLUE_GARNET_ORE);
			Ores.addAfter(ModBlocks.BLUE_GARNET_ORE, ModBlocks.PINK_GARNET_ORE);
			Ores.addAfter(ModBlocks.PINK_GARNET_ORE, ModBlocks.GREEN_GARNET_ORE);
			Ores.addAfter(ModBlocks.GREEN_GARNET_ORE, ModBlocks.TOPAZ_ORE);
			Ores.addAfter(ModBlocks.TOPAZ_ORE, ModBlocks.PERIDOT_ORE);
			Ores.addAfter(ModBlocks.PERIDOT_ORE, ModBlocks.WHITE_TOPAZ_ORE);
			Ores.addAfter(ModBlocks.WHITE_TOPAZ_ORE, ModBlocks.PYROPE_ORE);
			Ores.addAfter(ModBlocks.PYROPE_ORE, ModBlocks.JADE_ORE);
		});

		// Functional Block Registry
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(FunctionalBlocks -> {
			FunctionalBlocks.addAfter(Blocks.BLAST_FURNACE, ModBlocks.ENERGY_BLOCK);
			FunctionalBlocks.addAfter(Blocks.REDSTONE_LAMP, ModBlocks.RUBY_LAMP);
		});

		// Redstone Block Registry
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(redstone -> {
			redstone.addAfter(Blocks.REDSTONE_LAMP, ModBlocks.RUBY_LAMP);
		});

		// Food Registry
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(Foods -> {
			Foods.addAfter(Items.GOLDEN_APPLE, ModItems.DIAMOND_APPLE);
			Foods.addAfter(Items.POTATO, ModItems.PINEAPPLE);
			Foods.addAfter(ModItems.PINEAPPLE, ModItems.TOMATO);
		});

		// Gemstone_Blocks Registry
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(blocks -> {
			blocks.addBefore(Blocks.NETHERITE_BLOCK, ModBlocks.ENERGY_BLOCK);
			blocks.addAfter(Blocks.NETHERITE_BLOCK, ModBlocks.RUBY_BLOCK);
			blocks.addAfter(ModBlocks.RUBY_BLOCK, ModBlocks.RADIANT_BLOCK);
			blocks.addAfter(ModBlocks.RADIANT_BLOCK, ModBlocks.SAPPHIRE_BLOCK);
			blocks.addAfter(ModBlocks.SAPPHIRE_BLOCK, ModBlocks.GREEN_SAPPHIRE_BLOCK);
			blocks.addAfter(ModBlocks.GREEN_SAPPHIRE_BLOCK, ModBlocks.BLUE_GARNET_BLOCK);
			blocks.addAfter(ModBlocks.BLUE_GARNET_BLOCK, ModBlocks.PINK_GARNET_BLOCK);
			blocks.addAfter(ModBlocks.PINK_GARNET_BLOCK, ModBlocks.GREEN_GARNET_BLOCK);
			blocks.addAfter(ModBlocks.GREEN_GARNET_BLOCK, ModBlocks.TOPAZ_BLOCK);
			blocks.addAfter(ModBlocks.TOPAZ_BLOCK, ModBlocks.PERIDOT_BLOCK);
			blocks.addAfter(ModBlocks.PERIDOT_BLOCK, ModBlocks.WHITE_TOPAZ_BLOCK);
			blocks.addAfter(ModBlocks.WHITE_TOPAZ_BLOCK, ModBlocks.PYROPE_BLOCK);
			blocks.addAfter(ModBlocks.PYROPE_BLOCK, ModBlocks.JADE_BLOCK);
		});

		// ModItems Class Registry
		ModItems.registerItems();

		// ModBlocks Class Registry
		ModBlocks.registerBlocks();

		// ModSounds Class Registry
		ModSounds.registerSounds();
	}
}