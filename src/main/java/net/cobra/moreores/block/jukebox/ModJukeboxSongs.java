///*
// * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
// */
//package net.cobra.moreores.block.jukebox;
//
//import net.cobra.moreores.sound.ModSounds;
//import net.minecraft.block.jukebox.JukeboxSong;
//import net.minecraft.block.jukebox.JukeboxSongs;
//import net.minecraft.registry.Registerable;
//import net.minecraft.registry.RegistryKey;
//import net.minecraft.registry.RegistryKeys;
//import net.minecraft.registry.entry.RegistryEntry;
//import net.minecraft.sound.SoundEvent;
//import net.minecraft.sound.SoundEvents;
//import net.minecraft.text.Text;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.Util;
//
//public interface ModJukeboxSongs extends JukeboxSongs{
//    public static final RegistryKey<JukeboxSong> TASWELL = ModJukeboxSongs.of("13");
//    public static final RegistryKey<JukeboxSong> DREITON = ModJukeboxSongs.of("cat");
//    public static final RegistryKey<JukeboxSong> BIOME_FEST = ModJukeboxSongs.of("blocks");
//    public static final RegistryKey<JukeboxSong> ARIA_MATH = ModJukeboxSongs.of("chirp");
//    public static final RegistryKey<JukeboxSong> INFINITE_AMETHYST = ModJukeboxSongs.of("far");
//    public static final RegistryKey<JukeboxSong> ENDLESS = ModJukeboxSongs.of("mall");
//    public static final RegistryKey<JukeboxSong> FEATHERFALL = ModJukeboxSongs.of("mellohi");
//
//    private static RegistryKey<JukeboxSong> of(String id) {
//        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.ofVanilla(id));
//    }
//
//    private static void register(Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput) {
//        registry.register(key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), lengthInSeconds, comparatorOutput));
//    }
//
//    public static void bootstrap(Registerable<JukeboxSong> registry) {
//        ModJukeboxSongs.register(registry, TASWELL, ModSounds.TASWELL, 178, 1);
//        ModJukeboxSongs.register(registry, DREITON, SoundEvents.MUSIC_DISC_CAT, 185, 2);
//        ModJukeboxSongs.register(registry, BIOME_FEST, SoundEvents.MUSIC_DISC_BLOCKS, 345, 3);
//        ModJukeboxSongs.register(registry, ARIA_MATH, SoundEvents.MUSIC_DISC_CHIRP, 185, 4);
//        ModJukeboxSongs.register(registry, INFINITE_AMETHYST, SoundEvents.MUSIC_DISC_FAR, 174, 5);
//        ModJukeboxSongs.register(registry, ENDLESS, SoundEvents.MUSIC_DISC_MALL, 197, 6);
//        ModJukeboxSongs.register(registry, FEATHERFALL, SoundEvents.MUSIC_DISC_MELLOHI, 96, 7);
//    }
//}
//
