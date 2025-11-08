package net.acetheeldritchking.magic_of_color.items.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.acetheeldritchking.aces_spell_utils.registries.ASAttributeRegistry;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class BedrockWarlockArmorItem extends ImbuableMOCArmorItem {
    public BedrockWarlockArmorItem(ArmorItem.Type slot, Item.Properties settings) {
        super(MOCArmorMaterialRegistry.BEDROCK_WARLOCK, slot, settings, schoolAttributesWithResistance(AttributeRegistry.ELDRITCH_SPELL_POWER, ASAttributeRegistry.SPELL_RES_PENETRATION, 150, 0.15F, 0.05F, 0.05F));
    }
}
