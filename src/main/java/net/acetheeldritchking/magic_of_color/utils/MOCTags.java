package net.acetheeldritchking.magic_of_color.utils;

import net.acetheeldritchking.magic_of_color.events.MagicofColor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MOCTags {
    // Armor Items For Idle
    public static final TagKey<Item> ARMORS_FOR_IDLE = ItemTags.create(ResourceLocation.parse(ResourceLocation.fromNamespaceAndPath(MagicofColor.MOD_ID, "armors_for_idle").toString()));
}
