package notowers;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;

@Mod(name = "NoMoreNerdPoles", modid = "NoMoreNerdPoles", version = "1.0.0")
public class AntiNoobTower 
{
	@SubscribeEvent
	public void AntiNoobTowerEvent(PlaceEvent event)
	{
		if(!event.player.onGround && !event.player.capabilities.allowFlying)
			event.setCanceled(true);
	}
}
