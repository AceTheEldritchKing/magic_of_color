package net.acetheeldritchking.magic_of_color.items.staffs;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import io.redspace.ironsspellbooks.item.weapons.IronsWeaponTier;
import net.acetheeldritchking.aces_spell_utils.registries.ASAttributeRegistry;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class MOCStaffTier implements IronsWeaponTier {
    // Inquisitor's Gauntlet
    public static MOCStaffTier INQUISITORS_GAUNTLET = new MOCStaffTier(9.5F, -3,
            new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.10f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(AttributeRegistry.MANA_REGEN, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, 0.15f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(ASAttributeRegistry.SPELL_RES_PENETRATION, 0.10D, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    // Praetor's Gauntlet
    public static MOCStaffTier PRAETORS_GAUNTLET = new MOCStaffTier(14.5F, -3.1F,
            new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.15f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(AttributeRegistry.MANA_REGEN, 0.1f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(AttributeRegistry.COOLDOWN_REDUCTION, 0.20f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
            new AttributeContainer(ASAttributeRegistry.SPELL_RES_PENETRATION, 0.15D, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
    );

    float damage;
    float speed;
    AttributeContainer[] attributeContainers;

    public MOCStaffTier(float damage, float speed, AttributeContainer... attributeContainers)
    {
        this.damage = damage;
        this.speed = speed;
        this.attributeContainers = attributeContainers;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public AttributeContainer[] getAdditionalAttributes() {
        return this.attributeContainers;
    }
}
