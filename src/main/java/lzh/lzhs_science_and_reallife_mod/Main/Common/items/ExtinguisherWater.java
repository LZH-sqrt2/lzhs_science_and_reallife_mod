package lzh.lzhs_science_and_reallife_mod.Main.Common.items;

import lzh.lzhs_science_and_reallife_mod.Main.Common.items.itemBase.AbstractFireExtinguisherItem;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ExtinguisherWater extends AbstractFireExtinguisherItem {
    public ExtinguisherWater() {
        super(1000);
    }


    @Override
    public void shootParticle(LivingEntity player) {
        Vec3 vec3 = player.getEyePosition();
        Level level = player.level();
        level.addParticle(ParticleTypes.SMOKE, vec3.x, vec3.y, vec3.z, vec3.x, vec3.y, vec3.z);
    }
}
