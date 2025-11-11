package net.acetheeldritchking.magic_of_color.events;

import io.redspace.ironsspellbooks.item.weapons.StaffItem;
import io.redspace.ironsspellbooks.render.ClientStaffItemExtensions;
import net.acetheeldritchking.magic_of_color.MagicofColor;
import net.acetheeldritchking.magic_of_color.registries.ItemRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = MagicofColor.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MagicofColorClient {
    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event)
    {
        // Items
        event.registerItem(new ClientStaffItemExtensions(), ItemRegistries.getMOCItems().stream().filter(item -> item.get() instanceof StaffItem staffItem && !staffItem.hasCustomRendering()).map(holder -> (Item) holder.get()).toArray(Item[]::new));
    }
}
