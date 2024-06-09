package net.cobra.moreores.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent TASWELL = registerSoundEvent("taswell");
    public static final SoundEvent DREITON = registerSoundEvent("dreiton");
    public static final SoundEvent BIOME_FEST = registerSoundEvent("biome_fest");
    public static final SoundEvent ARIA_MATH = registerSoundEvent("aria_math");
    public static final SoundEvent INFINITE_AMETHYST = registerSoundEvent("infinite_amethyst");
    public static final SoundEvent ENDLESS = registerSoundEvent("endless");
    public static final SoundEvent FEATHERFALL = registerSoundEvent("featherfall");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier("moreores", name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {

    }
}