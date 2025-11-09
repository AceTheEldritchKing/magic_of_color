package net.acetheeldritchking.magic_of_color.items.armor;

import earth.terrarium.pastel.api.item.Preenchanted;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.acetheeldritchking.aces_spell_utils.registries.ASAttributeRegistry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.Map;

public class BedrockWarlockHelmetArmorItem extends ImbuableMOCArmorItem implements Preenchanted {
    public BedrockWarlockHelmetArmorItem(Type slot, Properties settings) {
        super(MOCArmorMaterialRegistry.BEDROCK_WARLOCK, slot, settings, schoolAttributesWithResistance(AttributeRegistry.ELDRITCH_SPELL_POWER, ASAttributeRegistry.MANA_REND, 150, 0.15F, 0.05F, 0.05F));
    }

    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public Map<ResourceKey<Enchantment>, Integer> getDefaultEnchantments() {
        return Map.of();
    }
}
