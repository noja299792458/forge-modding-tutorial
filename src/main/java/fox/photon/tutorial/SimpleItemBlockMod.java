package fox.photon.tutorial;

import fox.photon.tutorial.block.TutorialBlock;
import fox.photon.tutorial.item.TutorialItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Constants.MOD_ID)
public class SimpleItemBlockMod {
    public SimpleItemBlockMod() {
        //step1 : DeferredRegisterの定義
        DeferredRegister<Item> defRegItems
                = DeferredRegister.create(ForgeRegistries.ITEMS,Constants.MOD_ID);
        DeferredRegister<Block> defRegBlocks
                = DeferredRegister.create(ForgeRegistries.BLOCKS,Constants.MOD_ID);

        //step2 : DeferredRegisterにアイテムを登録
        RegistryObject<Item> tutorialItem
                = defRegItems.register("tutorial_item",()->new TutorialItem());
        RegistryObject<TutorialBlock> tutorialBlock
                = defRegBlocks.register("tutorial_block",()->new TutorialBlock());
        RegistryObject<Item> tutorialBlockItem
                = defRegItems.register("tutorial_block",()->tutorialBlock.get().getBlockItem());

        //step3 : DeferredRegisterにModのEventBusを登録
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        defRegItems.register(modEventBus);
        defRegBlocks.register(modEventBus);
    }
}