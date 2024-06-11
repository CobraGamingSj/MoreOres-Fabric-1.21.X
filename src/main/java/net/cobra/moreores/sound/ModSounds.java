package net.cobra.moreores.sound;

import com.google.common.collect.ImmutableList;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.stream.IntStream;

public class ModSounds extends SoundEvents {

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_ARIA_MATH = ModSounds.registerReference("music_disc.aria_math");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_DREITON = ModSounds.registerReference("music_disc.dreiton");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_BIOME_FEST = ModSounds.registerReference("music_disc.biome_fest");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_TASWELL = ModSounds.registerReference("music_disc.taswell");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_INFINITE_AMETHYST = ModSounds.registerReference("music_disc.infinite_amethyst");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_ENDLESS = ModSounds.registerReference("music_disc.endless");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_FEATHERFALL = ModSounds.registerReference("music_disc.featherfall");

    private static RegistryEntry<SoundEvent> register(Identifier id, Identifier soundId, float distanceToTravel) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId, distanceToTravel));
    }

    private static SoundEvent register(String id) {
        return ModSounds.register(Identifier.of(id));
    }

    private static SoundEvent register(Identifier id) {
        return ModSounds.register(id, id);
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return ModSounds.registerReference(Identifier.of(id));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return ModSounds.registerReference(id, id);
    }

    private static SoundEvent register(Identifier id, Identifier soundId) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }


    public static void registerSounds() {

    }
}