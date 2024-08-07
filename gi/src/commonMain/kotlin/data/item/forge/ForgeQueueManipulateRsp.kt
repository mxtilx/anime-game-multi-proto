package data.item.forge

import data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface ForgeQueueManipulateRsp {
    var extraOutputItemList: List<ItemParam>
    var manipulateType: ForgeQueueManipulateType
    var outputItemList: List<ItemParam>
    var returnItemList: List<ItemParam>
    var retCode: Int
}
