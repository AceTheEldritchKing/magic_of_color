package net.acetheeldritchking.magic_of_color.registries;

import earth.terrarium.pastel.registries.PastelItems;
import net.acetheeldritchking.magic_of_color.MagicofColor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MOCCreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicofColor.MOD_ID);

    public static final Supplier<CreativeModeTab> MOC_ITEMS_TAB = CREATIVE_MODE_TAB.register("moc_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PastelItems.BEDROCK_DUST.get()))
                    .title(Component.translatable("creative_tab.magic_of_color.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Materials
                        // Curios
                        // Treasure
                        // Spellbooks
                        // Weapons
                        // Staves
                        output.accept(ItemRegistries.INQUISITORS_GAUNTLET.get());
                        // Armor
                        // Gilded Magician
                        output.accept(ItemRegistries.GILDED_MAGICIANS_HAT.get());
                        output.accept(ItemRegistries.GILDED_MAGICIANS_HOOD.get());
                        output.accept(ItemRegistries.GILDED_MAGICIANS_MASK.get());
                        // Bedrock sets
                        output.accept(ItemRegistries.BEDROCK_WARLOCK_HAT.get());
                        output.accept(ItemRegistries.BEDROCK_WARLOCK_HOOD.get());
                        output.accept(ItemRegistries.BEDROCK_WARLOCK_HELMET.get());
                        output.accept(ItemRegistries.BEDROCK_WARLOCK_ROBES.get());
                        output.accept(ItemRegistries.BEDROCK_WARLOCK_LEGGINGS.get());
                        output.accept(ItemRegistries.BEDROCK_WARLOCK_GREAVES.get());
                        // Spawn Eggs
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
