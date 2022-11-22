package fox.photon.tutorial;

import fox.photon.tutorial.block.TutorialBlock;
import fox.photon.tutorial.item.TutorialItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class SimpleItemBlockMod {

    private final DeferredRegister<Item> defRegItems = DeferredRegister.create(ForgeRegistries.ITEMS,Constants.MOD_ID);
    private final DeferredRegister<Block> defRegBlocks = DeferredRegister.create(ForgeRegistries.BLOCKS,Constants.MOD_ID);
    private TutorialItem tutorialItem = null;
    private TutorialBlock tutorialBlock = null;

    //コンストラクタ
    public SimpleItemBlockMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.register(this);
        modEventBus.register(new ModBusEventSubscriber());
        defRegItems.register(modEventBus);
        defRegBlocks.register(modEventBus);
    }

    //アイテムの登録イベント
    @SubscribeEvent
    public void registerItem(RegisterEvent event){
        if(event.getRegistryKey().equals(ForgeRegistries.BLOCKS.getRegistryKey())){
            tutorialBlock = new TutorialBlock();
            defRegBlocks.register("tutorial_block",()->tutorialBlock);
        }else if(event.getRegistryKey().equals(ForgeRegistries.ITEMS.getRegistryKey())){
            tutorialItem = new TutorialItem();
            defRegItems.register("tutorial_item",()->tutorialItem);
            defRegItems.register("tutorial_block",()->tutorialBlock.getBlockItem());
        }
    }
}