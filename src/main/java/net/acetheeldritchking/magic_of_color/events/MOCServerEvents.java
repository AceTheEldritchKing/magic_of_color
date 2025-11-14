package net.acetheeldritchking.magic_of_color.events;

import net.acetheeldritchking.magic_of_color.items.staffs.InquisitorsGauntletStaff;
import net.acetheeldritchking.magic_of_color.items.staffs.PraetorsGauntletStaff;
import net.acetheeldritchking.magic_of_color.registries.ItemRegistries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

import java.util.List;

@EventBusSubscriber
public class MOCServerEvents {

    @SubscribeEvent
    public static void livingIncomingDamageEvent(LivingIncomingDamageEvent event)
    {
        var sourceEntity = event.getSource().getEntity();
        var target = event.getEntity();
        var directEntity = event.getSource().getDirectEntity();

        // Item Abilities
        if (directEntity instanceof LivingEntity livingEntity)
        {
            ItemStack mainhandItem = livingEntity.getMainHandItem();

            // Inquisitor's Gauntlet
            if (mainhandItem.getItem() instanceof InquisitorsGauntletStaff && (!(livingEntity instanceof Player player) || !player.getCooldowns().isOnCooldown(ItemRegistries.INQUISITORS_GAUNTLET.get())))
            {
                // AoE
                double radius = 3;

                List<LivingEntity> entitiesNearby = directEntity.level().getEntitiesOfClass(LivingEntity.class, directEntity.getBoundingBox().inflate(radius));
                for (LivingEntity targets : entitiesNearby)
                {
                    targets.hurt(targets.damageSources().magic(), 4);

                    // Getting target coords
                    int xTarget = (int) targets.getX();
                    int zTarget = (int) targets.getZ();
                    // Getting attacker coords
                    int xAttacker = (int) livingEntity.getX();
                    int zAttacker = (int) livingEntity.getZ();

                    // Normalize vec
                    Vec3 vec3r = new Vec3(xTarget, 0, zTarget).subtract(xAttacker, 0, zAttacker).normalize();

                    // Does the knockback
                    targets.push(vec3r.x, 0.5, vec3r.z);
                }

                if (livingEntity instanceof Player player)
                {
                    player.getCooldowns().addCooldown(ItemRegistries.INQUISITORS_GAUNTLET.get(), InquisitorsGauntletStaff.COOLDOWN);
                }
            }

            // Praetor's Gauntlet
            if (mainhandItem.getItem() instanceof PraetorsGauntletStaff && (!(livingEntity instanceof Player player) || !player.getCooldowns().isOnCooldown(ItemRegistries.INQUISITORS_GAUNTLET.get())))
            {
                // AoE
                double radius = 4;

                List<LivingEntity> entitiesNearby = directEntity.level().getEntitiesOfClass(LivingEntity.class, directEntity.getBoundingBox().inflate(radius));
                for (LivingEntity targets : entitiesNearby)
                {
                    targets.hurt(targets.damageSources().magic(), 8);

                    // Getting target coords
                    int xTarget = (int) targets.getX();
                    int zTarget = (int) targets.getZ();
                    // Getting attacker coords
                    int xAttacker = (int) livingEntity.getX();
                    int zAttacker = (int) livingEntity.getZ();

                    // Normalize vec
                    Vec3 vec3r = new Vec3(xTarget, 0, zTarget).subtract(xAttacker, 0, zAttacker).normalize();

                    // Does the knockback
                    targets.push(vec3r.x, 0.55, vec3r.z);
                }

                if (livingEntity instanceof Player player)
                {
                    player.getCooldowns().addCooldown(ItemRegistries.PRAETORS_GAUNTLET.get(), PraetorsGauntletStaff.COOLDOWN);
                }
            }
        }
    }
}
