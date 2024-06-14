/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.cobra.moreores.block.jukebox;

import net.cobra.moreores.sound.ModSounds;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface ModJukeboxSongs extends JukeboxSongs{
    public static final RegistryKey<JukeboxSong> TASWELL = ModJukeboxSongs.of("taswell");
    public static final RegistryKey<JukeboxSong> DREITON = ModJukeboxSongs.of("dreiton");
    public static final RegistryKey<JukeboxSong> BIOME_FEST = ModJukeboxSongs.of("biome_fest");
    public static final RegistryKey<JukeboxSong> ARIA_MATH = ModJukeboxSongs.of("aria_math");
    public static final RegistryKey<JukeboxSong> INFINITE_AMETHYST = ModJukeboxSongs.of("infinite_amethyst");
    public static final RegistryKey<JukeboxSong> ENDLESS = ModJukeboxSongs.of("endless");
    public static final RegistryKey<JukeboxSong> FEATHERFALL = ModJukeboxSongs.of("featherfall");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(id));
    }

    private static void register(Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput) {
        registry.register(key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), lengthInSeconds, comparatorOutput));
    }

    public static void bootstrap(Registerable<JukeboxSong> registry) {
        ModJukeboxSongs.register(registry, TASWELL, ModSounds.MUSIC_DISC_TASWELL, 178, 1);
        ModJukeboxSongs.register(registry, DREITON, ModSounds.MUSIC_DISC_DREITON, 185, 2);
        ModJukeboxSongs.register(registry, BIOME_FEST, ModSounds.MUSIC_DISC_BIOME_FEST, 345, 3);
        ModJukeboxSongs.register(registry, ARIA_MATH, ModSounds.MUSIC_DISC_ARIA_MATH, 309, 4);
        ModJukeboxSongs.register(registry, INFINITE_AMETHYST, ModSounds.MUSIC_DISC_INFINITE_AMETHYST, 174, 5);
        ModJukeboxSongs.register(registry, ENDLESS, ModSounds.MUSIC_DISC_ENDLESS, 197, 6);
        ModJukeboxSongs.register(registry, FEATHERFALL, ModSounds.MUSIC_DISC_FEATHERFALL, 301, 7);
    }
}

