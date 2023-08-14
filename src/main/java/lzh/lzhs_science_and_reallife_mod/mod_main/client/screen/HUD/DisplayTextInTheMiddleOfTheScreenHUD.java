package lzh.lzhs_science_and_reallife_mod.mod_main.client.screen.HUD;

import lzh.lzhs_science_and_reallife_mod.mod_main.items.notBeas.HandheldElementAnalyzer.HandheldElementAnalyzer;
import lzh.lzhs_science_and_reallife_mod.mod_main.util.ways.getBlockRegistryName;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DisplayTextInTheMiddleOfTheScreenHUD implements Renderable {
    private final Minecraft minecraft;

    public DisplayTextInTheMiddleOfTheScreenHUD() {
        this.minecraft = Minecraft.getInstance();
    }

    @Override
    public void render(GuiGraphics guiGraphics, int height, int width, float par) {
        guiGraphics.setColor(1, 1, 1, 1);
        guiGraphics.drawString(this.minecraft.font, Component.translatable("text.lzhs_science_and_reallife_mod.under_dev").getString(),
                width - 42, height - 75, 0Xffffff);
    }
}
