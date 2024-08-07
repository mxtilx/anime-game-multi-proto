package data.team.avatar.expedition

import data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface AvatarExpeditionGetRewardRsp {
    var expeditionInfoMap: Map<Long, data.team.avatar.expedition.AvatarExpeditionInfo>
    var retcode: Int
    @AddedIn(GI_2_5_0)
    var extraItemList: List<ItemParam>
    @AddedIn(GI_2_5_0)
    var itemList: List<ItemParam>
}
