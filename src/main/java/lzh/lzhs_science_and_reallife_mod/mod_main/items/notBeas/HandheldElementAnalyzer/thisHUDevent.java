package lzh.lzhs_science_and_reallife_mod.mod_main.items.notBeas.HandheldElementAnalyzer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class thisHUDevent {
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderGameOverlayPost(RenderGuiOverlayEvent event) {
        int width = event.getWindow().getGuiScaledWidth();
        int height = event.getWindow().getGuiScaledHeight();
        int halfWidth = width /2 ;
        int halfHeight = height /2;
        Minecraft minecraft = Minecraft.getInstance();
        GuiGraphics guiGraphics = event.getGuiGraphics();

        if (minecraft.player != null) {
            Player player = minecraft.player;

            ItemStack item;
            if(player.getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof HandheldElementAnalyzer){
                item = player.getItemInHand(InteractionHand.OFF_HAND);
            }else if( player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof HandheldElementAnalyzer){
                item = player.getItemInHand(InteractionHand.MAIN_HAND);
            }else {
                return;
            }
            DisplayTextInTheMiddleOfTheScreenHUD hud = new DisplayTextInTheMiddleOfTheScreenHUD();
            hud.render(guiGraphics,halfHeight,halfWidth,0);
        }
    }
}
