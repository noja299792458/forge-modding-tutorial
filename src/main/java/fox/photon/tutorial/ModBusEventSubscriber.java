package fox.photon.tutorial;

import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.SoundEngineLoadEvent;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.registries.NewRegistryEvent;
import net.minecraftforge.registries.RegisterEvent;

public class ModBusEventSubscriber {
    @SubscribeEvent public void subscribeEvent(AddPackFindersEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(ModelEvent.BakingCompleted event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(ModelEvent.RegisterAdditional event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(ModelEvent.RegisterGeometryLoaders event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(EntityAttributeCreationEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(EntityAttributeModificationEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(EntityRenderersEvent.AddLayers event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(EntityRenderersEvent.CreateSkullModels event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(EntityRenderersEvent.RegisterLayerDefinitions event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(EntityRenderersEvent.RegisterRenderers event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(GatherDataEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(ModConfigEvent.Loading event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(ModConfigEvent.Reloading event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(FMLClientSetupEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(FMLCommonSetupEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(FMLConstructModEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(FMLDedicatedServerSetupEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(FMLLoadCompleteEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(InterModEnqueueEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(InterModProcessEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(NewRegistryEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterCapabilitiesEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterClientReloadListenersEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterClientTooltipComponentFactoriesEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterColorHandlersEvent.Block event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterColorHandlersEvent.ColorResolvers event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterColorHandlersEvent.Item event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterDimensionSpecialEffectsEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterEntitySpectatorShadersEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterGameTestsEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterGuiOverlaysEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterItemDecorationsEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterKeyMappingsEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterNamedRenderTypesEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterParticleProvidersEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterRecipeBookCategoriesEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterShadersEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RenderLevelStageEvent.RegisterStageEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(RegisterTextureAtlasSpriteLoadersEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(SoundEngineLoadEvent event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(TextureStitchEvent.Pre event){printEventName(event);}
    @SubscribeEvent public void subscribeEvent(TextureStitchEvent.Post event){printEventName(event);}

    private void printEventName(Event event){
        if(event instanceof RegisterEvent) {
            System.out.println(event.getClass().getName() + ", Key=" + ((RegisterEvent)event).getRegistryKey().toString());
        }else{
            System.out.println(event.getClass().getName());
        }
    }
}
