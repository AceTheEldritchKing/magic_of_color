package net.acetheeldritchking.magic_of_color;

import io.redspace.ironsspellbooks.item.SpellBook;
import io.redspace.ironsspellbooks.render.SpellBookCurioRenderer;
import mod.azure.azurelib.common.render.armor.AzArmorRendererRegistry;
import net.acetheeldritchking.aces_spell_utils.entity.render.items.SheathCurioRenderer;
import net.acetheeldritchking.aces_spell_utils.items.curios.SheathCurioItem;
import net.acetheeldritchking.magic_of_color.entity.render.armor.BedrockWarlockArmorRenderer;
import net.acetheeldritchking.magic_of_color.entity.render.armor.BedrockWarlockHelmetArmorRenderer;
import net.acetheeldritchking.magic_of_color.entity.render.armor.BedrockWarlockHoodArmorRenderer;
import net.acetheeldritchking.magic_of_color.items.armor.MOCArmorMaterialRegistry;
import net.acetheeldritchking.magic_of_color.registries.ItemRegistries;
import net.acetheeldritchking.magic_of_color.registries.MOCCreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MagicofColor.MOD_ID)
public class MagicofColor {
    public static final String MOD_ID = "magic_of_color";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MagicofColor(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Creative Tab
        MOCCreativeTabRegistry.register(modEventBus);
        // Items
        ItemRegistries.register(modEventBus);
        // Armor Materials
        MOCArmorMaterialRegistry.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // curios
            event.enqueueWork(() -> {
                ItemRegistries.getMOCItems().stream().filter(item -> item.get() instanceof SpellBook).forEach((item) -> CuriosRendererRegistry.register(item.get(), SpellBookCurioRenderer::new));
                ItemRegistries.getMOCItems().stream().filter(item -> item.get() instanceof SheathCurioItem).forEach((item) -> CuriosRendererRegistry.register(item.get(), SheathCurioRenderer::new));
            });

            // Armor Rendering Registry
            AzArmorRendererRegistry.register(BedrockWarlockArmorRenderer::new,
                    ItemRegistries.BEDROCK_WARLOCK_HAT.get(),
                    ItemRegistries.BEDROCK_WARLOCK_ROBES.get(),
                    ItemRegistries.BEDROCK_WARLOCK_LEGGINGS.get(),
                    ItemRegistries.BEDROCK_WARLOCK_GREAVES.get());
            AzArmorRendererRegistry.register(BedrockWarlockHoodArmorRenderer::new, ItemRegistries.BEDROCK_WARLOCK_HOOD.get());
            AzArmorRendererRegistry.register(BedrockWarlockHelmetArmorRenderer::new, ItemRegistries.BEDROCK_WARLOCK_HELMET.get());
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    /*@SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }*/

    public static ResourceLocation id(@NotNull String path)
    {
        return ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, path);
    }
}
