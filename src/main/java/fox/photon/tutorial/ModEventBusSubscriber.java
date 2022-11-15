package fox.photon.tutorial;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;

@Mod.EventBusSubscriber(modid=Constants.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        /* 共通のセットアップイベント */
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        /* クライアントのセットアップイベント */
    }

    @SubscribeEvent
    public static void onServerSetup(FMLDedicatedServerSetupEvent event) {
        /* サーバーのセットアップイベント */
    }
}
