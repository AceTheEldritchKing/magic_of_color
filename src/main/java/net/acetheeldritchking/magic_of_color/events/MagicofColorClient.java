package net.acetheeldritchking.magic_of_color.events;

import io.redspace.ironsspellbooks.item.SpellBook;
import io.redspace.ironsspellbooks.render.SpellBookCurioRenderer;
import mod.azure.azurelib.common.render.armor.AzArmorRendererRegistry;
import net.acetheeldritchking.aces_spell_utils.entity.render.items.SheathCurioRenderer;
import net.acetheeldritchking.aces_spell_utils.items.curios.SheathCurioItem;
import net.acetheeldritchking.magic_of_color.entity.render.armor.BedrockWarlockArmorRenderer;
import net.acetheeldritchking.magic_of_color.registries.ItemRegistries;
import net.acetheeldritchking.magic_of_color.registries.MOCCreativeTabRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import static net.acetheeldritchking.magic_of_color.MagicofColor.MOD_ID;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
//@Mod(value = MOD_ID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
//@EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public class MagicofColorClient {
    /*public MagicofColorClient(IEventBus modEventBus, ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);

        //NeoForge.EVENT_BUS.register(this);
    }*/
}
